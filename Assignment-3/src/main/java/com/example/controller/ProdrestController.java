package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Product;
import com.example.service.PService;

@RestController
public class ProdrestController {

	@Autowired
	PService pservice;

	@RequestMapping(value = "/VIEW", method = RequestMethod.GET)
	public List<Product> getAllProduct() {
		return pservice.reterive();
	}

	@RequestMapping("/addproduct")
	public ModelAndView addproduct(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("addproduct");
		request.setAttribute("mode", "MODE_ADD");
		return mav;
	}

	@PostMapping("/save-product")
	public ModelAndView saveproduct(@ModelAttribute Product product, BindingResult bindingResult,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("addproduct");
		pservice.save(product);

		return mav;
	}

}
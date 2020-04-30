package com.example.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.example.exception.ProdException;

@RestControllerAdvice
public class ProdAd {
	@ExceptionHandler(value = ProdException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handleException(Exception exception, Model model) {
		ModelAndView mav = new ModelAndView("exceptionpage");
		model.addAttribute("ex", exception);
		return mav;
	}
}

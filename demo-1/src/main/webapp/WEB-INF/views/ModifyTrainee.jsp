<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Modify Trainee</h1>
       <form:form method="POST" action="/SpringMVCCRUDSimple/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="taineeid" /></td>
         </tr> 
         <tr>  
          <td>Trainee Name : </td> 
          <td><form:input path="traineename"  /></td>
         </tr>  
         <tr>  
          <td>Trainee Domain :</td>  
          <td><form:input path="traineedomain" /></td>
         </tr> 
         <tr>  
          <td>Trainee Location :</td>  
          <td><form:input path="traineelocation" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  

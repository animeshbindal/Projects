<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Enter Trainee Details</h1>

<form:form method="post" action="save">
<table>
<tr>
<td>Trainee Id:</td>
<td><form:input path="traineeid"/></td>
</tr>
<tr>
<td>Trainee Name:</td>
<td><form:input path="traineeName"/></td>
</tr>
<tr>
<td>Trainee Location:</td>
<td>
                 <div class="radio">
                      <label><input type="radio" name="optradio">Chennai</label>
                 </div>
            </td>
            <td><form:input path="traineeLocation"/></td>
<td>
                 <div class="radio">
                      <label><input type="radio" name="optradio">Bangalore</label>
                 </div>
            </td>
            <td><form:input path="traineeLocation"/></td>
            
<td>
                 <div class="radio">
                      <label><input type="radio" name="optradio">Pune</label>
                 </div>
            </td>
            <td><form:input path="traineeLocation"/></td>
<td>
                 <div class="radio">
                      <label><input type="radio" name="optradio">Mumbai</label>
                 </div>
            </td>
            <td><form:input path="traineeLocation"/></td>
            
            
            </tr>
  <tr>
  
  <td class = "select" placeholder="Please Select">Trainee Domain 
        <select>        
                <option value="JEE">JEE</option>
                <option value="FULL">FULL</option>
                
        </select>
    </td>
    <td><form:input path="traineeDomain"/></td>
    </tr>
    <tr>
    <td></td>
    <td><input type="submit" value="Save" /></td>  
    </tr>        

</table>


</form:form>
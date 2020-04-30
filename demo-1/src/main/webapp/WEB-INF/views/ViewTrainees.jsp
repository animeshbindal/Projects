    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>TraineeId</th><th>TraineeName</th><th>Trainee Location</th><th>Trainee Domain</th><th>Update</th><th>Delete</th></tr>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${Trainee.traineeid}</td>
    <td>${Trainee.traineename}</td>
    <td>${Trainee.traineedomain}</td>
    <td>${Trainee.traineelocation}</td>
    <td><a href="editTrainee/${Trainee.traineeid}">Edit</a></td>
    <td><a href="deleteTrainee/${Trainee.traineeid}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="AddaTrainee">Add New Employee</a>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%@include file="./base.jsp" %> 

</head>
<body>
    <div class="container mt-3">
       <div class="row">
          <h1 class="mb-3 container text-center">EMPLOYEE DETAILS</h1>
          <div class="container mb-3">
            
          </div>
          <table class="table">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">Eid</th>
			      <th scope="col">EName</th>
			      <th scope="col">DOJ</th>
			      <th scope="col">YOJ</th>
			      <th scope="col">Designation</th>
			      <th scope="col">Action</th>
			    </tr>
			  </thead>
			  <tbody>
			  <c:forEach items="${employees }" var="p">
			   <tr>
			      <th scope="row">${p.eid }</th>
			      <td>${p.eName }</td>
			      <td>${p.dOJ }</td>
			      <td>${p.yOJ }</td>
			      <td class="font-weight-bold">&#x20B9; ${p.designation }</td>
			      <td>
			      <a href="delete/${p.eid }"><i class="fa-solid fa-trash-can text-danger"></i></a>
			      <a href="update/${p.eid }"><i class="fa-solid fa-pen-nib text-primary"></i></a>
			      </td>
			    </tr>
			  </c:forEach>
			  </tbody>
			</table>
			<div class="container">
			  <a href="add-employee" class="btn text-left btn-outline-success mb-3">Add Employee</a>
			</div>
       </div>
    </div>
</body>
</html>
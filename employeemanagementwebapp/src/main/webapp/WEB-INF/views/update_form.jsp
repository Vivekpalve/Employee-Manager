<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>
   <div class="container mt-3">
        <div class="row">
            <div class="col-md-6 offset-md-3"> 
               <h1 class="text-center mb-3">UPDATE EMPLOYEE DETAILS</h1>
               <form action="${pageContext.request.contextPath }/handle-employee" method="post">
                 <div class="form-group">
                    <!-- <label for="name">Employee ID</label> -->
                    <input type ="hidden" class="form-control" id="eid" aria-describedby="emailHelp" name="eid" placeholder="Enter the Employee ID here" value="${emp.eid }">
                 </div>
                 <div class="form-group">
                    <label for="name">Employee Name</label>
                    <input type="text" class="form-control" id="eName" aria-describedby="emailHelp" name="eName" placeholder="Enter the product name here" value="${emp.eName }">
                 </div>
                 <div class="form-group">
                    <label for="name">Date Of Joining</label>
                    <input type="text" class="form-control" id="dOJ" aria-describedby="emailHelp" name="dOJ" placeholder="Enter the Date of joining here" value="${emp.dOJ }">
                 </div>
                 <div class="form-group">
                    <label for="name">Year Of Experience</label>
                    <input type="text" class="form-control" id="yOJ" aria-describedby="emailHelp" name="yOJ" placeholder="Enter Year of Experience here" value="${emp.yOJ }">
                 </div>
                 
                 <div class="form-group">
                   <label for="price">Designation</label>
                   <input type="text" placeholder="Enter Designation Here" name ="designation" class="form-control" id="designation" value="${emp.designation }">
                 </div>
                 <div class="container text-center">
                    <a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger"> Back</a>
                    <button type="submit" class="btn btn-primary">update</button>
                 </div>
                 
               </form>
            </div>
        </div>
    </div>
</body>
</html>
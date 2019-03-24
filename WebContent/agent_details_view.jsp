<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ page import="com.demo.model.Agents,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title><link rel="stylesheet" href="/css/index.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> 
<sx:head />
<s:head/>
</head>
<body>
		<nav class="navbar navbar-expand-lg bg-success text-white">
		<div class="collapse navbar-collapse" id="navbarText">
			<ul class="nav navbar-nav navbar-right mr-auto">
				<li class="nav-item nav-link disable" style="padding-right: 80px" style="padding-top: ">
					<h6>Welcome <s:property value="#session['adminuname']" /></h6>
				</li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="my-2 my-lg-0 nav-item">
				<form method="post" action="session_logout"> 
				<s:submit value="Logout" class="btn btn-outline-warning my-2 my-sm-0"></s:submit>
				</form>
				</li>
			</ul>
		</div>
	</nav>
		
		<s:set name="see_agent" value="condition" />
		
		<s:if test="%{#see_agent=='DATA_CHHE'}">
		
		<table class="table" style="margin-top: 2%; margin-bottom: 1%;">
		<tr style="color: red;">
				<th scope="col"><h4>Agend UID</h4></th>
				<th scope="col"><h4>Agent First Name</h4></th>
				<th scope="col"><h4>Agent Middle Initial</h4></th>
				<th scope="col"><h4>Agent Last Name</h4></th>
				<th scope="col"><h4>Gender</h4></th>
				<th scope="col"><h4>Email</h4></th>
				<th scope="col"><h4>Date</h4></th>
				<th scope="col"><h4>Contact no</h4></th>
				<th scope="col"><h4>Address</h4></th>
				<th scope="col"><h4>City</h4></th>
				<th scope="col"><h4>State</h4></th>
				<th scope="col"><h4>Zipcode</h4></th>
			</tr>
		<s:iterator value="agentlist">
		<tr>
					<th scope="row"><s:property value="uid" /></th>
					<th><s:property value="fname" /></th>
					<th><s:property value="mname" /></th>
					<th><s:property value="lname" /></th>
					<th><s:property value="gender" /></th>
					<th><s:property value="email" /></th>
					<th><s:property value="date" /></th>
					<th><s:property value="contact" /></th>
					<th><s:property value="address" /></th>
					<th><s:property value="city" /></th>
					<th><s:property value="state" /></th>
					<th><s:property value="zipcode" /></th>
				</tr>
		</s:iterator>
		</table>
		</s:if>
		<s:else>
		<h3 style="margin-top: 5%; text-align: center;">I don't see any agent, please add some</h3>
	</s:else>
</body>
</html>
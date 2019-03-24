<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Agent Registration Page</title>
<link rel="stylesheet" href="/css/index.css">
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
					<button class="btn btn-outline-warning my-2 my-sm-0" type="submit">Logout</button>
				</li>
			</ul>
		</div>
	</nav>
	<div style="padding: 15% 50% 10% 30%;width: 150%">	
		<h1>Welcome to Agent Registration Page</h1>
		<s:form method="post" action="agent_final_register">
		<s:textfield label="Agent Login Unique Id" placeholder="Id" name="al.uid" class="form-control"/>
		<s:textfield label="Agent Password" placeholder="Password" name="al.password" class="form-control"/>
		<s:submit value="Agent Sign up" class="btn btn-success"/>
		</s:form>
	</div>
</body>
</html>
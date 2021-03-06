<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> 
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

<div style="padding: 15% 40% 10% 40%; width: 100%">
<a href="<s:url value="agent_details_insert.jsp"/>">New Agent Registration</a><br>
<a href="<s:url value=""/>">New Policy Holder Registration</a><br>
<a href="<s:url action="agent_details_view"/>">View Registered Agents</a><br>
<a href="<s:url value=""/>">View Registered Agents Login Credentials</a><br>
<a href="<s:url value=""/>">View Registered Policy Holder</a><br>
<a href="<s:url value=""/>">View Claim Info</a><br>
</div>
</body>
</html>
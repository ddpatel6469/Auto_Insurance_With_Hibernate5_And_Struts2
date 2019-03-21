<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<s:url value="/css/index.css"/>"/> 
<s:head />
</head>
<body>
	<s:form method="post" action="loginadmin">
	<s:textfield label="Admin Name" placeholder="Name" name="ia.admin_name"/>
	<s:password label="Admin Password" placeholder="Password" name="ia.admin_password"/>
	<s:submit cssClass="mycheckbox" value="Login"/>
	</s:form>
	<p>If you don't have account then below button</p>
	<h4><a href="<s:url value="admin_signup.jsp"/>">Sign up</a></h4>
</body>
</html>
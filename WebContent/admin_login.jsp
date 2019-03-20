<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form method="post" action="loginadmin">
		<s:textfield key="Name" name="ia.admin_name"/>
		<s:textfield key="Password" name="ia.admin_password"/>
		<s:submit label="submit" value="login"/>
	</s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Agent Registration Page</title>
</head>
<body>	
		<h1>Welcome to Agent Registration Page</h1>
		<s:form method="post" action="">
		<s:textfield label="Agent First Name" placeholder="First Name" name=""/>
		<s:textfield label="Agent Middle Initial" placeholder="Middle Initial" name=""/>
		<s:textfield label="Agent Last Name" placeholder="Last Name" name=""/>
		<s:textfield type="email" label="Agent Email Id" placeholder="Email Id" name=""/>
		<sx:datetimepicker name="" label="Format (dd-MMM-yyyy)" displayFormat="dd-MMM-yyyy" 
		value="%{'2010-01-01'}"/>
		<s:select label="What's your favor search engine" 
		headerKey="-1" headerValue="Select Search Engines" list="a_gender" name="gender" 
		value="defaultSearchEngine" />
		<s:textfield label="Agent Contact No" placeholder="Contact No" name=""/>
		<s:textfield label="Agent Address" placeholder="Address" name=""/>
		<s:textfield label="Agent City" placeholder="City" name=""/>
		<s:textfield label="Agent State" placeholder="State" name=""/>
		<s:textfield label="Agent Zip Code" placeholder="Zip Code" name=""/>
		
		<s:submit cssClass="mycheckbox" value="Sign up"/>
		</s:form>
</body>
</html>
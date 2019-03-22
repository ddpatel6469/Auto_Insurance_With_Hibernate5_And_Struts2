<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Agent Registration Page</title>
<sx:head />
<s:head/>
</head>
<body>	
		<h1>Welcome to Agent Registration Page</h1>
		<s:form method="post" action="agent_register">
		<s:textfield label="Agent First Name" placeholder="First Name" name="a.fname"/>
		<s:textfield label="Agent Middle Initial" placeholder="Middle Initial" name="a.mname"/>
		<s:textfield label="Agent Last Name" placeholder="Last Name" name="a.lname"/>
		<s:textfield type="email" label="Agent Email Id" placeholder="Email Id" name="a.email"/>
		<sx:datetimepicker name="a.date" label="Agent DOB" displayFormat="dd-MM-yyyy"/>
		<s:textfield label="Agent Contact No" placeholder="Contact No" name="a.contact"/>
		<s:textfield label="Agent Address" placeholder="Address" name="a.address"/>
		<s:textfield label="Agent City" placeholder="City" name="a.city"/>
		<s:textfield label="Agent State" placeholder="State" name="a.state"/>
		<s:textfield label="Agent Zip Code" placeholder="Zip Code" name="a.zipcode"/>
		
		<s:submit cssClass="mycheckbox" value="Sign up"/>
		</s:form>
</body>
</html>
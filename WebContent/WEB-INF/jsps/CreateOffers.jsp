<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sf:form method="post" action="${pageContext.request.contextPath}/doCreate" commandName="offer">
<table class="formtable">
<tr><td class="label">Name</td><td><sf:input class="control" path="name" name="name" type="text"/><br/><sf:errors path="name" cssClass="error"/></td></tr>
<tr><td class="label">Email</td><td><sf:input class="control" path="email" name="email" type="text"/><br/><sf:errors path="email" cssClass="error"/></td></tr>
<tr><td class="label">Offer</td><td><sf:textarea class="control" rows="5" cols="17" path="text" name="text"/><br/><sf:errors path="text" cssClass="error"/></td></tr>
<tr><td class="label"></td><td><input class="control" value="Create" type="submit"/></td></tr>
</table>
</sf:form>
</body>
</html>
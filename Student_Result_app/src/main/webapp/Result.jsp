<%@page import="com.ni.project.ResultBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%ResultBean tb=(ResultBean)request.getAttribute("result"); %>

HallTicketNo:<%= tb.getRollNo() %><br>
Name:<%= tb.getName() %>
C:<%= tb.getC() %>
Cpp:<%= tb.getCpp() %>
java:<%= tb.getJava() %>
</body>
</html>
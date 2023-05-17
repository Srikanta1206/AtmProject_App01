<%@page import="com.ni.project.ResultBean"%>

<!DOCTYPE html>
<html>
<body>
<% com.ni.project.ResultBean rb=(com.ni.project.ResultBean)request.getAttribute("data"); %>
HallTicketNo:<%= rb.getRollNo() %><br>
Name:<%= rb.getName() %>
C:<%= rb.getC() %>
Cpp:<%= rb.getCpp() %>
java:<%= rb.getJava() %>
</body>
</html>
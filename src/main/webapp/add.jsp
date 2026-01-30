<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
errorPage="error.jsp"

%>

<%!
    int add(int a, int b) {
        return a / b;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>

<%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    int sum = add(num1, num2);
%>

Sum is: <%= sum %>

</body>
</html>

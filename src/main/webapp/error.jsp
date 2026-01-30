<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>

<h2 style="color:red;">Something went wrong</h2>
<p>Error: <%= exception.getMessage() %></p>

</body>
</html>

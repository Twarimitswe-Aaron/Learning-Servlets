<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>

<form action="calculate" method="post">
    First number: <input type="text" name="num1"><br>
    Second number: <input type="text" name="num2"><br>

    <input type="radio" name="operation" value="add"> Add <br>
    <input type="radio" name="operation" value="multiply"> Multiply <br>
    <input type="radio" name="operation" value="divide"> Divide <br>
    <input type="radio" name="operation" value="subtract"> Subtract <br>

    <input type="submit">
</form>


<p>Result: ${result}</p>

</body>
</html>

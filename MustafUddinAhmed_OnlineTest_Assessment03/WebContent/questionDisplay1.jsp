<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


${allQuestions.get(0).getQuestions()};

<br>
<form action="questionDisplay2.jsp">
<input type="radio" name="radio1" value="yes">Yes <br>

<input type="radio" name="radio1" value="no">No
<br>
<input type="submit" value="Next">

</form>


</body>
</html>
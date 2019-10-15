<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


${allQuestions.get(1).getQuestions()};

<br>
<form action="questionDisplay3.jsp">

<input type="radio" name="radio2" value="yes">Yes <br>

<input type="radio" name="radio2" value="no">No
<br>
<input type="submit" value="Next">

</form>
<br>

<form action="questionDisplay1.jsp">
<input type="submit" value="Back">
</form>

<%String result1; 
result1= request.getParameter("radio1");

HttpSession session2= request.getSession();
session2.setAttribute("result1", result1);

%>

</body>
</html>
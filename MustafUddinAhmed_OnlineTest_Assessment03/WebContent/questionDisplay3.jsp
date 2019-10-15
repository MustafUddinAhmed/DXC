<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


${allQuestions.get(2).getQuestions()};

<br>
<form action="ResultServlet">
<input type="radio" name="radio3" value="yes">Yes <br>

<input type="radio" name="radio3" value="no">No
<br>
<input type="submit" value="Submit">

</form>
<br>
<form action="questionDisplay2.jsp">
<input type="submit" value="Back">
</form>
<%String result2; 
result2= request.getParameter("radio2");

HttpSession session2= request.getSession();
session2.setAttribute("result2", result2);

%>

</body>
</html>
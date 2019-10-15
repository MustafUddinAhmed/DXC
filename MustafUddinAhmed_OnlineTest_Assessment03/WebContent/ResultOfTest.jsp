<%@page import="com.dxc.assessment.model.QuestionsModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
Your Score is=

${marks*33.333}

<br>

As you have corrected ${marks} no. of questions out of 3

<br>
<br>
And Your response is as follows:

<br>
${allQuestions.get(0).getQuestions()} : ${result1}; <br>
${allQuestions.get(1).getQuestions()} : ${result2}; <br>
${allQuestions.get(2).getQuestions()} : ${result3}; <br>


<br>

And Correct Answer is: 
<br>
${allQuestions.get(0).getQuestions()} : ${allQuestions.get(0).getAnswers()};<br>
${allQuestions.get(1).getQuestions()} : ${allQuestions.get(1).getAnswers()};<br>
${allQuestions.get(2).getQuestions()} : ${allQuestions.get(2).getAnswers()};<br>



</body>
</html>
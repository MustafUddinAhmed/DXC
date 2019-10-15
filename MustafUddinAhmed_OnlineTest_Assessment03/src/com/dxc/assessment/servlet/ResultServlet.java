package com.dxc.assessment.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.assessment.model.QuestionsModel;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   int marks=0;
		String result3= request.getParameter("radio3");
		HttpSession session2= request.getSession();
		String result1= (String) session2.getAttribute("result1");
		String result2= (String) session2.getAttribute("result2");
		
		System.out.println(result1+" "+result2+" "+result3);
		
		List<QuestionsModel> allQuestions= (List<QuestionsModel>) session2.getAttribute("allQuestions");
		
		System.out.println(allQuestions);
		
		if(allQuestions.get(0).getAnswers().equals(result1)) {
			marks++;
		}
		if(allQuestions.get(1).getAnswers().equals(result2)) {
			marks++;
		}
		if(allQuestions.get(2).getAnswers().equals(result3)) {
			marks++;
		}
		
		session2.setAttribute("marks", marks);
		session2.setAttribute("result3", result3);
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("ResultOfTest.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

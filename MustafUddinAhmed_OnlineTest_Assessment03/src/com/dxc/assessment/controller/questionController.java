package com.dxc.assessment.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.assessment.dao.questionDAO;
import com.dxc.assessment.dao.questionDAOImpl;
import com.dxc.assessment.model.QuestionsModel;

/**
 * Servlet implementation class questionController
 */
@WebServlet("/questionController")
public class questionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	List<QuestionsModel> allQuestions;
	int c;

    public questionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		questionDAO dao= new questionDAOImpl();
		allQuestions=dao.getQuestion();
		
//		System.out.println(allQuestions);
		
		HttpSession session= request.getSession();
		session.setAttribute("allQuestions", allQuestions);
//		
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("questionDisplay1.jsp");
		dispatcher.forward(request, response);
//		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

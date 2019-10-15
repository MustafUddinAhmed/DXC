package com.dxc.assessment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.dxc.assessment.dbcon.DBConnection;
import com.dxc.assessment.model.QuestionsModel;

public class questionDAOImpl implements questionDAO {

	Connection connection= DBConnection.getConnection();
//	String question;
	List<QuestionsModel> allQuestions= new ArrayList<QuestionsModel>();
	
	Random random = new Random();
	int rand;
			
	@Override
	
	public List<QuestionsModel> getQuestion() {
		// TODO Auto-generated method stub
		
		try {
			Statement statement= connection.createStatement();
					
			
//			ResultSet res = statement.executeQuery("select * from questions order by rand() limit 1;");
			for(int i=0; i<3;i++) 
			{
				
			rand=(int) (1+Math.random()*10);
			
			System.out.println("print rand :"+rand);
			PreparedStatement preparedStatement = connection.prepareStatement("select * from questions where serialNumber = ?");
			preparedStatement.setInt(1, rand);
			ResultSet res= preparedStatement.executeQuery();
			
			QuestionsModel model= new QuestionsModel();
			res.next();
			model.setSerialnumbers(res.getInt(1));
			model.setQuestions(res.getString(2));
			model.setAnswers(res.getString(3));
			
			allQuestions.add(model);
			System.out.println(allQuestions);
			
			}
		}
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allQuestions;
	}

}

package com.dxc.assessment.dao;

import java.util.List;

import com.dxc.assessment.model.QuestionsModel;

public interface questionDAO {

	public List<QuestionsModel> getQuestion();
	public int checkAnswer();
}

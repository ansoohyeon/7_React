package edu.kh.todo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.todo.model.dao.TodoDao;
import edu.kh.todo.model.dto.TodoMember;

@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	private TodoDao dao;

	@Override
	public int signup(TodoMember member) {
		return dao.signup(member);
	}

}
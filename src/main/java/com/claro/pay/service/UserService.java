package com.claro.pay.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.claro.pay.model.User;
import com.claro.pay.repository.UserRepository;

@ApplicationScoped
@Transactional
public class UserService {

	@Inject
	UserRepository repository;
	
	public List<User> listAll() {
		return repository.listAll();
	}
	
	public void persist(User user) {
		repository.persist(user);
	}
}

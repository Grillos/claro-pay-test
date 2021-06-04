package com.claro.pay.repository;

import javax.enterprise.context.ApplicationScoped;

import com.claro.pay.model.User;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class UserRepository implements PanacheMongoRepository<User> {

}

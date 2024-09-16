package com.joaov7r.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaov7r.workshopmongodb.domain.User;
import com.joaov7r.workshopmongodb.dto.UserDTO;
import com.joaov7r.workshopmongodb.repository.UserRepository;
import com.joaov7r.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRep;
	
	public List<User> findAll(){
		return userRep.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = userRep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
	}
	
	public User insert(User obj) {
		return userRep.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}

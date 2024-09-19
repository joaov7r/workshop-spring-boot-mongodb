package com.joaov7r.workshopmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaov7r.workshopmongodb.domain.Post;
import com.joaov7r.workshopmongodb.repository.PostRepository;
import com.joaov7r.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository userRep;
	
	public Post findById(String id) {
		Optional<Post> obj = userRep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
	}
}

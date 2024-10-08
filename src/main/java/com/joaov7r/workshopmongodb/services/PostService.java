package com.joaov7r.workshopmongodb.services;

import java.util.Date;
import java.util.List;
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
	
	public List<Post> findByTitle(String text){
		return userRep.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 *60 *60 *1000);
		return userRep.fullSearch(text, minDate, maxDate);
	}
}

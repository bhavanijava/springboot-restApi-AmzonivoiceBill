package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Amazon;

@Repository
public interface AmazonRepo extends CrudRepository<Amazon, Integer> {

}

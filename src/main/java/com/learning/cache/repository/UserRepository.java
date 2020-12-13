package com.learning.cache.repository;

import com.learning.cache.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository //this is the annotation needed
// CrudRepository is the shorthand for basically doing basic crud actions with that table.
public interface UserRepository extends CrudRepository<User, Long> {

}

package com.rao.configuration;

/**
 * Created by Vinay on 7/23/2015.
 */import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByLogin(String login);
}

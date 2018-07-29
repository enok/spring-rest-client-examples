package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;

import java.util.List;

/**
 * Created by enokj on 29/07/2018
 */
public interface ApiService {
    List<User> getUsers(Integer limit);
}

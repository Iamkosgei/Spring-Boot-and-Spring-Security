package com.iamkosgei.Spring.Boot.JPA.JWT.security;

import com.iamkosgei.Spring.Boot.JPA.JWT.models.MyUserDetails;
import com.iamkosgei.Spring.Boot.JPA.JWT.models.User;
import com.iamkosgei.Spring.Boot.JPA.JWT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = repository.findByEmail(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found" + username));
        return user.map(MyUserDetails::new).get();
    }
}

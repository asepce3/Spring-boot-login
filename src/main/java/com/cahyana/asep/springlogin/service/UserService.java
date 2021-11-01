package com.cahyana.asep.springlogin.service;

import com.cahyana.asep.springlogin.dto.UserRegistrationDto;
import com.cahyana.asep.springlogin.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}

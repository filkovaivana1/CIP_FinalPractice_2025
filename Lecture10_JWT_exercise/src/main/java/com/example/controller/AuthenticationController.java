package com.example.controller;

import com.example.dto.LoginUserDto;
import com.example.dto.RegisterUserDto;
import com.example.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private InMemoryUserDetailsManager userDetailsManager;


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginUserDto request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        UserDetails userDetails = userDetailsManager.loadUserByUsername(request.getEmail());
        String token = jwtService.generateToken(userDetails);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/signup")
    public ResponseEntity<String> register(@RequestBody RegisterUserDto request) {
        System.out.println("PPP entered");
        UserDetails user = User.builder()
                .username(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles("USER")
                .build();
        userDetailsManager.createUser(user);
        String token = jwtService.generateToken(user);
        return ResponseEntity.ok(token);
    }
}

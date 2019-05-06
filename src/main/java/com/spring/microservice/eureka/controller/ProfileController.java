package com.spring.microservice.eureka.controller;

import com.spring.microservice.eureka.exceptions.ProfileNotFoundException;
import com.spring.microservice.eureka.model.Profile;
import com.spring.microservice.eureka.repository.ProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    
    @Autowired
    private ProfileRepository repository;

    @PostMapping
    public Profile createProfile(@RequestBody Profile profile) {
        Profile newProfile = new Profile(profile.getId(), profile.getName(), profile.getDob(), profile.getOccupation());

        return repository.save(newProfile);
    }

    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable("id") Long id) {
        return repository.findById(id)
        .orElseThrow(() -> new ProfileNotFoundException("Profile with specified user id not found"));
    }

}
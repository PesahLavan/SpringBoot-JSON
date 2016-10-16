package com.pesahlavan.example.hibernate.controller;

import com.google.common.collect.Lists;
import com.pesahlavan.example.hibernate.entity.Manager;
import com.pesahlavan.example.hibernate.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    
    @Autowired
    private ManagerRepository managerRepository;

    @RequestMapping("/")
    public List<Manager> defaultUrl(){
        return 	Lists.newArrayList(managerRepository.findAll());
    }



}

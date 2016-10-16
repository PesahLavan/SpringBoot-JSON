package ru.javabegin.example.hibernate.controller;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javabegin.example.hibernate.entity.Manager;
import ru.javabegin.example.hibernate.repository.ManagerRepository;

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

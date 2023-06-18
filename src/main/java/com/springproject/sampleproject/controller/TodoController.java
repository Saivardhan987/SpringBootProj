package com.springproject.sampleproject.controller;

import com.springproject.sampleproject.Model.TodoItem;
import com.springproject.sampleproject.repo.TodoRepo;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;
//    @GetMapping
//    public List<TodoItem> findAll(){
//        return todoRepo.findAll();
//    }
    @PostMapping
    public TodoItem save(@NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
//    @PutMapping
//    public  TodoItem update(@NotNull @RequestBody TodoItem todoItem){
//        return todoRepo.save(todoItem);
//    }
}

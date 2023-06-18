package com.springproject.sampleproject.repo;

import com.springproject.sampleproject.Model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem,Long> {
}

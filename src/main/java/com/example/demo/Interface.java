package com.example.demo;



import org.springframework.data.repository.CrudRepository;
import com.example.demo.Student;


public interface Interface extends CrudRepository <Student, Integer> {
    Student findById(int id);
  
}

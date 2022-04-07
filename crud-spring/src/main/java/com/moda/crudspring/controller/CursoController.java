package com.moda.crudspring.controller;

import java.util.List;

import com.moda.crudspring.model.Course;
import com.moda.crudspring.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CursoController {

    private final CourseRepository courseRepository;
    
    @GetMapping
    public @ResponseBody List<Course> list(){
        return this.courseRepository.findAll();
    }

}

package com.example.springrest.dto;


import com.example.springrest.entity.Course;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {

    private String title;

    private String description;


}

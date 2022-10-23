package com.example.springrest.service;

import com.example.springrest.dto.CourseDto;
import com.example.springrest.entity.Course;
import com.example.springrest.mapper.CourseMapper;
import com.example.springrest.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;


    public List<CourseDto> getAllCourses() {
        List<CourseDto> allCourse = courseRepository.findAll()
                .stream()
                .map(course -> CourseMapper.toDto(course))
                .collect(Collectors.toList());
        return allCourse;

    }

    public CourseDto getCourseById(Long id) {
        return CourseMapper.toDto(courseRepository.getReferenceById(id));
    }


    public Course saveCourse(CourseDto courseDto) {
        Course course = CourseMapper.toEntity(courseDto);
        Course save = courseRepository.save(course);
        return save;
    }

    public void deleteCourses(Long id) {
        courseRepository.deleteById(id);
    }


    public Course updateCourse(Course course) {
        Course courses = courseRepository.findById(course.getId()).orElse(null);
        courses.setDescription(course.getDescription());
        courses.setTitle(course.getTitle());

        return courseRepository.save(courses);
    }
}

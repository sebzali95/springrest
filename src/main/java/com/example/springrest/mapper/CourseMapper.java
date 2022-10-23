package com.example.springrest.mapper;
import com.example.springrest.dto.CourseDto;
import com.example.springrest.entity.Course;
public class CourseMapper {

    public static CourseDto toDto(Course course) {
        CourseDto courseDto = new CourseDto();
        courseDto.setTitle(course.getTitle());
        courseDto.setDescription(course.getDescription());

        return courseDto;
    }

    public static Course toEntity(CourseDto courseDto) {
        Course course = new Course();
        course.setTitle(courseDto.getTitle());
        course.setDescription(courseDto.getDescription());

        return course;
    }

}

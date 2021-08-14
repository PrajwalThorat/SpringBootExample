package org.stackroute.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.stackroute.springBoot.entity.Course;
import org.stackroute.springBoot.service.CourseDao;

@RestController
public class Controller {

	@Autowired
	private CourseDao courseDao;
	
	//get courses
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseDao.getAllCouses();
	}
	
	@GetMapping("/courses/{coursesId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseDao.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseDao.addCourse(course);
	}
}


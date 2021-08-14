package org.stackroute.springBoot.service;

import java.util.List;

import org.stackroute.springBoot.entity.Course;

public interface CourseDao {
	
	public List<Course> getAllCouses();
	
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
}

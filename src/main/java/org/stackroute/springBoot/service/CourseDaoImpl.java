package org.stackroute.springBoot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.stackroute.springBoot.entity.Course;


@Service
public class CourseDaoImpl implements CourseDao {
	
	
	List<Course> list;
	
	public CourseDaoImpl() {
		list = new ArrayList<>();
		list.add(new Course(101, "Java", "Java is Object Orinted Language"));
		list.add(new Course(102, "Python", "Python is a Open Source"));
		list.add(new Course(103, "HTML", "Hyper Text MarkUp Language"));
	}

	@Override
	public List<Course> getAllCouses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for (Course course : list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}

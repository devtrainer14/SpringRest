package com.SpringRest.SpringRest.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringRest.SpringRest.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list ; 
	
	public CourseServiceImpl() {
		// TODO Auto-generated constructor stub
		// DAO layer : will be used for database connectivity
		
		list = new ArrayList<Course>();
		
		list.add(new Course(202, "Android", "Android Course"));
		list.add(new Course(203, "Iphone", "Iphone Course"));
		list.add(new Course(204, "Python", "Python Course"));
		list.add(new Course(205, "Java", "Java Course"));
		list.add(new Course(206, "SQA", "SQA Course"));
	}

	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		
		Course c = null;
		
		for(Course c1 : list )
		{
			if(c1.getId() == courseId) {
				c = c1;
				break;
			}
		}
		return c;
	}

	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
		list.add(course);
		return null;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
		list.add(course);
		return null;
	}

	public Course delCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c = null;
		
		for(Course c1 : list )
		{
			if(c1.getId() == courseId) {
				c = c1;
				break;
			}
		}
		return c;
	}

	
	

}

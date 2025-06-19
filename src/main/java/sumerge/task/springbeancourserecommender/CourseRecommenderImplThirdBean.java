package sumerge.task.springbeancourserecommender;

import sumerge.task.springbeancourserecommender.Model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRecommenderImplThirdBean implements CourseRecommender {
    @Override
    public List<Course> recommend() {
        Course course1=new Course(1,"Checker Course","Checker Course Description",3);
        Course course2=new Course(2,"Checker Course","Checker Course Description",2);
        ArrayList<Course> courses=new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);
        return courses;
    }
}

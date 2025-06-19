package sumerge.task.springbeancourserecommender;


import sumerge.task.springbeancourserecommender.Model.Course;

import java.util.List;

public interface CourseRecommender {
    public List<Course> recommend();
}

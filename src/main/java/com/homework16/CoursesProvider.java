package com.homework16;

import java.util.List;

public interface CoursesProvider {
    List<Course> getCoursesBlocks();
    List<String> getCourses(List<Course> courseList);
}

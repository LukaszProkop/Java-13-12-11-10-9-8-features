package com.modernjava.functiolanPrograming;

import java.util.List;

@FunctionalInterface
public interface InstructorFactory {
    Instructor getInstructor(String name, int yearsOfExperience, String title,
                             String gender, boolean onlineCourses, List<String> courses);
}

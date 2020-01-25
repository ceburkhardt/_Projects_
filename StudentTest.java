package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class StudentTest {

    @Test
    void enrollCourse() {
        Course newCourse = new Course(1, "Math", 3, 1,"Cora");
        Student aStudent = new Student(1, "Cora");
        enrollCourse(newCourse);
        assertEquals(1, aStudent.getEnrolledCourses().size());
    }


}
package com.android.bignerdranch.gpa;


// this class represents every instance of a course in given result list
public class Course {
    private String courseCode;
    private String creditLoad;
    private String grade;


    public Course(String courseCode, String creditLoad, String grade) {
        this.courseCode = courseCode;
        this.creditLoad = creditLoad;
        this.grade = grade;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCreditLoad() {
        return creditLoad;
    }

    public void setCreditLoad(String creditLoad) {
        this.creditLoad = creditLoad;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

package com.courseManagementSys2;

public class Student extends User{
    private String[] myCourses;

    public String[] getMyCourses() {
        return myCourses;
    }

    public void setMyCourses(String[] myCourses) {
        this.myCourses = myCourses;
    }
}

package com.courseManagementSys2;

public class InstructorManager extends UserManager {
    public void addCourse(Instructer instructer){
        System.out.println(instructer.getUserName() +" Kullanıcı Adlı Eğitmenin Kursu Eklenmiştir.");
    }
    public void deleteCourse(Instructer instructer){
        System.out.println(instructer.getUserName() +" Kullanıcı Adlı Eğitmenin Kursu Silinmiştir.");
    }

}

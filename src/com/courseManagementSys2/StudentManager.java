package com.courseManagementSys2;

public class StudentManager extends  UserManager{
    public void enrollCourse(User user){
        System.out.println(user.getUserName()+ "Adlı Öğrenci Kursa Kayıt Olmuştur.");
    }
}

package com.courseManagementSys2;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setFirstName("Ulaş");
        student.setLastName("Öğrenci");
        student.setMyCourses(new String[]{"Kurs 1", "Kurs 2"});
        student.setEmail("student@kodlama.io");
        student.setMemberNumber("1");
        student.setMyMemberships("klasik");
        student.setCreditCardInfo("");
        student.setPassword("123456789");
        student.setUserName("Student1");

        Instructer instructer = new Instructer();
        instructer.setId(2);
        instructer.setFirstName("Ulaş");
        instructer.setLastName("Öğretmen");
        //student.setMyCourses(new String[]{"Kurs 1", "Kurs 2"});
        instructer.setEmail("instructer@kodlama.io");
        instructer.setMemberNumber("2");
        instructer.setMyMemberships("klasik");
        instructer.setCreditCardInfo("");
        instructer.setPassword("123456789");
        instructer.setUserName("instructer1");

        UserManager userManager = new UserManager();
        userManager.addUser(student);
        userManager.addUser(instructer);


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(instructer);


        StudentManager studentManager = new StudentManager();
        studentManager.enrollCourse(student);

    }
}

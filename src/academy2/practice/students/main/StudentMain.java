package academy2.practice.students.main;

import academy2.practice.students.service.StudentService;

public class StudentMain {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.run();
    }
}

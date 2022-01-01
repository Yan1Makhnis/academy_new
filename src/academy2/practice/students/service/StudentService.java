package academy2.practice.students.service;

import academy2.practice.students.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentService {

    public void run(){
        List<Student> arr = new ArrayList<>();
        for(int i = 0; i<10;i++){
            arr.add(setRandomStudent());
        }

        int size = arr.size();
        for (Student s :arr) {
            System.out.println(s);
        }
    }

    public Student setRandomStudent(){
        Random r = new Random();
        Student s = new Student("Алексей",r.nextInt(),r.nextInt(17),r.nextDouble(),r.nextBoolean());
        return s;
    }
}

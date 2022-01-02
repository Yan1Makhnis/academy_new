package academy2.practice.students.service;

import academy2.practice.students.dto.Student;
import academy2.practice.students.dto.StudentNames;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentService {

    public void run() {
        List<Student> arr = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arr.add(setRandomStudent());
        }

        int size = arr.size();
        for (Student s : arr) {
            System.out.println(s);
        }
    }

    public Student setRandomStudent() {
        Random r = new Random();
        String name = StudentNames.names[r.nextInt(100)];
        return new Student(name, r.nextInt(), r.nextInt(7, 18), r.nextDouble(0.0, 10.01), r.nextBoolean());

    }
}

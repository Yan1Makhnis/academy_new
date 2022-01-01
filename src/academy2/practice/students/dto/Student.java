package academy2.practice.students.dto;

public class Student {

    private int number; //	1.1 Порядковый номер (int)
    private String name; //	1.2 Имя (Строка размером от 3 до 10 русских символов)
    private int age; //возраст (7-17)
    private double mark; //оценка(0.0-10.0)
    private boolean ol; // признак участия в олимпиадах (bool).

    public Student() {
    }

    public Student(String name, int number, int age, double mark, boolean ol) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.ol = ol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isOl() {
        return ol;
    }

    public void setOl(boolean ol) {
        this.ol = ol;
    }

    @Override
    public String toString() {
        return "Student[" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                ", ol=" + ol +
                ']';
    }
}



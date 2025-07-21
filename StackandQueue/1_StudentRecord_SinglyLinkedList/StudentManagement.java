import java.util.Scanner;

class Student {
    int rollNumber, age;
    String name, grade;
    Student next;

    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentManagement {
    private Student head = null;

    public void addAtBeginning(Student newStudent) {
        newStudent.next = head;
        head = newStudent;
    }

    public void addAtEnd(Student newStudent) {
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    public void addAtPosition(Student newStudent, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(newStudent);
            return;
        }
        Student temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    public void deleteByRollNumber(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Student searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateGrade(int rollNumber, String newGrade) {
        Student s = searchByRollNumber(rollNumber);
        if (s != null) s.grade = newGrade;
    }

    public void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.addAtEnd(new Student(1, "Alice", 20, "A"));
        sm.addAtEnd(new Student(2, "Bob", 21, "B"));
        sm.displayAll();
        sm.updateGrade(1, "A+");
        sm.deleteByRollNumber(2);
        sm.displayAll();
    }
}
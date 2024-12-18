package _18HeapsAndPriorityQueue;

import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    int marks;
    String name;
    Student(int rno,int marks,String name){
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }
    public int compareTo(Student s){
        return this.rno-s.rno;
//        return (int) (this.marks-s.marks);
//        return this.name.charAt(0)-s.name.charAt(0);
//        return this.name.compareTo(s.name);
    }
}
public class CustomComparator {
    public static void print(Student[] s){
        for (Student student : s) System.out.println(student.name + " " + student.rno + " " + student.marks);
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[3];
        s[0] = new Student(1,71,"ac");
        s[1] = new Student(2,31,"ab");
        s[2] = new Student(3,79,"c");
        print(s);
        Arrays.sort(s);
        print(s);
    }
}

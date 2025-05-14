package com.harshit.lambdaPractice;

public class Student2 implements Comparable<Student2>{

    public int marks;
    public String name;
    public Student2(String name, int marks)
    {
        this.marks = marks;
        this.name=name;
    }
    public int compareTo(Student2 s)
    {
        if(this.name.compareTo(s.name)!=0)
            return this.name.compareTo(s.name);

        return this.marks-s.marks;
    }
}

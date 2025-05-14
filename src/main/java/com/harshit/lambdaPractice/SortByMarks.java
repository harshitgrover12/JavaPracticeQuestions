package com.harshit.lambdaPractice;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>
{
    public int compare(Student student1,Student student2)
    {
            return student1.marks-student2.marks;
    }
}

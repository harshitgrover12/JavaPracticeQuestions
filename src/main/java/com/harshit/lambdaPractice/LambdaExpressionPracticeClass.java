package com.harshit.lambdaPractice;

import java.util.Collections;
import java.util.List;

interface LambdaInterface{

    public int operation(int a,int b);

}

public class LambdaExpressionPracticeClass
{
    public List<Student> students;
    public List<Student2> students2;
    public LambdaExpressionPracticeClass(List<Student> students, List<Student2> students2)
    {
        this.students =students;
        this.students2=students2;
    }

    public void printSortingUsingComparatorSorting()
    {
        this.students.sort(new SortByMarks());
        System.out.println("Student1 sorting");
        for(Student s:this.students)
        {
            System.out.println("("+s.name+","+s.marks+")");
        }
    }

    public void printSortingUsingComparableSorting()
    {
        Collections.sort(this.students2);
        System.out.println("Student2 sorting");
        for(Student2 s:this.students2)
        {
            System.out.println("("+s.name+","+s.marks+")");
        }
    }


    public void performOperationUsingLambda(int a,int b)
    {
        LambdaInterface addSum = (x,y)->x+y;
        LambdaInterface multiply = (x,y)->x*y;
        LambdaInterface test =(x,y)->{return 'h'+x;};  //without return also it will work in the same way
        System.out.println(addSum.operation(a,b));
        System.out.println(multiply.operation(a,b));
        System.out.println(test.operation(a,b));

    }




}
package com.harshit;

import com.harshit.lambdaPractice.LambdaExpressionPracticeClass;
import com.harshit.lambdaPractice.Student;
import com.harshit.lambdaPractice.Student2;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Student> l = new ArrayList<>();
        l.add(new Student("Harshit", 100));
        l.add(new Student("Rohit", 30));
        l.add(new Student("Virat", 20));
        l.add(new Student("Ashwin", 50));

        List<Student2> l2 = new ArrayList<>();
        l2.add(new Student2("Harshit", 100));
        l2.add(new Student2("Rohit", 30));
        l2.add(new Student2("Virat", 20));
        l2.add(new Student2("Ashwin", 50));

        LambdaExpressionPracticeClass lambdaClass = new LambdaExpressionPracticeClass(l,l2);
        lambdaClass.performOperationUsingLambda(3,6);
        lambdaClass.printSortingUsingComparatorSorting();
        lambdaClass.printSortingUsingComparableSorting();
    }
}
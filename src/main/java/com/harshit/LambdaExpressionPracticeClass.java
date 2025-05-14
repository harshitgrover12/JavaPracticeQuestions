package com.harshit;

interface LambdaInterface{

    public int operation(int a,int b);

}

public class LambdaExpressionPracticeClass
{
    LambdaExpressionPracticeClass()
    {

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
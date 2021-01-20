package com.company;

public class NumberOfSteps {
    public int numberOfSteps (int num) {
        int stepsCount = 0;
        while(num!=0){ // loop until num not equals to '0'.
            if(num%2==0){ // if even divide with '0'.
                num=num/2;
                stepsCount++;
            } else{  // else subtract 1 from num.
                num = num-1;
                stepsCount++;
            }
        }
        return stepsCount;
    }

    public static void main(String[] args) {
        NumberOfSteps n = new NumberOfSteps();
        System.out.println(n.numberOfSteps(123));
    }

}

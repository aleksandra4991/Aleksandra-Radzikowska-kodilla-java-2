package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[]args){
        SimpleUser simpleUser=new SimpleUser("theForumUser");

        String result=simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test Ok");
        }
        else{
            System.out.println(("Error!"));
        }

        Calculator calculator=new Calculator(878,379);

        int resultOfAdding =calculator.add();

        if(resultOfAdding==1258) {
            System.out.println("Dodawanie działa ok");
        }
            else{
                System.out.println("Dodawanie działa nie ok");
            }


        int resultOfSubtracting =calculator.subtract();

        if(resultOfSubtracting==500) {
            System.out.println("Odejmowanie działa ok");
        }
            else{
                System.out.println("Odejmowanie działa nie ok");
            }
    }
}

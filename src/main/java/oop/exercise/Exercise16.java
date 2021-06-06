package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise16
{
    static Scanner input = new Scanner(System.in);

    public static String getAge() {
        System.out.print("What is your age? ");
        return input.nextLine();
    }
    public static void testDrive(String a) {
        int age = Integer.parseInt(a);
        String canDrive = "You are old enough to legally drive.";
        String cantDrive = "You are not old enough to legally drive.";
        String result = (age >= 16) ?  canDrive : cantDrive;
        System.out.print(result);
    }
    public static void main( String[] args )
    {
        String age = getAge();
        testDrive(age);
    }
}

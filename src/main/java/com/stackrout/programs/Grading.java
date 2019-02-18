package com.stackroute.practice3;

import java.util.Scanner;
public class Grading {

    public  String check(int stuGrades[], int numOfStudents )
    {
        for (int i=0; i<numOfStudents; i++)

            if(stuGrades[i]<0 || stuGrades[i]>100)
            {
                return "Error";
            }

        return "All marks are correct";
    }

}
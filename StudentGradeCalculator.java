package com.mycompany.studentgradecalculator;

import java.util.Scanner;

//---------------Task 2 - Student Grade Calculator----------------

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Enter the Number of Subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        
        System.out.println("Enter marks in each subject");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numSubjects ;
        System.out.println("Your result is here =>");
        System.out.println("Total Marks are:" + totalMarks);
        System.out.println("Average Percentage:" + averagePercentage + "%");

        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade:" + grade);
                
        
        scanner.close();
    }
    
    public static String calculateGrade(double percentage) {
        if(percentage>=90)
        {
           return "A+";
        }
        else if(percentage>=80)
        {
           return "A";
        }
        else if(percentage>=70)
        {
           return "B";
        }
        else if(percentage>=60)
        {
           return "C";
        }
        else if(percentage>=50)
        {
            return "D";
        }
        else
        {
          return "Can do better";  
        }
      }
    }

package com.bridgelabz.day3;
import java.util.Random;

public class Employeewage {




    private static final int Wage_per_hour = 20;
    private static final int Full_Day_hour = 8;

    private static final int Half_day_hour = 8;

    private static final int Is_Part_time = 2;

    private static final int Is_full_time = 3;

    private static final int Working_days_per_month = 20;

    private static final int Total_working_hours = 100;

    private static int getRno() {
        Random random = new Random();
        int rno = random.nextInt(4)+1;
        System.out.println(rno);
        return rno;
    }
    public static void main(String[] args) {
        int dieNumber = getRno();
        System.out.println(dieNumber);

        System.out.println("Welcome to EmployeeWage computation");
        int dailyEmployeeWage = 0;
        int daysCount = 0;
        int totalWagesPerMonth = 0;
        int totalHours = 0;
        while (daysCount <  Wage_per_hour &&  totalHours <= Total_working_hours) {
            int empPresent = (int) (Math.random() * 10) % 3;
            System.out.println("Total Hours:"+totalHours);
            switch (empPresent) {
                case Is_full_time:
                    dailyEmployeeWage = Wage_per_hour * Full_Day_hour ;
                    totalHours += Full_Day_hour ;
                    break;
                case Is_Part_time:
                    dailyEmployeeWage = Wage_per_hour * Half_day_hour;
                    totalHours += Half_day_hour;
                    break;
                default:
                    dailyEmployeeWage = 0;
            }
            System.out.println("Employee wage for Day #" + (daysCount+1) + " is " + dailyEmployeeWage);

            totalWagesPerMonth += dailyEmployeeWage;
            daysCount++;
        }

        System.out.println("Total Employee Wage for a month:" + totalWagesPerMonth);
    }


}
package com.mycompany.marquezlab2;
import java.util.Scanner;

public class MarquezLab2W7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Your name : ");
        String name = scanner.nextLine();
           if (name.trim().isEmpty()||name.matches("\\d+")) {
            System.out.println("Error input name please you dum dum");
            scanner.close();
            return;
            }
        System.out.print("Enter the total pages of the book: ");
        int totalPages = scanner.nextInt();
           if (totalPages <= 0 ){
            System.out.println("Invalid number of pages");
            scanner.close();
            return;
        }

        System.out.print("Enter the number of pages read so far: ");
        int pagesRead = scanner.nextInt();
        
        if (pagesRead > totalPages || pagesRead < 0){
            System.out.println("Error");
            scanner.close();
            return;
        }

        System.out.print("Enter the number of days you have been reading: ");
        int daysReading = scanner.nextInt();
        if (daysReading <= 0 ){
            System.out.println("Invalid number of days");
            scanner.close();
            return;
        }
        System.out.print("Enter the total days allotted for borrowing the book: ");
        int allottedDays = scanner.nextInt();
        if (allottedDays <= 0 ){
            System.out.println("Invalid number of days");
            scanner.close();
            return;
        }
        
        double percentageRead = ((double) pagesRead / totalPages) * 100;

        
        int remainingDays = allottedDays - daysReading;

        int remainingPages = totalPages - pagesRead;
        int pagesPerDayNeeded = 0;
        
        
        
        if (remainingDays > 0) {
            pagesPerDayNeeded =  remainingPages / remainingDays;
        }
    

        System.out.println("\n--- Library System Report ---");
        System.out.println("\n--- Welcome" + name + "!!!---");
        System.out.printf("1. Percentage of the book read: %.2f%%\n", percentageRead);
        System.out.println("2. Days remaining to return the book: " + remainingDays + " day(s)");
        
        if (remainingPages <= 0) {
            System.out.println("3. You have already finished the book! Great job!");
        } else if (remainingDays <= 0) {
            System.out.println("3. Your borrowing period is up or overdue! You need to return the book.");
        } else {
            System.out.printf("3. Pages to read every day to finish on time: %d pages/day\n", pagesPerDayNeeded);
        }

        scanner.close();
    }
}



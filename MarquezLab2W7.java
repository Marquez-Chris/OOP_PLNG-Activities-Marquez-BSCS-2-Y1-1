package com.mycompany.marquezlab2;
import java.util.Scanner;

public class MarquezLab2W7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the total pages of the book: ");
        int totalPages = scanner.nextInt();

        System.out.print("Enter the number of pages read so far: ");
        int pagesRead = scanner.nextInt();

        System.out.print("Enter the number of days you have been reading: ");
        int daysReading = scanner.nextInt();

        System.out.print("Enter the total days allotted for borrowing the book: ");
        int allottedDays = scanner.nextInt();

        
        double percentageRead = ((double) pagesRead / totalPages) * 100;

        
        int remainingDays = allottedDays - daysReading;

        int remainingPages = totalPages - pagesRead;
        double pagesPerDayNeeded = 0;
        
        if (remainingDays > 0) {
            pagesPerDayNeeded = (double) remainingPages / remainingDays;
        }
        int pagened = (int)pagesPerDayNeeded;

        System.out.println("\n--- Library System Report ---");
        System.out.printf("1. Percentage of the book read: %.2f%%\n", percentageRead);
        System.out.println("2. Days remaining to return the book: " + remainingDays + " day(s)");
        
        if (remainingPages <= 0) {
            System.out.println("3. You have already finished the book! Great job!");
        } else if (remainingDays <= 0) {
            System.out.println("3. Your borrowing period is up or overdue! You need to return the book.");
        } else {
            System.out.printf("3. Pages to read every day to finish on time: %.1f pages/day\n", pagened);
        }

        scanner.close();
    }
}


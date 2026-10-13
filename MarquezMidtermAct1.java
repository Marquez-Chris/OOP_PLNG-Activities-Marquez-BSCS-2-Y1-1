package com.mycompany.marquezmidtermact1;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MarquezMidtermAct1 {

    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);
        char choiceContinue;

        do {

            System.out.println("\nChoose the program you want to run");
            System.out.println("Number 1");
            System.out.println("Number 2");
            System.out.println("Number 3");
            System.out.println("Number 4");
            System.out.println("Number 5");
            System.out.println("Number 6");
            System.out.print("Enter choice (1-6): ");
            
            int choice = menuScanner.nextInt();

     
            switch (choice) {
                case 1:
                    Proj1(menuScanner);
                    break;
                case 2:
                    Proj2(menuScanner);
                    break;
                case 3:
                    Proj3(menuScanner);
                    break;
                case 4:
                    Proj4(menuScanner);
                    break;
                case 5:
                    Proj5();
                    break;
                case 6:   
                    Proj6();
                    break;
                default:
                    System.out.println("Invalid selection! Please choose between 1 and 5.");
            }

            // Loop continuation prompt
            System.out.print("\nDo you want to continue ? Y/N: ");
            choiceContinue = menuScanner.next().toUpperCase().charAt(0);

        } while (choiceContinue == 'Y');

        System.out.println("Program terminated. Goodbye!");
        menuScanner.close();
    }

    //1P
    public static void Proj1(Scanner user) {
        int[] arr = new int[10];
        int Countn = 0;
        int sumofp = 0;
        int countp = 0;

        System.out.println("Enter 10 Real Numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = user.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] >= 0) {
                sumofp += arr[i];
                countp += 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 0) {
                Countn += 1;
            }
        }
        int Minval = arr[0];
        for (int i = 0; i < 10; i++) {
            if (arr[i] < Minval) {
                Minval = arr[i];
            }
        }
        
        
        int ave = (countp > 0) ? (sumofp / countp) : 0;
        System.out.println("The Sum of all the positive numbers: " + sumofp);
        System.out.println("The Average of all the positive numbers: " + ave);
        System.out.println("The number of negatives are: " + Countn);
        System.out.println("The minimum value is: " + Minval);
    }

    //2P
    public static void Proj2(Scanner ussr) {
        double[] RArray = new double[8];

        System.out.println("Enter 8 integer numbers:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            RArray[i] = ussr.nextDouble();
        }

        double[] uniqueArray = Arrays.stream(RArray).distinct().toArray();

        System.out.println("\nOriginal Array: " + Arrays.toString(RArray));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

        if (uniqueArray.length < 2) {
            System.out.println("Cannot find second largest or second smallest elements because there are less than 2 unique numbers.");
        } else {
            Arrays.sort(uniqueArray);

            double secondSmallest = uniqueArray[1];
            double secondLargest = uniqueArray[uniqueArray.length - 2];

            System.out.println("The second smallest element is: " + secondSmallest);
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

    //3P
    public static void Proj3(Scanner user) {
        int n = 5;
        int[] arr = new int[n];

        System.out.print("Enter Data in Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = user.nextInt();
        }

        System.out.print("Stored Data in Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter position of Element to Delete: ");
        int pos = user.nextInt();

        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position!");
        } else {
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.print("New data in Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    //4P
    public static void Proj4(Scanner ussr) {
        System.out.print("Enter Size of Array : ");
        int size = ussr.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter any " + size + " elements in Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = ussr.nextInt();
        }

        System.out.print("Even Elements: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Odd Elements: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    //5P
    public static void Proj5() {
        int totalBlocks = 4;

        for (int i = 0; i < totalBlocks; i++) {
            System.out.print("*");

            for (int j = 0; j < i; j++) {
                System.out.print("A*");
            }
            System.out.print("\n");
        }
    }
    //6P
    public static void Proj6(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Registration Entry System ===");

        // 1. Generate the Baseline Record automatically using the Default Constructor
        System.out.println("\n[Generating Baseline default record...]");
        Student s1 = new Student();
        printStudentDetails(s1);

        // 2. Gather Dynamic User Inputs for the Parameterized Constructor
        System.out.println("\n[Please enter custom student details]");
        
        System.out.print("Enter Student Number: ");
        String inputNo = scanner.nextLine();

        System.out.print("Enter Student Full Name: ");
        String inputName = scanner.nextLine();
        Date inputDob = null;
        while (inputDob == null) {
            System.out.print("Enter Date of Birth Year (e.g. 2004): ");
            try {
                int year = Integer.parseInt(scanner.nextLine());
                Calendar cal = Calendar.getInstance();
                cal.set(year, Calendar.JANUARY, 1, 0, 0, 0);
                inputDob = cal.getTime();
            } catch (NumberFormatException e) {
                System.out.println("Invalid format! Please enter a valid numerical year.");
            }
        }

        // Safe loop to handle numeric inputs and apply the 20-280 constraint validation
        int inputPoints = 0;
        while (true) {
            System.out.print("Enter Entry Tariff Points (20 - 280): ");
            try {
                inputPoints = Integer.parseInt(scanner.nextLine());
                break; 
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry type! Please provide a valid integer value.");
            }
        }

        // Initialize the custom student object instance using your inputted fields
        Student s2 = new Student(inputNo, inputName, inputDob, inputPoints);

        // 3. Confirm Successful Instantiation Output
        System.out.println("\n[Successfully registered custom student record]");
        printStudentDetails(s2);

        // Output cumulative static tracker state via static getter method
        System.out.println("\n-------------------------------------------");
        System.out.println("Total Registered Instances (no Of Students): " + Student.getNoOfStudents());
        System.out.println("-------------------------------------------");

        scanner.close();
    }

    // Using getter methods to cleanly fetch and display individual records
    private static void printStudentDetails(Student student) {
        System.out.println("ID Number:     " + student.getStudentNo());
        System.out.println("Full Name:     " + student.getStudentName());
        System.out.println("Birth Date:    " + student.getDateOfBirth());
        System.out.println("Tariff Points: " + student.getTariffPoints());
    }
}
//Student
class Student {
    private static int noOfStudents = 0;

    private String studentNo;
    private String studentName;
    private Date dateOfBirth;
    private int tariffPoints;

    // Default Constructor using Setters instead of direct field assignment
    public Student() {
        setStudentNo("not known");
        setStudentName("not known");
        setTariffPoints(20);
        
        Calendar cal = Calendar.getInstance();
        cal.set(1995, Calendar.JANUARY, 1, 0, 0, 0);
        setDateOfBirth(cal.getTime());
        
        noOfStudents++; 
    }

    // Parameterized Constructor using Setters to apply data flow validation checks safely
    public Student(String studentNo, String studentName, Date dateOfBirth, int tariffPoints) {
        setStudentNo(studentNo);
        setStudentName(studentName);
        setDateOfBirth(dateOfBirth);
        setTariffPoints(tariffPoints); 
        noOfStudents++; 
    }

    // --- Standard Getters and Setters Architecture ---
    public static int getNoOfStudents() { return noOfStudents; }
    
    public String getStudentNo() { return this.studentNo; }
    public void setStudentNo(String studentNo) { this.studentNo = studentNo; }
    
    public String getStudentName() { return this.studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    
    public Date getDateOfBirth() { return this.dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    
    public int getTariffPoints() { return this.tariffPoints; }

    // Setter includes dynamic constraint validation matching your midterm lab task
    public void setTariffPoints(int tariffPoints) {
        if (tariffPoints >= 20 && tariffPoints <= 280) {
            this.tariffPoints = tariffPoints;
        } else {
            System.out.println("Integrity Check Warning: Out of bounds values (20-280). Defaulting to 20.");
            this.tariffPoints = 20;
        }
    }
}


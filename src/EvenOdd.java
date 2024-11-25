//import java.util.Scanner;
//
//public class EvenOdd {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int num = sc.nextInt();  // User se integer input lena
//
//        // Condition to check even or odd
//        if (num % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd number");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class LeapYear {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a year: ");
//        String yearInput = sc.nextLine();  // Input as string
//        int year = Integer.parseInt(yearInput);  // String ko integer mein convert karna
//
//        boolean isLeapYear = (year >= 1582) &&
//                ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
//
//        System.out.println(isLeapYear ? "Leap Year" : "Not a Leap Year");
//    }
//}
//
//import java.util.Scanner;
//
//public class SpringSeason {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter month (1-12): ");
//        int month = sc.nextInt();
//        System.out.print("Enter day (1-30): ");
//        int day = sc.nextInt();
//
//        boolean isSpring = (month == 2 && day >= 12) || (month == 3) || (month == 4 && day <= 11);
//
//        if (month < 1 || month > 12 || day < 1 || day > 30) {
//            System.out.println("Invalid input");
//        } else {
//            System.out.println(isSpring ? "True" : "False");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class MonthName {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter month number (1-12): ");
//        int month = sc.nextInt();
//
//        switch (month) {
//            case 1: System.out.println("January"); break;
//            case 2: System.out.println("February"); break;
//            case 3: System.out.println("March"); break;
//            case 4: System.out.println("April"); break;
//            case 5: System.out.println("May"); break;
//            case 6: System.out.println("June"); break;
//            case 7: System.out.println("July"); break;
//            case 8: System.out.println("August"); break;
//            case 9: System.out.println("September"); break;
//            case 10: System.out.println("October"); break;
//            case 11: System.out.println("November"); break;
//            case 12: System.out.println("December"); break;
//            default: System.out.println("Invalid month number");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class StudentGrade {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter percentage: ");
//        int percentage = sc.nextInt();
//
//        if (percentage >= 90) {
//            System.out.println("Grade A");
//        } else if (percentage >= 80) {
//            System.out.println("Grade B");
//        } else if (percentage >= 70) {
//            System.out.println("Grade C");
//        } else {
//            System.out.println("Grade D");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class LargestNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter three numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (a >= b && a >= c) {
//            System.out.println(a + " is the largest.");
//        } else if (b >= a && b >= c) {
//            System.out.println(b + " is the largest.");
//        } else {
//            System.out.println(c + " is the largest.");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class Discount {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter purchase amount: ");
//        double amount = sc.nextDouble();
//
//        double discount = (amount >= 500) ? amount * 0.20 : amount * 0.10;
//        System.out.println("Discount: " + discount);
//    }
//}
//
//import java.util.Scanner;
//
//public class ArithmeticOperations {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter two numbers: ");
//        double num1 = sc.nextDouble();
//        double num2 = sc.nextDouble();
//        System.out.print("Enter an operator (+, -, *, /): ");
//        char operator = sc.next().charAt(0);
//
//        switch (operator) {
//            case '+': System.out.println(num1 + num2); break;
//            case '-': System.out.println(num1 - num2); break;
//            case '*': System.out.println(num1 * num2); break;
//            case '/': System.out.println(num1 / num2); break;
//            default: System.out.println("Invalid operator");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class VowelOrConsonant {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 1: User se character input lena
//        System.out.println("Enter a character:");
//        char ch = scanner.next().charAt(0);  // char input lena
//
//        // Step 2: Switch statement se vowel ya consonant check karna
//        switch(ch) {
//            case 'a':  // Agar 'a' hai, vowel print karo
//            case 'e':  // Agar 'e' hai, vowel print karo
//            case 'i':  // Agar 'i' hai, vowel print karo
//            case 'o':  // Agar 'o' hai, vowel print karo
//            case 'u':  // Agar 'u' hai, vowel print karo
//                System.out.println(ch + " is a vowel.");
//                break;  // Vowel ke case ke baad exit kar jao
//            default:    // Agar koi vowel nahi hai, default case
//                System.out.println(ch + " is a consonant.");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class SeasonFromMonth {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 1: User se month number input lena
//        System.out.println("Enter the month number (1-12):");
//        int month = scanner.nextInt();  // Month number input
//
//        // Step 2: Switch statement se month number se season print karna
//        switch(month) {
//            case 12:   // December
//            case 1:    // January
//            case 2:    // February
//                System.out.println("Winter");
//                break;
//            case 3:    // March
//            case 4:    // April
//            case 5:    // May
//                System.out.println("Spring");
//                break;
//            case 6:    // June
//            case 7:    // July
//            case 8:    // August
//                System.out.println("Summer");
//                break;
//            case 9:    // September
//            case 10:   // October
//            case 11:   // November
//                System.out.println("Fall");
//                break;
//            default:   // Agar koi invalid month input ho
//                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
//        }
//    }
//}

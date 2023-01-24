//Date - 14 Jan 2023 Assignment
//Write a Java program to print the result of the following operations. Go to the editor
//   Test Data:
//   a. -5 + 8 * 6
//   b. (55+9) % 9
//   c. 20 + -3*5 / 8
//   d. 5 + 15 / 3 * 2 - 8 % 3
//   Expected Output :
//   43
//   1
//   19
//   13

// 2.Write a Java program that takes two numbers as input and display the product of two numbers.
//
// 3.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//
// 4.Write a Java program that takes a number as input and prints its multiplication table upto 10.
//
// 5.Write a Java program to print the area and perimeter of a circle.
//
// 6.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
//
// 7.Write a Java program to add two binary numbers.
//
// 8.Write a Java program to multiply two binary numbers.
//
// 9.Write a Java program to convert a decimal number to binary number.
//
// 10.Write a Java program to convert a binary number to decimal number.

//1.

class HelloWorld {
    public static void main(String[] args) {

        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println( 5 + 15 / 3 * 2 - 8 % 3);
     }
}

// 2.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.println("Enter first number = ");


    int a = sc.nextInt();
    System.out.println("Enter Second number = ");
    int b = sc.nextInt();

    System.out.println(a * b);

     }
}
//3.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.println("Enter first number = ");


    int a = sc.nextInt();
    System.out.println("Enter Second number = ");
    int b = sc.nextInt();

    System.out.println(a + b);
    System.out.println(a - b);
     System.out.println(a * b);
    System.out.println(a % b);

     }
}
// 4.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int i=0; i<=10; i++){

    System.out.println(a*i);
}
}
}
//5.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     System.out.println("Perimeter is " + 3.14 * 2 * a);
     System.out.println("Area is " + 3.14 * a * a);
}
}
//6.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter first number");
     int a = sc.nextInt();
     System.out.println("Enter Second number");
     int b = sc.nextInt();
     System.out.println("Enter Third number");
     int c = sc.nextInt();

     System.out.println("average of the numbers " + (a+b+c) / 3 );

}
}
//7.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     String a = sc.nextLine();
     String b = sc.nextLine();
     int a1=Integer.parseInt(a,2);
     int b1=Integer.parseInt(b,2);
     int sum=a1+b1;
     String ans=Integer.toBinaryString(sum);
     System.out.println(ans);
    }}

  //8.
  import java.util.*;
  class HelloWorld {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();
       String b = sc.nextLine();
       int a1=Integer.parseInt(a,2);
       int b1=Integer.parseInt(b,2);
       int product=a1*b1;
       String ans=Integer.toBinaryString(product);
       System.out.println(ans);
      }}

  //9.

  import java.util.*;
    class HelloWorld {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         String ans=Integer.toBinaryString(a);
         System.out.println(ans);
        }}


   //10.
  import java.util.*;
  class HelloWorld {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();

       int a1=Integer.parseInt(a,2);
       System.out.println(a1);
      }}

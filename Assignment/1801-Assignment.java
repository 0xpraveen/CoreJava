
//Q.2 Write a Java program to sum values of an array.

public class SumValues {

  public static void main(String[] args) {

    int arr[] = {12, 11, 23, 19, 99, 38, 90}; 

    int sum = 0;

    for (int i =0;i<arr.length;i++){

      sum += i;
}

    System.out.println("sum = " + sum); }
}


//3. Write a Java program to print the following grid. // Expected Output :


class Grid{

  public static void main(String[] args) {

    int i, j, input;
input =10;

    for(i = 1; i<=input; i++){ 
  
      for(j = 1; j<= input; j++){ 
    
        System.out.print("- ");

      }

      System.out.println("");

    }

  }

}


//4. Write a Java program to calculate the average value of array elements.

public class AverageElements { 
 
  public static void main(String[] args) {

    
    
    int[] numb = new int[]{20, 30, 25, 35, -16, 60, -100};

    int sum = 0;

    for(int i=0; i < numb.length ; i++){

      sum = sum + numb[i];
}

    double average = sum / numb.length; 
    
    System.out.println("Average= " + average); 
  }
}




//5. Write a Java program to test if an array contains a specific value.

public class SpecificValue{

  public static void main(String[] args) {

    int num=0;

    int[] arr = {153, 235,194,146,213, 158, 258, 154, 142, 235, 156, 265, 147, 246};

      

    int value=154;

    for(int i=0;i<arr.length;i++){ 
      if(arr[i]==value){ 
        System.out.println("true” );

 
         break;
}

                           else System.out.println("false” );
} }}
                                                   
                                                   
                                                   
                                                   
//6. Write a Java program to find the index of an array element.
                                                   
                                                   
                                                   
public class ArrayElement{

  public static void main(String[] args) { int num=0;
int[] arr = {
153, 235,194,146,213,
158, 258, 154, 142, 235,
156, 265, 147, 246};
int value=154;
for(int I=0;i<arr.length;i++){
if(arr[i]==value){ num=I+1;
break; }
}
System.out.println("present at position" + " "+ num); }
  
}
                                                   
                                                   
                                                   
// 8.Write a Java program to copy an array by iterating the array. import java.util.Arrays;
public class IteratingArrays{

  public static void main(String[] args) {

    int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    int[] newarr = new int[10];

    for(int i=0; i < arr.length; i++) {

 
      newarr[i] = arr[i];
} 
    System.out.println(Arrays.toString(newarr)); 
  }
}
                                                   
                                                   
                                                   
                                                   
// 9. Write a Java program to insert an element (specific position) into an array.
                                                   
                                                   
import java.util.Arrays;
public class SpecificPositions{

  public static void main(String[] args) {

    int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; int Ind = 2;

    int Val= 5;

    for(int i=arr.length-1; i > Ind; i--){

      arr[i] = arr[i-1];
}

    arr[Ind] = Val; 
    System.out.println(Arrays.toString(arr)); }
}
                                                   
                                                   
//16. Write a Java program to remove duplicate elements from an array.
public class DuplicateElements{ 
  public static void main(String[] args) {

    String[] arr = {"gdf", "fdfs", "gdf", "rww", "dfh", "aea", "jhgh"};


    for (int i = 0; i < arr.length-1; i++) {

      for (int j = i+1; j < arr.length; j++) {

        if( (arr[i].equals(arr[j])) && (i != j) )

        {

          System.out.println("Duplicate= "+arr[j]); }
} 
    }
  } 
}
                                                   
                                                   
//20. Write a Java program to convert an array to ArrayList.
import java.util.ArrayList;
import java.util.Arrays;
public class Convert{

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>();

    list.add("Ramesh");

    list.add("Suresh");

    list.add("Kamlesh");

    list.add("Surendra");

    list.add("Tilak");

    list.add("Ramcharan");

    String[] my_array = new String[list.size()];
    list.toArray(arr);

    for (String string : arr)
{ 
      System.out.println(string); 
    }

  } 
}

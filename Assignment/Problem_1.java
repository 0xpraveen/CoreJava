// Question 1. find sum of element of arraylist.
// Question 2. find sum of digits of number.
// Question 3. check string is palindrome or not








//1)
import java.util.*; 
class HelloWorld {
    public static void main(String[] args) {
List<Integer> list = new ArrayList<>();
int sum=0;
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
for(int i=0 ; i<list.size(); i++){
    sum=sum+list.get(i);
}
System.out.println(sum);
}
}



//2)
import java.util.*; 
class HelloWorld {
    public static void main(String[] args) {
int num, dig, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter  number: ");  
num = sc.nextInt();  
while(num > 0)  
{  
dig = num % 10;  
sum = sum + dig;  
num = num / 10;  
}  
  
System.out.println("Sum= "+sum);  
}  
}  




//3)
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

 import java.util.*; 
class HelloWorld {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);  
System.out.print("Enter  String: ");  
String str = sc.nextLine();
int low=0,high=str.length()-1;
while(low<=high){
    if(str.charAt(low)==str.charAt(high)) { 
        low++;
        high--;
}

else { System.out.println("not a palindrome");

return;
}

}
System.out.println("palindrome");
}}








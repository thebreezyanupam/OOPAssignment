import java.util.Scanner;

//1.WAP to print the first 10 multiples of 2.
public class ForIteration{
    public static void main(String[] args) {
        for(int i =2; i<20;i+=2){
            System.out.println(i);
        }
    }
}

//2.WAP to take your name and age as user input and print it 5 times using for loop.
class NameAndAge{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myobj.next();
        System.out.println("Enter your age: ");
        int age = myobj.nextInt();
        for(int i=0; i<5;i++){
            System.out.println(name);
            System.out.println(age);
        }
    }
}

//3.WAP to print the initalization and condition for the for loop and print the even numbers present in between it.
class CheckEvenAny{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = myobj.nextInt();
        System.out.println("Even numbers present are: ");
        for(int i=2;i<num;i+=2){
            System.out.println(i);
        }
    }
}
//4.WAP to print the initalization and condition for the for loop and print the sum of all the even numbers present in between it.
class SumOfEven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print all even number till:");
        int even = scanner.nextInt();
        int evenSum = 0 ;
        for(int i=2;i<=even;i+=2){
            if(i%2 == 0){
                evenSum  = evenSum  +i;
                System.out.println(evenSum);

            }

        }
        System.out.println("the sum of even number upto "+even+" = "+evenSum);
    }
}

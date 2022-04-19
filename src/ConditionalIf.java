import java.util.Scanner;

public class ConditionalIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= scanner.nextInt();
        if (age<18) {
            System.out.println("Under age");
        }
        else {
            System.out.println("Eligible");
        }
    }
}

class Marksz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks= scanner.nextInt();
        if (marks>=70){
            System.out.println("First Class");
        }
        else if (marks<70&&marks>=59){
            System.out.println("Upper Second Class");

        }
        else if (marks<59 && marks>=49){
            System.out.println("Lower Second class");

        }
        else if(marks<49 && marks>=39){
            System.out.println("Third Class");

        }
        else{
            System.out.println("Fail");
        }
    }
}

class Voter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Do you have voterCard? [Y/N]");
        String voterCard= scanner.next();
        if (age>=18){
            if (voterCard=="Y")
            {
                System.out.println("You can vote.");

            }
            else{
                System.out.println("You cannot vote");
            }
        }
    }
}
 class Maxim{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter your numbers: ");
         float a= scanner.nextFloat();
         System.out.print("Enter another number: ");
         float b= scanner.nextFloat();
         System.out.print("The maximum number between two numbers is: ");
         System.out.println(Math.max(a,b));

     }
 }
class Minimum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        float a= scanner.nextFloat();
        System.out.print("Enter another number: ");
        float b= scanner.nextFloat();
        System.out.print("The minimum number between two numbers is: ");
        System.out.println(Math.min(a,b));

    }
}
class Checkkk{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        float a= scanner.nextFloat();
        if (a<0){
            System.out.println("The number is negative.");
        }
        else if (a>0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is zero.");
        }
    }
}
class Divis{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        float a= scanner.nextFloat();
        if (a%5==0 && a%11==0){
            System.out.println("The number is divisible by 5 and 11.");
        }
        else{
            System.out.println("The number is not divisible by 5 and 11.");
        }
    }
}
class Evenorodd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        float a= scanner.nextFloat();
        if (a%2==0){
            System.out.println("The number is even number.");
        }
        else{
            System.out.println("The number is odd number.");
        }
    }
}

class Leapyr{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        float year= scanner.nextFloat();
        boolean leap = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
class Alphabet{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = scanner.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}

class Vowelcons{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = scanner.next().charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
            System.out.println(c+" is a vowel.");
        }
        else{
            System.out.println(c+" is a consonant.");
        }
}
}

class Checkkkk{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A DIGIT.");

        } else {

            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }

    }
}
class Uplow{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if(ch>='A'&& ch<='Z'){
            System.out.println("It is upper case letter.");
        }
        else{
            System.out.println("It is lower case letter.");
        }
    }
}

class Week{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1-7: ");
        int num1 = scanner.nextInt();
        if(num1==1){
            System.out.println("Sunday");
        }
        else if(num1==2){
            System.out.println("Monday");
        }
        else if(num1==3){
            System.out.println("Tuesday");
        }
        else if(num1==4){
            System.out.println("Wednesday");
        }
        else if(num1 ==5){
            System.out.println("Thursday");
        }
        else if(num1 == 6){
            System.out.println("Friday");
        }
        else if(num1 ==7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Invalid input! Please enter week number between (1-7).");
        }

    }
}

class Month {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = p.nextInt();
        if (month == 1) {
            System.out.println("JANUARY: 31 days");
        } else if (month == 2) {
            System.out.println("FEBRUARY: 28 or 29 days");
        } else if (month == 3) {
            System.out.println("MARCH: 31 days");
        } else if (month == 4) {
            System.out.println("APRIL: 30 days");
        } else if (month == 5) {
            System.out.println("MAY: 31 days");
        } else if (month == 6) {
            System.out.println("JUNE: 30 days");
        } else if (month == 7) {
            System.out.println("JULY: 31 days");
        } else if (month == 8) {
            System.out.println("AUGUST: 31 days");
        } else if (month == 9) {
            System.out.println("SEPTEMBER: 30 days");
        } else if (month == 10) {
            System.out.println("OCTOBER: 31 days");
        } else if (month == 11) {
            System.out.println("NOVEMBER: 30 days");
        } else if (month == 12) {
            System.out.println("DECEMBER: 31 days");
        } else {
            System.out.println("Warning!!! Please, enter number between (1-12).");
        }
    }
}

class Notesnum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int amount = scanner.nextInt();
        int note1000,note500, note100, note50, note20, note10, note5, note2, note1;
        note1000 = note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;
        if(amount >= 1000)
        {
            note1000 = amount/1000;
            amount -= note1000 * 1000;
        }
        if(amount >= 500)
        {
            note500 = amount/500;
            amount -= note500 * 500;
        }
        if(amount >= 100)
        {
            note100 = amount/100;
            amount -= note100 * 100;
        }
        if(amount >= 50)
        {
            note50 = amount/50;
            amount -= note50 * 50;
        }
        if(amount >= 20)
        {
            note20 = amount/20;
            amount -= note20 * 20;
        }
        if(amount >= 10)
        {
            note10 = amount/10;
            amount -= note10 * 10;
        }
        if(amount >= 5)
        {
            note5 = amount/5;
            amount -= note5 * 5;
        }
        if(amount >= 2)
        {
            note2 = amount /2;
            amount -= note2 * 2;
        }
        if(amount >= 1)
        {
            note1 = amount;
        }

        System.out.println("Total number of notes = \n");
        System.out.println("1000 = "+note1000+"\n");
        System.out.println("500 = "+note500+"\n");
        System.out.println("100 = "+note100+"\n");
        System.out.println("50 = "+note50+"\n");
        System.out.println("20 = "+note20+"\n");
        System.out.println("10 = "+note10+"\n");
        System.out.println("5 = "+note5+"\n");
        System.out.println("2 = "+note2+"\n");
        System.out.println("1 = "+note1+"\n");
    }
}

class Tryangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first angle: ");
        int a = scanner.nextInt();
        System.out.println("Enter second angle: ");
        int b= scanner.nextInt();
        System.out.println("Enter third angle: ");
        int c= scanner.nextInt();
        int total=a+b+c;
        if (total==180){
            System.out.println("It is triangle.");
        }
        else
            System.out.println("it is not a triangle.");
    }
}

class Sidess{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = scanner.nextInt();
        System.out.println("Enter second side");
        int b = scanner.nextInt();
        System.out.println("Enter third side");
        int c = scanner.nextInt();
        if(a<b+c && b<a+c && c<a+b){
            System.out.println("It can form triangle.");
        }
        else{
            System.out.println("It cannot form triangle.");
        }

    }
}

class Tryyangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b+c && b<a+c && c<a+b)
        {
            if(a==b && b==c)
                System.out.println("Equilateral triangle");
            else if(a==b || b==c || c==a)
                System.out.println("Isosceles triangle");
            else
                System.out.println("Scalene triangle");
        }
        else
            System.out.println("Cannot form a triangle");
    }
}

class Quadratic{
        public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            double a= scanner.nextDouble();
            System.out.println("Enter b: ");
            double b= scanner.nextDouble();
            System.out.println("Enter c: ");
            double c= scanner.nextDouble();

            double root1, root2;

            double determinant = b * b - 4 * a * c;

            if (determinant > 0) {

                root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                root2 = (-b - Math.sqrt(determinant)) / (2 * a);

                System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
            }

            else if (determinant == 0) {

                root1 = root2 = -b / (2 * a);
                System.out.format("root1 = root2 = %.2f;", root1);
            }


            else {


                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-determinant) / (2 * a);
                System.out.format("root1 = %.2f+%.2fi", real, imaginary);
                System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
            }
        }
    }
class Profitorloss{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Selling price: ");
        float sp = scanner.nextFloat();
        System.out.println("Enter Cost price: ");
        float cp = scanner.nextFloat();
        if(cp-sp>0){
            System.out.println("lose:"+(cp-sp));
        }
        else if(cp-sp<0) {
            System.out.println("profit:"+(sp-cp));

        }
        else{
            System.out.println("equall");
        }

    }
}

class Studentmarks{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Physics Marks: ");
        float phy = scanner.nextFloat();
        System.out.println("Enter Your Chemistry Marks: ");
        float chem = scanner.nextFloat();
        System.out.println("Enter Your Biology Marks: ");
        float bio = scanner.nextFloat();
        System.out.println("Enter Your Mathematics Marks: ");
        float math = scanner.nextFloat();
        System.out.println("Enter Your Computer Marks: ");
        float comp = scanner.nextFloat();
        float total, percentage;
        total = phy + chem + bio + comp + math;
        percentage = (total / 500) * 100;
        System.out.println("Your total percentage is:"+percentage);
        if(percentage >= 90)
        {
            System.out.println("\nGrade A");
        }
        else if(percentage >= 80)
        {
            System.out.println("\nGrade B");
        }
        else if(percentage >= 70)
        {
            System.out.println("\nGrade C");
        }
        else if(percentage >= 60)
        {
            System.out.println("\nGrade D");
        }
        else if(percentage >= 40)
        {
            System.out.println("\nGrade E");
        }
        else
        {
            System.out.println("\nFail");
        }

    }
}
class salary
{
    public static void main(String args[])
    {
        double basic=20000.50,gross,da,hra;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Basic Salary : ");
        basic = in.nextDouble();
        if(basic <=10000)
        {
            da = basic * (80/100);
            hra = basic *(20/100);
        }
        else if(basic <=20000)
        {
            da = basic * (90/100);
            hra = basic *(25/100);
        }
        else
        {
            da = basic * (95/100);
            hra = basic * (30/100);
        }
        gross = basic + da + hra;
        System.out.println("The Gross Salary is :"+gross);
    }
}

class ElectricityBill1 {
    public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);

        int Units;
        double Amount, Total_Amount;
        scanner = new Scanner(System.in);

        System.out.print(" Please Enter the Units that you Consumed  : ");
        Units = scanner.nextInt();

        if (Units < 50)
        {
            Amount = Units * 0.50;
        }
        else if (Units <= 150)
        {
            Amount = 25 + ((Units - 50 ) * 0.75);
        }
        else if (Units <= 250)
        {
            Amount = 25 + 75 + ((Units - 100 ) * 1.20);

        }
        else
        {
            Amount = 25 + 75 + 120 + ((Units - 200 ) * 1.50);

        }

        Total_Amount = Amount + (Amount*0.8);
        System.out.println("\n Electricity Bill  =  " + Total_Amount);
    }

}
import javax.swing.*;


public class JoptionPane {

    public static void main(String[] args) {
        Float a,b,c,d,sum;
        a=Float.parseFloat(JOptionPane.showInputDialog(null, "First Integer"));
        b=Float.parseFloat(JOptionPane.showInputDialog(null, "Second Integer"));
        c=Float.parseFloat(JOptionPane.showInputDialog(null, "Third Integer"));
        d=Float.parseFloat(JOptionPane.showInputDialog(null, "Fourth Integer"));
        sum=a+b+c+d;
        JOptionPane.showMessageDialog(null,"The total sum is: " +sum);
    }
}
class Per {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int Maths,Nepali,Science,English,Percentage;

        Maths=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks in Maths"));
        Nepali=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks in Nepali"));
        Science=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks in Science"));
        English=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks in English"));
        Percentage = (Maths + Nepali + Science + English) / 4;
        JOptionPane.showMessageDialog(null,"Total Percentage is : "+Percentage);
        String grade = (Percentage >= 70) ? "First Class" :
                Percentage > 59 && Percentage < 70 ? "Upper Second Class" :
                        Percentage > 49 && Percentage < 59 ? "Second Class" :
                                Percentage > 39 && Percentage < 49 ? "Third Class" : "Fail";
        JOptionPane.showMessageDialog(null,"Grade : " +grade);

    }
}
class Addition{
    public static void main(String[] args) {
        int a,b,sum,product;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number"));
        sum=a+b;
        product=a*b;
        JOptionPane.showMessageDialog(null,"The sum is: "+sum);
        JOptionPane.showMessageDialog(null,"The product is: "+product);
    }
}
class Division{
    public static void main(String[] args) {
        int a,b,sum,product,division;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number"));
        sum=a+b;
        product=a*b;
        division = sum/product;
        JOptionPane.showMessageDialog(null,"The sum is: "+sum);
        JOptionPane.showMessageDialog(null,"The product is: "+product);
        JOptionPane.showMessageDialog(null,"The quotient is: "+division);

    }

}
class Area{
    public static void main(String[] args) {
        double l,b,area;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the length"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the breadth"));
        area=l*b;
        JOptionPane.showMessageDialog(null,"The area of rectangle is: "+area);

    }
}
class Interests{
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog(null,"Enter your name");
        String roll=JOptionPane.showInputDialog(null,"Enter your roll number");
        String interest=JOptionPane.showInputDialog(null,"Enter your interests");

        JOptionPane.showMessageDialog(null,"My name is "+name +"."+ "\nMy roll number is "+roll + "." + "\nMy interest is in "+interest+".");

    }
}
class Squaree {
    public static void main(String[] args) {
        float l,p,t,r,b,base,h,len,height1,len1,breadth,areaofsquare,SI,perimeter,cubevolume,cuboidvolume,areaoftriangle;
        l=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter length of a square"));

        areaofsquare=l*l;
        perimeter=4*l;
        JOptionPane.showMessageDialog(null,"Area of square is:"+areaofsquare);
        JOptionPane.showMessageDialog(null,"perimeter of square is:"+perimeter);

        h=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter height of a triangle"));
        b=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter base of a triangle"));
        areaoftriangle=(b*h)/2;
        JOptionPane.showMessageDialog(null,"area of triangle is:"+areaoftriangle);

        t=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter time"));
        r=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter rate"));
        p=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter principal"));
        SI=(p*t*r)/100;
        JOptionPane.showMessageDialog(null,"simple interest is:"+SI);

        len=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter length of a cube"));
        cubevolume=len*len*len;
        JOptionPane.showMessageDialog(null,"volume of cube is:"+cubevolume);

        len1=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter length of a cuboid"));
        breadth=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter breadth of a cuboid"));
        height1=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter height of a cuboid"));
        cuboidvolume=len1*breadth*height1;

        JOptionPane.showMessageDialog(null,"volume of cuboid is:" + cuboidvolume);
        JOptionPane.showMessageDialog(null,"Thank You");

    }
}
class Squarenum {
    public static void main(String[] args) {
        float num,square;
        num=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the number: "));
        square=num*num;
        JOptionPane.showMessageDialog(null,"The square of num is: "+square);
    }
}

class Stringg{
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog(null,"Enter anything");
        String b=JOptionPane.showInputDialog(null,"Enter anything ");
        JOptionPane.showMessageDialog(null,a+b);
    }
}
class  Checkk{
    public static void main(String[] args) {
        int a,b,c;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter b"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter c"));
        String equal=(a == c) && (a == b)?"all are equal":
                (a==b)||(b==c)?"any two are equal":"none are equal";
        JOptionPane.showMessageDialog(null, equal);
    }
}
class  Conditions{
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter b"));
        JOptionPane.showMessageDialog(null,(a<50)&&(a<b));
    }
}

class  Subs{
    public static void main(String[] args) {
        int a,b,c,total,per;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Science marks"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Maths marks"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter English marks"));
        total=a+b+c;
        per=(total*100)/3;
        JOptionPane.showInputDialog(null,"Total marks is :"+total);
        JOptionPane.showInputDialog(null,"Total percentage is :"+per);
    }
}

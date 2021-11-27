package w3resource;

import com.sun.source.doctree.SystemPropertyTree;

import java.io.Console;
import java.io.File;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Java_practice_150_part1 {

    public static void main(String[] args){
        erercise50divisibleby();
    }
    public static void erercise50divisibleby(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Input the mazimum number");
        int max= scan.nextInt();
        System.out.println("Input two Dividers");
        int x= scan.nextInt();int y= scan.nextInt();
        System.out.println("the numbers divided by "+x+" are :");
        for(int i=1;i<=max;i++){
            if(i%x==0){
                System.out.print(i+", ");
            }
        }
        System.out.println("");
        System.out.println("the numbers divided by "+y+" are :");
        for(int i=1;i<=max;i++){
            if(i%y==0){
                System.out.print(i+", ");
            }
        }
        System.out.println("");
        System.out.println("the numbers divided by "+x+" and "+y+" are :");
        for(int i=1;i<=max;i++){
            if(i%x==0&&i%y==0){
                System.out.print(i+", ");
            }
        }

    }
    public static void exercise49oddoreven(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Input a Number :");
        int x= scan.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }else System.out.println("Odd");
    }
    public static void exercise48oddnumbers(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Input the maximum limit");
        int x= scan.nextInt();
        for(int i=1;i<=x;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void exercise47getSystemTime(){
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        System.out.println(sdf.format(System.currentTimeMillis()));

    }
    public static void exercise45sizeoffile(){
        File file=new File("C:\\Users\\dines\\IdeaProjects\\Java_Project\\src\\resources\\statedetails.java");
        System.out.println(file.length()+" bytes");
    }
    public static void exercise44intformat(){
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        System.out.println(i+" + "+i+""+i+" + "+i+""+i+""+i);
    }
    public static void exercise42getpassword(){
        Console cons;
        if ((cons = System.console()) != null) {
            char[] pass_ward = null;
            try {
                pass_ward = cons.readPassword("Input your Password:");
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get password...No console");
        }
    }
    public static void exercise41asciivalue(){
        char a='Z';
        int i=(int)a;
        System.out.println(i);

    }
    public static void exercise40characterset(){
        for(String str:Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
    public static void exerise39unique3digtnumber(){
       int count=0;
       for(int i=1;i<5;i++){
           for(int j=1;j<5;j++){
               for(int k=1;k<5;k++){
                   if(k!=i&&i!=j&&k!=j){
                       count++;
                       System.out.println(""+i+""+j+""+k);
                   }
               }
           }
       }
System.out.println(count);
    }
    public static void exercise38countcharacters(){
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        int countalpha=0;
        int countnum=0;
        int countspace=0;
        int countother=0;
        for(int i=0;i<input.length();i++){
            if(Character.isAlphabetic(input.charAt(i))){
                countalpha++;
            }
            else if(Character.isDigit(input.charAt(i))){
                countnum++;

            }
            else if(Character.isWhitespace(input.charAt(i))){
                countspace++;
            }
            else countother++;
        }
        System.out.println("the nume of alpha is "+countalpha+ " the number of digts is "+ countnum+" the num of white space is "+countspace+" the nm of other is "+ countother);
    }
    public static void exercise37reversestring(){
        Scanner scan=new Scanner(System.in);
        String s= scan.next();
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        StringBuffer actual=new StringBuffer(s);
        String Expected=actual.reverse().toString();
        System.out.println(reverse+"    another method    "+ Expected
        );
    }
    public static void exxercise36getdistanceofearth(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the lattitude of 1 :");
        double x1= scan.nextDouble();
        x1=Math.toRadians(x1);
        System.out.print("Enter the logitude of 1 :");
        double y1= scan.nextDouble();
        y1=Math.toRadians(y1);
        System.out.print("Enter the lattitude of 2 :");
        double x2= scan.nextDouble();
        x2=Math.toRadians(x2);
        System.out.print("Enter the lattitude of 2 :");
        double y2= scan.nextDouble();
        y2=Math.toRadians(y2);
        double radius=6371.01;
        double d=radius*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        System.out.println("The the distance between two points is "+ d+" kms");
    }
    public static void exercise35areaofpolygon(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the side length of polygon");
        double side= scan.nextDouble();
        System.out.println("Enter the sides of polygon");
        double n= scan.nextDouble();
        System.out.println("Area of Polygon is "+(n*Math.pow(side,2))/(4*Math.tan(Math.PI/n)));
    }
    public static void exercise34areaofhexagon(){
        Scanner scan=new Scanner(System.in);
        double side= scan.nextDouble();
        double area=(6*Math.pow(side,2))/(4*Math.tan(Math.PI/6));
        System.out.println(area);
           }
    public static void exercise33sumofdigits(){
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        int sum=0;
        while(x>0){
            sum=sum+x%10;
            x=x/10;
        }

        System.out.println(sum);
    }
    public static void exercise32comparetwonumber(){
        Scanner scan=new Scanner(System.in);
        double a=scan.nextDouble();
        double b= scan.nextDouble();
        if(a<=b){
            System.out.println(a+"<="+b);
        }
        if(a>=b){
            System.out.println(a+">="+b);
        }
        if(a==b){
            System.out.println(a+"="+b);
        }
        if(a!=b){
            System.out.println(a+"!="+b);
        }
        if(a<b){
            System.out.println(a+"<"+b);
        }
        if(a>b){
            System.out.println(a+">"+b);
        }
    }
    public static void exercise31getjavadetails(){
        System.out.println("Java Version - "+System.getProperty("java.version"));
        System.out.println("Java RunTime Version - "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home - "+System.getProperty("java.home"));
        System.out.println("Java Vendor - "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL - "+ System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path - "+ System.getProperty("java.class.path"));
    }
    public static void exercise30hexadecimaltooctal(String x){
        int y=Integer.parseInt(x,16);
        System.out.println(Integer.toOctalString(y));
    }
    public static void exercise29hexadecimaltobinary(String x){
        int y=Integer.parseInt(x,16);
        System.out.println(Integer.toBinaryString(y));
    }
    public static void exercise28hexatodecimal(String x){
        System.out.println(Integer.parseInt(x,16));
    }
    public static void exercise27octaltohexadecimal(String x){
        int y=Integer.parseInt(x,8);
        System.out.println(Integer.toHexString(y));
    }
    public static void exercise26octaltobinary(String x){
        int y=Integer.parseInt(x,8);
        System.out.println(Integer.toBinaryString(y));
    }
    public static void exercise25octaltodecimal(String x){
        System.out.println(Integer.parseInt(x,8));
    }
    public static void exercise24binarytooctal(String x){
        int y=Integer.parseInt(x,2);
        System.out.println(Integer.toOctalString(y));
    }
    public static void exercise23binarytohexadecimal(String x){
        int y=Integer.parseInt(x,2);
        System.out.println(Integer.toHexString(y));
    }
    public static void exercise22binarytodecimal(String x){
        System.out.println(Integer.parseInt(x,2));
    }
    public static void exercise21decimaltooctalnumber(int x){
        System.out.println(Integer.toOctalString(x));
    }
    public static void exercise20decimaltohexadecimal(int x){
        System.out.println(Integer.toHexString(x));
            }
    public static void exercise19decimaltobinary(int x){
        System.out.println(Integer.toBinaryString(x));
    }
    public static void exercise18binarynumbermultiply(){
        String first="10";
        String second="11";
        int num1=Integer.parseInt(first,2);
        int num2=Integer.parseInt(second,2);
        int sum=num1*num2;
        String multi=Integer.toBinaryString(sum);
        System.out.println(multi);
    }
    public static void exercise17binarynumberaddition(){
        String first="10";
        String second="11";
        int num1=Integer.parseInt(first,2);
        int num2=Integer.parseInt(second,2);
        int sum=num1+num2;
        String summ=Integer.toBinaryString(sum);
        System.out.println(summ);
    }
    public static void exercise16printface(){
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
    public static void exercise15swap(double a,double b){
        System.out.println("original value of A is = " + a);
        System.out.println("original value of B is = " + b);
        double temp =a;
        a=b;
        b=temp;
        System.out.println("swapped value of A is = " + a);
        System.out.println("swapped value of B is = " + b);

    }
    public static void exercise14(){
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }
    public static void exercise13(double width,double height){
        System.out.println("Perimeter of rectangle is = "+(2*(width+height)));
        System.out.println("Area of rectngle is = "+ width*height);
    }
    public static void exercise12(){
        Scanner scan=new Scanner(System.in);
        System.out.println("the average of the numbers is = "+((scan.nextDouble()+ scan.nextDouble()+ scan.nextDouble())/3));
    }
    public static void exercise11(double radius){
        System.out.println("Perimeter of the circle is = "+2*Math.PI*radius);
        System.out.println("Area of circle ia = "+Math.PI*Math.pow(radius,2));
    }
    public  static String sangs(String sentence){
        String[] strarray=sentence.split(" ");
        String Evenword="";
        int i=0;
        for(String str:strarray){
            if(str.length()%2==0){
                i=1;
                if (Evenword.length()<str.length()){
                    Evenword=str;
                }
            }
        }
        if(i==0){
            return "00";
        }else
        return Evenword;
    }
    public static void exercise10(){
        System.out.println(4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));
    }
    public static void exercise9(){
        System.out.println(((25.5*3.5-3.5*3.5)/(40.5-4.5)));
    }
    public static void exercise8(){
        System.out.println("jaaava");
    }
    public static void exercise7(){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+" = "+num*i);
        }
    }
    public static void exercise1(){
        System.out.println("Hello");
        System.out.println("Deekay");
    }
    public static void exercise2(){
        System.out.println(74+36);
    }
    public static void exercise3(){
        System.out.println(50/3);
    }
    public static void exercise4(){
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+(-3*5/8));
        System.out.println(5+15/3*2-8%3);
    }
    public static void exercise5(){
        Scanner scan=new Scanner(System.in);
        System.out.println(scan.nextInt()*scan.nextInt());
    }
    public static void exercise6(){
        Scanner scan=new Scanner(System.in);
        int first=scan.nextInt();
        int secon=scan.nextInt();
        System.out.println(first+"+"+secon+"="+(first+secon));
        System.out.println(first+"-"+secon+"="+(first-secon));
        System.out.println(first+"x"+secon+"="+(first*secon));
        System.out.println(first+"/"+secon+"="+(first/secon));
        System.out.println(first+"mod"+secon+"="+(first%secon));
    }
}

package w3resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_practice_150_part1 {

    public static void main(String[] args){
        exercise28hexatodecimal("25");
        exercise20decimaltohexadecimal(4353);
        exercise25octaltodecimal("10");
        exercise23binarytohexadecimal("1101");
        exercise24binarytooctal("111");
        exercise26octaltobinary("7");
        exercise27octaltohexadecimal("100");
        exercise29hexadecimaltobinary("37");
        exercise30hexadecimaltooctal("40");
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

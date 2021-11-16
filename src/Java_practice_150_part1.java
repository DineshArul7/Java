import java.util.Scanner;

public class Java_practice_150_part1 {

    public static void main(String[] args){
        exercise10();
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

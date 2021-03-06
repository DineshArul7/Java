package hackerRank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaPrograms {
    public static void main(String[] args) {
        javaPattern();
    }

    public static void regex(String string){

                String regex = "([A-Z])(.+)";

                Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
                Matcher matcher = pattern.matcher(string);

                while (matcher.find()) {
                    System.out.println("Full match: " + matcher.group(0));

                    for (int i = 1; i <= matcher.groupCount(); i++) {
                        System.out.println("Group " + i + ": " + matcher.group(i));
                    }

                }
    }

    public static void javaPattern(){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
    public static void stringtoken(){
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String s = scan.next().trim();
        if (s.length() > 0) {
            String[] tokens = s.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for(String token : tokens) {
                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }
        scan.close();
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toUpperCase();
        b=b.toUpperCase();
       Set<Character> charsetfora=new TreeSet<>();
        Set<Character> charsetforb=new TreeSet<>();
        boolean result=false;
        int counta=0;
        int countb=0;

        for(int i=0;i<a.length();i++){
            charsetfora.add(a.charAt(i));
        }
        for(int i=0;i<b.length();i++){
            charsetforb.add(b.charAt(i));
        }
        Set<Character> actual=new TreeSet<Character>();
        if(charsetfora.size()>charsetforb.size()){
            actual=charsetfora;
        }
        else actual=charsetforb;
        for(char c:actual){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==c){
                    counta++;
                }
            }
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)==c){
                    countb++;
                }
            }
            if (!(counta==countb)){
                return false;
            }
            else result=true;
        }
return result;
    }
    public static void palindrome(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuffer buffer=new StringBuffer(A);
        String reverse=buffer.reverse().toString();
if(A.equalsIgnoreCase(reverse)){
    System.out.println("Yes");
}else
    System.out.println("No");

    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";
        int begin=0;
        for(int i=0;i<=s.length()-k;i++) {
            String result = s.substring(begin + i, k + i);
            if (result.compareTo(smallest) < 0) {
                smallest = result;
            }
            if (result.compareTo(largest) > 0) {
                largest = result;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
    public static void javaSubString() {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
    public static void StringIntroduction() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());

        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else
            System.out.println("No");
        String a = A.toUpperCase();
        A = A.replace(A.charAt(0), a.charAt(0));
        String b = B.toUpperCase();
        B = B.replace(B.charAt(0), b.charAt(0));
        System.out.println(A + " " + B);
    }



}

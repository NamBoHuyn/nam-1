package day04;

public class Test04 {
     public static void main(String[] args) {
       char ch1 = 'a';
       char ch2 = 'Z';
       System.out.println("ch1 > ch2 : " + (ch1 <ch2) );
       
       
       System.out.println("abcd" == "abcd"); // 이경우는 문자열의 주소값을 비교한다.
       
       String str1  = "가나다라";
       String str2  = new String("가나다라");
       System.out.println("str1 : " + str1);
       System.out.println("str2 : " + str2);
       
       System.out.println("str1 == str2" ) : " + (str1 == str1" );
     }    
}
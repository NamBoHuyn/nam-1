package day04;

import java.util.*;
public class Ex02 {
    /*  
	
	     
	     
	    숙제2]
	     정수3개를 입력받아서
	     세 수중 큰 숫자만 출력되게 하세요.
	     
	     
	     
	*/
	public static void main(String[] args) {
		// 입력받을 준비하고
       Scanner sc = new Scanner(System.in);
        // 메세지 출력하고(3번)
   System.out.print("첫번째정수를 입력하세요!" );
   int no1 = sc.nextInt();
   System.out.print("두번째정수를 입력하세요!" );
   int no2 = sc.nextInt();
   System.out.print("세번째정수를 입력하세요!" );
   int no3 = sc.nextInt();
	    // 변수를 비교하고 
		int result = (no1 >= no2) ? ((no1 > no3) ? no1 : no3) : ((no2 > no3) ? no2 : no3);
		// 제일 큰 수 출력하고

		System.out.println("입력한 세수[ " + no1 + " , " + no2 + " , " + no3 +" ] 중 제일 큰수는 [ " + result + " 입니다.");
	
	
	
	}
}
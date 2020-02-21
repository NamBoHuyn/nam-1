package day04;

import java.util.*;
/*
      삼항 조건 연산자
       조건의 결과에 따라서 결과값을 달리 변환해주는 연산자

    형식]
       (조건식) ? 조건식이 삼일 때 반환값 : 조건식이 거짓일 때 반환값;
*/
public class Test01 {
   public static void main (String[] args) {
	   //예제] 3항 조건연산자를 사용해서 3이5보다 크면 "3은 5보다 큽니다. " 또는 작으면 "3은 5보다 작습니다 "
	        int no1 = 3;
	        int no2 = 5;
	        // 변수를 선언할 때 같은 타입은 한번에 선언할 수 도 있다.
	        int num1, num2, num3;
	       String msg = (no1 > no2) ? (no1+ "은"+ no2 + "보다 큽니다.") : (no1+ "은"+ no2 + "보다 작습니다.");
	    
	        
	       System.out.println(msg);

   boolean bool1 = no1 > no2;
   
  msg = bool1 ? (no1+ "은"+ no2 + "보다 큽니다.") : (no1+ "은"+ no2 + "보다 작습니다.");
  
  System.out.println(msg);
  
   }
}

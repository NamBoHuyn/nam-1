package day05;


/*
     랜덤한 숫자를 발생시키는 함수
      Math.random()  ==> double 타입의 데이터를 0 ~ 0.9999999....
 */
public class Text06 {
  // 0 ~ 10까지의 숫자를 랜덤하게 발생하세요.
	public static void main(String[] argd) {
		int no = (int)(Math.random() * (10 +1));
		//(int)(Math.random() * (최대숫자 - 최소숫자) +1)) + 최소숫자	
		System.out.println("no :" + no);
	    // 1 ~ 10까지의 숫자를 랜덤하게 발생하세요.
		int num = (int)(Math.random() *10) +1;
		System.out.println("num : "+ num);
	
	}
}

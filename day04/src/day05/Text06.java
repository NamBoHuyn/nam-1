package day05;


/*
     ������ ���ڸ� �߻���Ű�� �Լ�
      Math.random()  ==> double Ÿ���� �����͸� 0 ~ 0.9999999....
 */
public class Text06 {
  // 0 ~ 10������ ���ڸ� �����ϰ� �߻��ϼ���.
	public static void main(String[] argd) {
		int no = (int)(Math.random() * (10 +1));
		//(int)(Math.random() * (�ִ���� - �ּҼ���) +1)) + �ּҼ���	
		System.out.println("no :" + no);
	    // 1 ~ 10������ ���ڸ� �����ϰ� �߻��ϼ���.
		int num = (int)(Math.random() *10) +1;
		System.out.println("num : "+ num);
	
	}
}

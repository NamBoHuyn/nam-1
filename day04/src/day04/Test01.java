package day04;

import java.util.*;
/*
      ���� ���� ������
       ������ ����� ���� ������� �޸� ��ȯ���ִ� ������

    ����]
       (���ǽ�) ? ���ǽ��� ���� �� ��ȯ�� : ���ǽ��� ������ �� ��ȯ��;
*/
public class Test01 {
   public static void main (String[] args) {
	   //����] 3�� ���ǿ����ڸ� ����ؼ� 3��5���� ũ�� "3�� 5���� Ů�ϴ�. " �Ǵ� ������ "3�� 5���� �۽��ϴ� "
	        int no1 = 3;
	        int no2 = 5;
	        // ������ ������ �� ���� Ÿ���� �ѹ��� ������ �� �� �ִ�.
	        int num1, num2, num3;
	       String msg = (no1 > no2) ? (no1+ "��"+ no2 + "���� Ů�ϴ�.") : (no1+ "��"+ no2 + "���� �۽��ϴ�.");
	    
	        
	       System.out.println(msg);

   boolean bool1 = no1 > no2;
   
  msg = bool1 ? (no1+ "��"+ no2 + "���� Ů�ϴ�.") : (no1+ "��"+ no2 + "���� �۽��ϴ�.");
  
  System.out.println(msg);
  
   }
}
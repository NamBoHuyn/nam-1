package day05;

import java.util.*;

public class Ex2_01 {
	/*
	
������ �Է¹޾Ƽ� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
������
              A : 90 ~ 100
              B : 80 ~ 89
              C : 70 ~ 79
              D : 60 ~ 69
              F : 0 ~ 59
   
   
   
   
   */
	public static void main(String[] args) {
            // �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		    // �޼��� ����ϰ�
		System.out.print(" ������ �Է��ϼ��� ! : ");
		    //�Է¹޾� ������ ���
		int score = sc.nextInt();
		    // ����� ���� �����
		String grade = "";
		    // ���� ó���ϰ�
		     int tmp = score / 10;
		     switch(tmp) {
		     case 10 :
		    	 grade = "A";
		    	 break;
		     case 9:
		    	 grade = "A";
		    	 break;
		     case 8:
		    	 grade = "B";
		    	 break;
		     case 7:
		    	 grade = "C";
		    	 break;
		     case 6:
		    	 grade = "D";
		    	 break;
		    	   
		    	 default = "f";
		    	
		    // ������ְ�
		  System.out.println("�Է��� ���� [ " + score + " ] �� ������ " + grade + "�Դϴ�");
	}

	}
}

		
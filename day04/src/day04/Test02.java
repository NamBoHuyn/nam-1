package day04;

import java.util.*;
public class Test02 {
	/*
	  �ֿܼ��� ����(����) 2���� �Է¹޾� ����(no1, no2)�� ������ �ϰ�
	 �μ��� ���ؼ� no1�� no2���� ũ�� "no1�� no2 ���� Ů�ϴ�."
	 ������ "no1�� no2���� �۽��ϴ�." ��� �޼�������µǰ� �ϼ���
	 
	 ����]
	     �ܼ�ȯ�ῡ�� �����͸� �Է¹޴� ���
	     
	     Scanner sc = new Scanner(System.in); // �ֿܼ��� �ԷµǴ� �����͸� �����ϴ� Ŭ����
	     
	     // �ԷµǾ� �ִ� �����ʹ� ������ Ÿ�Կ� �°� ������ ����ϸ� �ȴ�.
	     int no1 = sc.nextInt(); // �Էµ� ������ ������ �Լ�
	     
    */
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	
	   //�޼����� ���� 
	   System.out.print("no1�� ���� ������ �Է��ϼ���! : ");
       
	   //���� ������ ���� ������ �����
	   int no1, no2;
	   
	  // ���ڸ� ������ no1�� ��� 
	   no1 = sc.nextInt();
	   
	   // �ι��� ���ڸ� �Է¹��� �޼����� ����ϰ� 
	   System.out.println("no2�� ���� ������ �Է��ϼ���! : ");
	   // no2�� ������ ������ ���
	   no2 = sc.nextInt();
	   
	   //��� �޼����� ���� ������ �����
	   String msg = new String();
	
	   //���� �����ڷ� ���ڸ� ���ؼ� �޼����� ������ ���
	   msg = (no1 > no2) ? (no1 + "�� "+ no2+ "���� Ů�ϴ�.") : (no1 + "��" + no2 +"���� �۽��ϴ�");
	   
	   //�޼���������Ѵ�.
	   System.out.println(msg);
			  
	}
}
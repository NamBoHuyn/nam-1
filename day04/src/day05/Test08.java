package day05;

/*
     break     : ���� ����ǰ��ִ� �ݺ����̳� switch ���� ��� �����ϼ���.��� ��ɾ�
     continue  : ���� ����Ǵ� �ݺ����� ���� ȸ���� ��� ���� �϶�¸�ɾ�
*/
public class Test08 {
 // 1���� 5���� ����ϴµ� 3�� �����ϼ���.
	public static void main(String[] args) {
	for(int i = 1; i <= 5; i++) {
		if(i == 3) {
			continue;
		}
		System.out.println(i);
	}
}
}


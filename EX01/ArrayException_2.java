package Chap14.EX01;

//Exception�� ������ �ֻ��� Ŭ����
public class ArrayException_2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			for(int i = 0 ; i<=7;i++) {//����� ���� �߻�
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}
		catch(Exception e) { //������ ��� ���� ó�� ����
			//e.printStackTrace(); //���ܿ� ���� ������ ���
			System.out.println("�迭�� �ε��� ���ȣ�� �Ѱ���ϴ�.");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("���α׷� ����");

	}

}

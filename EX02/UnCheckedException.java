package Chap14.EX02;

//���࿹�� (UnChecked Exception, Runtime Exception) : �����Ͽ��� x , ����� ����

class AA{}
class BB extends AA{}
public class UnCheckedException {

	public static void main(String[] args) {
		// ���� ����
		//ArithmeticException : 0���� ���� �� �߻�
		//System.out.println(10 / 0);
		
		AA aa = new AA();
		//BB bb = (BB) aa; //�����Ͽ��� �߻� x
		
		//ArrayIndexOutOfBoundException
		int[] array = {1,2,3};
		//System.out.println(array[3]);
		
		//int num = Integer.parseInt("10!"); // ���ڿ� 10�� ������ ��ȯ\�Ұ�
		//System.out.println(num);
		
		//NullPointerException : ��ü�� null�ε� �޼ҵ带 ȣ���ϴ� ���
//		String str = null;
//		System.out.println(str.charAt(2));
	}

}

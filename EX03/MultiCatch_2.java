package Chap14.EX03;

//�������� Exception�� ���ÿ� �߻��� ��� ó��

public class MultiCatch_2 {

	public static void main(String[] args) {
		//1. Exception���� ��� ���� ó�� ����

		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(Exception e){
			// Exception Ŭ���� : ��� ���� ó�� ����
			System.out.println("����ó��(Exception)");
		}
		//2. catch����� ������ �߸� �� ���
		//Exception�� ���� ���� Ŭ������ catch�� �������� ��ġ�ؾ���
		/*try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(Exception e){
			// Exception Ŭ���� : ��� ���� ó�� ����
			System.out.println("����ó��(Exception)");
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException �߻�");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException �߻�");
		}*/
		
		//3. catch ����� �ùٸ� ����
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException �߻�");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException �߻�");
		}
		catch(Exception e){
			// Exception Ŭ���� : ��� ���� ó�� ����
			System.out.println("����ó��(Exception)");
		}
		
		//4. �������� Exception�� ���� ����
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException|NumberFormatException e) {
			
		}
		catch(Exception e) {
			
		}
		
		
		
		
		System.out.println("���α׷� ����");
		
	}

}

package Chap14.EX06;
/*
 * ����ó�� 2���� ��� :
 * 1. ���� ó�� : try,catch
 * 2. ���� ����: throws, �޼ҵ带 ȣ���ϴ� ������ ���� ó��
 */

class A{
	void abc() {
		
	}
	void bcd() {
		try {
			Thread.sleep(1000); //�Ϲݿ��� : try,catch �����
		}
		catch(InterruptedException e) {
			//e.printStackTrace();
			System.out.println("���� �߻� 1");
		}
	}
}

class B{
void abc() {
	try {
		bcd();  //bcd�� ����ó���� �ǹ��� ����
	}
	catch(InterruptedException e) {
		//e.printStackTrace();
		System.out.println("����2 �߻�");
	}
	}
	void bcd() throws InterruptedException { //bcd�� ȣ���ϴ��ʿ��� ����ó��
		Thread.sleep(1000);
	}
}
public class ThrowsException_1 {

	public static void main(String[] args) {
		
	}

}

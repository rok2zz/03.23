package Chap14.EX06;
/*
 * ����ó�� 2���� ��� :
 * 1. ���� ó�� : try,catch
 * 2. ���� ����: throws, �޼ҵ带 ȣ���ϴ� ������ ���� ó��
 */
// main�޼ҵ忡 throws�� ������Ű�� ���, ������ѹ���

public class ThrowsExeption_2 {

	public static void main(String[] args) throws ClassNotFoundException{
		//���������� ���� ����. ClassNotFoundException �߻� x
		Class cls = Class.forName("java.lang.Object");
		
		//�����߻�
		Class cls2 = Class.forName("java.lang.Object00");
	}

}

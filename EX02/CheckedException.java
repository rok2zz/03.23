package Chap14.EX02;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class A{
	B b;
	A(){}// �⺻������
	
	interface B{
		void cry();
	}
	void abc() {
		System.out.println(b);
		b.cry();
	}
}

public class CheckedException {

	public static void main(String[] args) {
		//1. �Ϲ� ���� : ������ �ܰ迡�� ���� ó���� �ʿ�
		//InterruptedException : ������ �߰��� �����Ⱑ �߻��� ���� �߻�
		//Thread.sleep(1000);
		
		//ClassNotFoundException : Ŭ������ ã�� ���ϴ� ����
		//Class cls = Class.forName("java.lang.Object");
		
		//IOException : ��Ʈ��ũ���� ���� ���о���� ����
		//System.in : �ܼ��� ����
		InputStreamReader in = new InputStreamReader(System.in);
		//in.read();
		//FileNotFoundException : ������ ã�� ���ϴ� ����
		//FileInputStream fls = new FileInputStream("text.txt");
		
		//���࿹�� (unChecked Exception) : ����� �߻��Ǵ� ����
		A a1 = new A();
		a1.abc(); //�����ϴܰ迡�� ���� x, ����� ���� �߻�
				
	}

}

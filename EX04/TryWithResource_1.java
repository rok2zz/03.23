package Chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		//1. ���� ���ҽ� ����(���� ���α׷��� ���) : �ڵ尡 ��� ������
		System.out.println("���ڸ� �Է��ϼ���");
		
		//�ڵ� �޸� ����
		try(InputStreamReader isr1 = new InputStreamReader(System.in)){
			char input = (char) isr1.read();
			System.out.println("�Է±��� = " + input);
		}
		catch(IOException e){
			e.printStackTrace();
		}//finally ������ ��ü�� �ڵ����� close
		
		InputStreamReader isr2 = null;
		//System.in : �ֿܼ��� �Է��� �޵��� ó��, 1���� ��ǲ����
		//��ü�� ����Ǹ� �ι� ��ǲ ������
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();
			//�Ϲݿ���(checked ����) : IOEXception : ����½� ����
			System.out.println("�Է� ���� = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(isr2 != null) {
				try {
					isr2.close(); //IOException �߻�
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("==================");
		//2. �ڵ� ���ҽ� ����(Jav1.7 �ڵ����� ���ҽ�����) : �ڵ尡 ����(�ʿ���������)
			//1. ����ϴ� ��ü�� AutoCloseable �������̽��� ������ ��ü������
			//2. �ݵ�� ��ü�� close()�� �����ؾ���
			// 2������ ������ �ڵ� ���ҽ� ���� ����
			// try (�ڵ����� ���ҽ� ������ ��ü ����){} catch{}finally{}
		
		//InputStreamReadeer �� AutoCloseable �������̽��� �����ϰ�����
		// Try with Resourc e: try (with resource ����)
		try(InputStreamReader isr1 = new InputStreamReader(System.in)){
			char input = (char) isr1.read();
			System.out.println("�Է±��� = " + input);
		}
		catch(IOException e){
			e.printStackTrace();
		}//finally ������ ��ü�� �ڵ����� close
		
		
	}

}

package Chap14.EX05;
// ���� ������ ��ü���� AutoCloseable�� ����غ���.
	//try(��ü ���� ����) {} catch{} : �ڵ����� close()��.	
	//1. AutoCloseable �������̽��� close() �޼ҵ带 �������̵� ����
	
	//java.lang.AutoCloseable : java.lang < import ���ص� ��
	//java.lang.object

	//���� ó�� ���
	//1. try, catch ����ؼ� ���� ó�� : �ڽ��� ���� ���� ó��
	//2. throws�� ���ؼ� ���� ó�� : ���ܸ� ���� ó������ �ʰ� ȣ���ϴ� ������ ó���ϵ��� �̷�
		// ���� ����, �޼ҵ� ���� ����
		//throw : ���� �����߻�, throws : ���� ����


class A implements AutoCloseable{
	String resource;//resource : null
	
	A(String resource){ 
		this.resource = resource;
	}
	@Override
	public void close() throws Exception{
		System.out.println(resource);
		if(resource != null) {
			resource = null;
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
		}
	}
}


public class TryWithResource_2 {

	public static void main(String[] args) {
		//1. �ڵ� ���ҽ� ���� ���
		try(A a1 = new A("Ư������");){
			
		}
		catch(Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		} //finally ����� a1.close() �޼ҵ带 �ڵ����� ȣ��
		
		System.out.println("=================");
		
		//2. �������� ���ҵ� ����
		A a2 = null;
		try{
			 a2 = new A("������ �ʱⰪ �Ҵ�");
		}
		catch(Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		} 
		finally {
			if(a2.resource != null) {
				try {
					a2.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}

package Chap14.EX05;
//�ڵ� ���ҽ� ����
//������ ȣ��� �ʵ忡 �� �ο�
class Abc implements AutoCloseable{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;
	
	Abc(String name, int studentID, int kor, int eng, int math){
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		avg = (kor+eng+math)/3;
	}
	void print() {
		System.out.println("�̸��� : "+name+", �й��� : "+studentID+", ��� ������ : "+avg);
	}

	@Override
	public void close() throws Exception{
		if(name != null || studentID !=0 || kor!=0 || eng!=0 || math!=0 || avg!=0.0) {
			name = null;
			studentID = 0;
			kor = 0 ;
			eng = 0;
			math = 0;
			avg = 0.0;
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
		}
	}
}
public class Ex_TryWithResource_3 {

	public static void main(String[] args) {
		// 1. ��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� �ڵ����� close();
		try(Abc a = new Abc("ȫ�浿",1111,90,88,73);){
			a.print();
		}
		catch(Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		} 
		
		System.out.println("=================");
		// 2. �������� close() : finally����  close() ȣ��
		Abc a2 = null;
		try{
			 a2 = new Abc("ȫ�浿",1111,90,88,73);
		}
		catch(Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		} 
		finally {
			if(a2.name != null) {
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

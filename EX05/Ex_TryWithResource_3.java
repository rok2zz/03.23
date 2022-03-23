package Chap14.EX05;
//자동 리소스 제거
//생성자 호출시 필드에 값 부여
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
		System.out.println("이름은 : "+name+", 학번은 : "+studentID+", 평균 점수는 : "+avg);
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
			System.out.println("리소스가 해제 되었습니다.");
		}
	}
}
public class Ex_TryWithResource_3 {

	public static void main(String[] args) {
		// 1. 객체의 모든 필드를 초기화하고 자동으로 close();
		try(Abc a = new Abc("홍길동",1111,90,88,73);){
			a.print();
		}
		catch(Exception e) {
			System.out.println("예외가 발생되었습니다.");
		} 
		
		System.out.println("=================");
		// 2. 수동으로 close() : finally에서  close() 호출
		Abc a2 = null;
		try{
			 a2 = new Abc("홍길동",1111,90,88,73);
		}
		catch(Exception e) {
			System.out.println("예외가 발생되었습니다.");
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

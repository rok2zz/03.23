package Chap14.EX05;
// 직접 생성한 객체에서 AutoCloseable을 사용해보기.
	//try(객체 생성 구문) {} catch{} : 자동으로 close()됨.	
	//1. AutoCloseable 인터페이스의 close() 메소드를 오버라이딩 구현
	
	//java.lang.AutoCloseable : java.lang < import 안해도 됨
	//java.lang.object

	//예외 처리 방법
	//1. try, catch 사용해서 예외 처리 : 자신이 직접 예외 처리
	//2. throws를 통해서 예외 처리 : 예외를 내가 처리하지 않고 호출하는 곳에서 처리하도록 미룸
		// 예외 전가, 메소드 예외 전가
		//throw : 예외 강제발생, throws : 예외 전가


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
			System.out.println("리소스가 해제 되었습니다.");
		}
	}
}


public class TryWithResource_2 {

	public static void main(String[] args) {
		//1. 자동 리소스 해제 사용
		try(A a1 = new A("특정파일");){
			
		}
		catch(Exception e) {
			System.out.println("예외가 발생되었습니다.");
		} //finally 블락에 a1.close() 메소드를 자동으로 호출
		
		System.out.println("=================");
		
		//2. 수동으로 리소드 해제
		A a2 = null;
		try{
			 a2 = new A("생성자 초기값 할당");
		}
		catch(Exception e) {
			System.out.println("예외가 발생되었습니다.");
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

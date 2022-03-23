package Chap14.EX06;
/*
 * 예외처리 2가지 방법 :
 * 1. 직접 처리 : try,catch
 * 2. 예외 전가: throws, 메소드를 호출하는 족에서 예외 처리
 */
// main메소드에 throws를 전가시키는 경우, 종료시켜버림

public class ThrowsExeption_2 {

	public static void main(String[] args) throws ClassNotFoundException{
		//정상적으로 파일 존재. ClassNotFoundException 발생 x
		Class cls = Class.forName("java.lang.Object");
		
		//오류발생
		Class cls2 = Class.forName("java.lang.Object00");
	}

}

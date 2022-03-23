package Chap14.EX02;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class A{
	B b;
	A(){}// 기본생성자
	
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
		//1. 일반 예외 : 컴파일 단계에서 예외 처리가 필요
		//InterruptedException : 스레드 중간에 끼어들기가 발생시 예외 발생
		//Thread.sleep(1000);
		
		//ClassNotFoundException : 클래스를 찾지 못하는 예외
		//Class cls = Class.forName("java.lang.Object");
		
		//IOException : 네트워크에서 값을 못읽어오는 예외
		//System.in : 콘솔을 뜻함
		InputStreamReader in = new InputStreamReader(System.in);
		//in.read();
		//FileNotFoundException : 파일을 찾지 못하는 예외
		//FileInputStream fls = new FileInputStream("text.txt");
		
		//실행예외 (unChecked Exception) : 실행시 발생되는 예외
		A a1 = new A();
		a1.abc(); //컴파일단계에서 오류 x, 실행시 오류 발생
				
	}

}

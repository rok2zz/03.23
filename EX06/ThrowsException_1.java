package Chap14.EX06;
/*
 * 예외처리 2가지 방법 :
 * 1. 직접 처리 : try,catch
 * 2. 예외 전가: throws, 메소드를 호출하는 족에서 예외 처리
 */

class A{
	void abc() {
		
	}
	void bcd() {
		try {
			Thread.sleep(1000); //일반예외 : try,catch 써야함
		}
		catch(InterruptedException e) {
			//e.printStackTrace();
			System.out.println("예외 발생 1");
		}
	}
}

class B{
void abc() {
	try {
		bcd();  //bcd를 예외처리할 의무가 생김
	}
	catch(InterruptedException e) {
		//e.printStackTrace();
		System.out.println("예외2 발생");
	}
	}
	void bcd() throws InterruptedException { //bcd를 호출하는쪽에서 예외처리
		Thread.sleep(1000);
	}
}
public class ThrowsException_1 {

	public static void main(String[] args) {
		
	}

}

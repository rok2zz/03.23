package Chap14.EX03;

//여러개의 Exception이 동시에 발생될 경우 처리

public class MultiCatch_2 {

	public static void main(String[] args) {
		//1. Exception에서 모든 예외 처리 가능

		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(Exception e){
			// Exception 클래스 : 모든 예외 처리 가능
			System.out.println("예외처리(Exception)");
		}
		//2. catch블락의 순서가 잘못 된 경우
		//Exception은 가장 상위 클래스라 catch의 마지막에 위치해야함
		/*try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(Exception e){
			// Exception 클래스 : 모든 예외 처리 가능
			System.out.println("예외처리(Exception)");
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException 발생");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException 발생");
		}*/
		
		//3. catch 블락의 올바른 순서
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException 발생");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException 발생");
		}
		catch(Exception e){
			// Exception 클래스 : 모든 예외 처리 가능
			System.out.println("예외처리(Exception)");
		}
		
		//4. 여러개의 Exception을 통합 적용
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException|NumberFormatException e) {
			
		}
		catch(Exception e) {
			
		}
		
		
		
		
		System.out.println("프로그램 종료");
		
	}

}

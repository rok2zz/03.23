package Chap14.EX02;

//실행예외 (UnChecked Exception, Runtime Exception) : 컴파일오류 x , 실행시 오류

class AA{}
class BB extends AA{}
public class UnCheckedException {

	public static void main(String[] args) {
		// 실행 예외
		//ArithmeticException : 0으로 나눌 때 발생
		//System.out.println(10 / 0);
		
		AA aa = new AA();
		//BB bb = (BB) aa; //컴파일오류 발생 x
		
		//ArrayIndexOutOfBoundException
		int[] array = {1,2,3};
		//System.out.println(array[3]);
		
		//int num = Integer.parseInt("10!"); // 문자열 10을 정수로 변환\불가
		//System.out.println(num);
		
		//NullPointerException : 객체가 null인데 메소드를 호출하는 경우
//		String str = null;
//		System.out.println(str.charAt(2));
	}

}

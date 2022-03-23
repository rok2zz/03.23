package Chap14.EX01;

public class ArrayException_1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			for(int i = 0 ; i<=5;i++) {//실행시 오류 발생
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); //예외에 대한 정보를 출력
			System.out.println("배열의 인덱스 방번호를 넘겼습니다.");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("프로그램 종료");
	}

}

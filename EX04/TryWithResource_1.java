package Chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		//1. 수동 리소스 해제(기존 프로그래머 사용) : 코드가 길고 지저분
		System.out.println("문자를 입력하세요");
		
		//자동 메모리 예제
		try(InputStreamReader isr1 = new InputStreamReader(System.in)){
			char input = (char) isr1.read();
			System.out.println("입력글자 = " + input);
		}
		catch(IOException e){
			e.printStackTrace();
		}//finally 생략시 객체를 자동으로 close
		
		InputStreamReader isr2 = null;
		//System.in : 콘솔에서 입력을 받도록 처리, 1번만 인풋가능
		//객체가 종료되면 두번 인풋 못받음
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();
			//일반예외(checked 예외) : IOEXception : 입출력시 예외
			System.out.println("입력 글자 = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(isr2 != null) {
				try {
					isr2.close(); //IOException 발생
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("==================");
		//2. 자동 리소스 해제(Jav1.7 자동으로 리소스해제) : 코드가 간결(필요조건있음)
			//1. 사용하는 객체가 AutoCloseable 인터페이스를 구현한 객체여야함
			//2. 반드시 객체에 close()가 존재해야함
			// 2조건을 만족시 자동 리소스 해제 가능
			// try (자동으로 리소스 해제할 객체 선언){} catch{}finally{}
		
		//InputStreamReadeer 는 AutoCloseable 인터페이스를 구현하고있음
		// Try with Resourc e: try (with resource 정보)
		try(InputStreamReader isr1 = new InputStreamReader(System.in)){
			char input = (char) isr1.read();
			System.out.println("입력글자 = " + input);
		}
		catch(IOException e){
			e.printStackTrace();
		}//finally 생략시 객체를 자동으로 close
		
		
	}

}

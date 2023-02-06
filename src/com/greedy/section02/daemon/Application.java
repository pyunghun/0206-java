package com.greedy.section02.daemon;

import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) {

		/* 데몬 스레드
		 * 데몬은 리눅스, 유닉스 계열의 운영체제에서 백그라운드에서 동작하는 프로그램을 의미
		 * 이와 비슷하게 동작하도록 만든 것을 데몬쓰레드 라고 한다.
		 * 메인 스레드가 종료 되어도 스레드의 실행 내용을 마저 실행하는 게 일반적이다.
		 * 데몬스레드로 생성한 스레드는 메인스레드가 종료될 때 함께 종료된다.
		 *  */
		
		Thread t = new CountDown();
		t.setDaemon(true);
		
		t.start();
		
		System.out.println(JOptionPane.showInputDialog("아무 문자열이나 입력해보세요"));
		
		
		
		System.out.println("메인쓰레드 종료");
		
		
	}

}

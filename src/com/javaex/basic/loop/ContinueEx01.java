package com.javaex.basic.loop;

public class ContinueEx01 {
	public static void main(String[] args) {
//		1 ~ 20 까지 루프
//		2의 배수와 3의 배수는 출력 안 함
//		나머지는 출력
		
		for(int i=1; i <= 20; i++) {
			if((i % 2 == 0) || (i % 3) == 0) {
				continue;	// 다음 루프로
			}
			System.out.println(i);
		}
	}
}
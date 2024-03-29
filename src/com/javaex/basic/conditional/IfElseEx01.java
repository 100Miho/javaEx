package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx01 {
//	Tip : Ctrl + Space (자동 임포트)
//		  Ctrl + Shift + O (Orgenize Imports - 임포트 정리 - 필요 객체 한꺼번에 임포트 및 정리)
	public static void main(String[] args) {
		// 점수 입력, 60점 이상이면 합격입니다 출력
		
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 점수 입력 받기
		System.out.print("점수 입력 >> ");
		int score = sc.nextInt();
		
		// 점수 비교
		if (score >= 60) {
			// 조건을 만족했을 때
			System.out.println("합격입니다.");
		} else {
			// 조건을 만족하지 않았을 때
			System.out.println("불합격입니다.");
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
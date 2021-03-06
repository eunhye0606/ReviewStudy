/* ==============================
실행흐름 컨트롤(반복문)
javastudy(Test058.java)
================================= */
/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(do ~ while 문) 실습

// 사용자로부터 여러 개의 양의 정수를 입력받고,
// 그 합으 계산하여 출력하는 프로그램을 작성한다.

// 단, -1이 입력되는 순간
// 입력을 중지하고 그동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
// 즉, 『-1』을 입력 중지 커맨드로 활용한다.
// do ~ while 문을 활용하여 문제를 해결할 수 있도록 한다.

// 실행 예 )
// 정수1 입력 : 10
// 정수2 입력 : 5
// 정수3 입력 : 8
// 정수4 입력 : 9
// 정수5 입력 : -1

// >> 현재까지 입력된 정수의 합 : xxxx
//===================================================================
//do ~ while 조건문에 -1이 아닐때 탈출을 하면 결국 -1은 연산에서 제외된다.
package REPEAT;

import java.util.Scanner;

public class Review006
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int user;    //사용자 입력 값.
		int sum = 0; //누적합
		int x = 1; //사용자 입력 카운트하는 변수.
		
		do
		{
			System.out.printf("정수%d 입력 (종료 -1 입력) : ",x++);
			user = sc.nextInt();
			
			sum += user;
			
		} while (user != -1);
		System.out.printf(">> 현재까지 입력된 정수의 합 : "+(sum+1));
	}
}
//결과출력
/*
정수1 입력 (종료 -1 입력) : 100
정수2 입력 (종료 -1 입력) : -100
정수3 입력 (종료 -1 입력) : 500
정수4 입력 (종료 -1 입력) : -500
정수5 입력 (종료 -1 입력) : 100
정수6 입력 (종료 -1 입력) : -1
>> 현재까지 입력된 정수의 합 : 100
*/
 
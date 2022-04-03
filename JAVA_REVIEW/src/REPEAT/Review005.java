/* ==============================
실행흐름 컨트롤(반복문)
javastudy(Test056.java)
================================= */

/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(while 문) 실습

//사용자로부터 원하는 단(구구단)을 입력받아
//해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리한다.



//실행 예 )
//원하는 단(구구단) 입력 : 7
//7 * 1 = 7
//7 * 2 = 14
//7 * 3 = 21
//    :
//7 * 9 = 63
//계속하려면 아무 키나 .......

//원하는 단(구구단) 입력 : 11
//1부터 9까지의 정수만 입력이 가능합니다.
//==========================================================
//do ~ while 문안에 조건으로 변수를 사용하려면
//『초기값』 을 설정해야 한다!
//※ do ~ while 의 while(조건문)
//   조건문 안에가 참이면 반복, 거짓이면 반복 x
package REPEAT;

import java.util.Scanner;

public class Review005
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		String end; // do ~ while 문을 탈출하는 변수.
		int user = 1; //사용자 입력 단 담는 변수.
		int x = 1; //곱해지는 수 1 ~ 9
		
		System.out.println("※종료시, 『.』 입력.");
		System.out.println("구구단 출력 프로그램 실행.");
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("\n원하는 단을 입력하시오 : ");
			end = sc.next();

			//반복문 탈출 → 프로그램 종료.
			if (end.equals("."))
				break;
			
			//입력한 것이 숫자면 user 변수에 담는다.
			user = Integer.parseInt(end);
			
			// 1 ~ 9단만 입력 가능.
			if (user <1 || user > 9)
				System.out.println("<<1 ~ 9단만 입력 가능합니다.>>");
			else
			{
				//구구단 출력하기
				System.out.printf("====[%d단]====\n",user);
				while (x<10)
				{
					System.out.printf("%d x %d = %d\n",user,x,(user*x));
					x++;
				}
				
				//루프변수 초기화
				x = 1;
			}
		} while (true);
		
		System.out.println("프로그램 종료.");
	}
}
//결과출력
/*
※종료시, 『.』 입력.
구구단 출력 프로그램 실행.

원하는 단을 입력하시오 : 10
<<1 ~ 9단만 입력 가능합니다.>>

원하는 단을 입력하시오 : 0
<<1 ~ 9단만 입력 가능합니다.>>

원하는 단을 입력하시오 : 9
====[9단]====
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81

원하는 단을 입력하시오 : 5
====[5단]====
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45

원하는 단을 입력하시오 : 4
====[4단]====
4 x 1 = 4
4 x 2 = 8
4 x 3 = 12
4 x 4 = 16
4 x 5 = 20
4 x 6 = 24
4 x 7 = 28
4 x 8 = 32
4 x 9 = 36

원하는 단을 입력하시오 : .
프로그램 종료.
*/













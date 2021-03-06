/* =======================
제어문(조건문) switch 문
javastudy(Test044.java)
======================= */

/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// switch 문 실습

// 사용자로부터 1부터 3까지의 정수 중 하나를 입력받아
// 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두 가지 방법으로 구현할 수 있도록 한다.

//① switch 문의 일반 모델을 사용한다.
//② switch 문의 기본 모델을 사용하되,
//   『break』를 딱 한 번만 사용할 수 있도록 구성한다.

// 실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나...

// 임의의 정수 입력(1~3) : 1
// ★ 
// 계속하려면 아무 키나...

// 임의의 정수 입력(1~3) : 7
// 입력 오류 ~ !!

package CONTROL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Review012
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("※ 종료 『.』 입력.");
			System.out.print("임의의 정수 입력 (1 ~ 3) : ");
			
			try
			{
				String user = br.readLine();
				
				if (user.equals("."))
					break;
				else
				{
					if (Integer.parseInt(user) < 1 || Integer.parseInt(user) > 3)
					{
						System.out.println("입력 가능 범위는 1 ~ 3 입니다.\n");
					}
					else
					{
						//기본모델
						/*switch (Integer.parseInt(user))
						{
						case 3: System.out.print("♥");
						case 2: System.out.print("♥");
						case 1: System.out.print("♥\n");
						}*/
						
						//일반모델
						switch (Integer.parseInt(user))
						{
						case 1: System.out.println("★"); break;
						case 2: System.out.println("★★"); break;
						case 3: System.out.println("★★★"); break;
						}
					}
				}
			} catch (Exception e)
			{
				System.out.println(e.toString());
			}
			
		} while (true);
		System.out.println("프로그램 종료.");
	}
}
//결과출력
//기본모델
/*
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 0
입력 가능 범위는 1 ~ 3 입니다.

※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 1
♥
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 2
♥♥
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 3
♥♥♥
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 2
♥♥
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : .
프로그램 종료.
*/

//일반모델
/*
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 4
입력 가능 범위는 1 ~ 3 입니다.

※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 1
★
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 2
★★
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 3
★★★
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : 2
★★
※ 종료 『.』 입력.
임의의 정수 입력 (1 ~ 3) : .
프로그램 종료.
*/














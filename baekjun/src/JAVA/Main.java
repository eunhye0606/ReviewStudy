/*
 * ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.

���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�.
1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
������, 2000���� 400�� ����̱� ������ �����̴�.
 * */

package JAVA;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int year;
		System.out.print("�⵵�� �Է��Ͻÿ� : ");
		
		Scanner sc = new Scanner(System.in);
		
		year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		
	}
}
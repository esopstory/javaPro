package days06;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String[] args) throws IOException {
//		1. -1/2+2/3-3/4+..+6/7-7/8+8/9=??? 출력하는 코딩을 하세요. ( 반복문 사용 )
		double dSum = 0.0;
		
		int i = 0, j = 0;
		boolean sw = false;
		
		
		for (i =1; i  <= 8; i++) {			
			if(sw)
				dSum += i * -1 / (double)(i + 1);
			else
				dSum += i / (double)(i + 1);
			for (i = 1; i  <= 8; i++) {			
				System.out.printf("%c %d/%d ",(sw ? '+' : '-'), i, i + 1);
				sw = !sw;
			}
			
			sw = !sw;
		}
		System.out.printf("Sum = %.2f\n", dSum);
//
//		2. String 을  char[]로 변환해서 출력하는  코딩을 하세요 
			String msg = "hello world";
			char [] msgArr = msg.toCharArray();
			
		System.out.printf("Result %s\n", Arrays.toString(msgArr));
		
		char[] msgArrs = new char[msg.length()];
		for(i = 0; i< msg.length();i++)
		{
		
		}
		System.out.printf("Result %s\n", Arrays.toString(msgArr));
		
//				2-2. char [] 을 다시 String 변환하는 코딩을 하세요 . 
		msg = null;
		msg = msgArr.toString();

//				3. ASCII 을 한 라인에 7개씩 출력하고 
//				   각 라인마다 라인번호를 붙이고
//				   10개의 라인이 출력 후 "엔터키를 치면 진행" 하도록 
//				   코딩하세요.
		int iLineNumber = 1;
		for(i = 0; i < 256;i++)
		{
			System.out.printf("[%c]",  (char)i);
			if(i % 7 == 0) 
			{
				if( iLineNumber != 1 && (iLineNumber - 1) % 10 == 0)
				{
					System.out.print("\n\t\t계속하려면 엔터를 치세요...");
					System.in.read();
				}
				System.out.println();
				System.out.printf("%02d : ", iLineNumber++);
			}
			
		}
//
//				4. 로또 번호를 중복체크 해서 출력하는 코딩을 하세요. 
				   int [] lotto = new int[6]; 
				   int index = 0;
				   
				while(index < 6)
				{
					int n = (int)(Math.random() * 45) + 1;
					for(i = 0; i <= index;i++)
					{
						if(lotto[index] == 0)
							
							
						{
							lotto[index] = n;
							index++;
							break;
						}
						else if(lotto[index] == n)
						{							
							break;
						}
					}
				}
				System.out.println(Arrays.toString(lotto));
//				4-2. 로또 번호 6숫자를 람다식과 스트림을 사용해서 코딩하세요.        
//				   
//				5. break문과 continue 문에 대해서 설명하세요. 
//				5-2. 두 정수(n,m)을 입력받아서 두 정수 사이의 짝수의 합을 구해서 출력하는 코딩을 하세요.
				//입력ㅂ다은 두 정수의 크기를 구해서 시작과 끝을 맞추고 홀수일시 +1을 하여 +=2 로 루프진행
				
//				6. int [] m = new int[10];
//				  m 배열에 1~100까지의 정수를 중복되지 않게 채워넣고
//				  가장 큰 값을 찾아서 출력하세요.
//				6-2. 위의 코딩을 람다식과 스트림을 사용해서 코딩하세요. 
//
//				7. 한 문자를 입력받아서 "대문자", "소문자", "숫자", "한글", "특수문자" 라고
//				   출력하는 코딩을 하세요.
//				   ( 특수문자는 # ! @ % )
//				'A' <= one <= 'Z'
//				'a' <= one <= 'z'
//				'0' <= one <= '9'
//				한글 시작 값 <= one
//				0 <= one <=32
//				   
//				   char one;   
	} // main
}

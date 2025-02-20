package days05;

import java.util.Scanner;

public class Ex07_02 {
	public static void main(String[] args) {
		int iSeq = 0;
		int iCount = 0;
		int iBas = 0;
		
		boolean[] bNum = new boolean[32];
		
		Scanner scanner = new Scanner(System.in);
		
			iSeq = (int)(Math.random() *2);
		
			System.out.printf("%s(이)가 먼저 시작합니다.\n", iSeq == 0? "컴퓨터" : "인간");
		
		do
		{
			if(iSeq == 0)
			{
				iCount = (int)(Math.random() *3) + 1;
				System.out.printf("컴퓨터가 숫자를 %d개를 입력합니다\n", iCount);
				
				for (int i = 0; i < iCount; i++) 
				{
					iBas = (int)(Math.random() *31) + 1;
					if(iBas == 31)	
					{
						System.out.print("컴퓨터가 31을 입력하였습니다\n");
						break;
					}
					if(bNum[iBas] == false)
					{
						bNum[iBas] = true;
						System.out.printf("컴퓨터 입력숫자: <%d>\n", iBas);
						for(int j = 1; j < bNum.length; j++)
						{
							System.out.printf("%c", bNum[j] == true ? 'O' : 'X');
							if(j % 5 == 0)
								System.out.print(" ");
						}
						System.out.println("");
						
					}
					else
						i--;
				} 
				iSeq = 1;
			}
			else
			{
				iCount = 1;
				System.out.print("입력하려는 숫자의 갯수를 입력하세요(1 ~3, 기본 1개): ");
				
				if(scanner.hasNextInt())
				{
					iCount = scanner.nextInt();	
					if(iCount > 3 || iCount < 1)
						iCount = 1;
				}
				
				System.out.printf("숫자 %d 개를 입력하세요", iCount);				
				for (int i = 0; i < iCount; i++) 
				{					
					if(scanner.hasNextInt())
					{
						iBas = scanner.nextInt();		
					}
					if(iBas == 31)		
						break;
					
					if(bNum[iBas] == false)
					{
						bNum[iBas] = true;
						System.out.printf("인간 입력숫자: <%d>\n", iBas);
						for(int j = 1; j < bNum.length; j++)
						{
							System.out.printf("%c", bNum[j] == true ? 'O' : 'X');
							if(j % 5 == 0)
								System.out.print(" ");
						}
						System.out.println("");
						
					}
					else
					{
						System.out.printf("중복된 숫자입니다. %d\n다른 숫자를 입력하세요: ", iBas);
						i--;
					}
				}
				iSeq = 0;
			}
			if(iBas == 31)
			{
				System.out.println(iSeq == 1 ? "인간승리" : "컴퓨터승리");
				break;
			}
		}while(true);
		
		scanner.close();
	}
}

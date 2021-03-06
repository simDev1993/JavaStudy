package mymain;

import java.util.Scanner;

public class _Q2_마름모찍기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chasu;
		String yn = "y";
		
		while(true) 
		{
			System.out.print("차수 입력 : ");
			chasu = scanner.nextInt();
			int center = chasu/2;
			
			if(chasu % 2 == 0) {
				System.out.println("홀수만 입력하세요.");
				continue;
			}
			
			for(int i = 0; i < chasu; i ++) {
				for(int j = 0; j < chasu; j++) {
					//상단
					if(i <= center) 
					{
						if(j >= center-i && j <= center+i) {
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//하단
					else 
					{
						int k = chasu -1 - i; 
						if(j >= center-k && j <= center+k) {
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
			
			//다시하기 여부 확인
			System.out.print("또? (y/n)");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
		}
		
		System.out.println("--------[END]--------");
		
		scanner.close();
	}

}

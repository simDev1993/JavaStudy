import java.io.IOException;

public class _Q12_제어문연습13 {

	public static void main(String[] args) throws IOException {
		
		int ch;
		int alpha_cnt = 0;
		int arith_cnt = 0;
		int white_cnt = 0;
		int special_cnt = 0;
		
		System.out.println("데이터를 입력하세요. 끝내려면 [Ctrl] + Z를 누르세요.");
		do 
		{
			ch = System.in.read();
			
			if(ch == -1) break;
			
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a') && (ch <= 'z')) {
				alpha_cnt++;
			}else if(ch >= '0' && ch <= '9') {
				arith_cnt++;
			}else if(ch == '\t' || ch == '\r' || ch == '\n' || ch == ' ') {
				white_cnt++;
			}else {
				special_cnt++;
			}
			
			System.out.printf("%c",ch);
			
		}while(true);
		System.out.println("-------- 갯수 --------");
		System.out.printf("알파벳 문자 : %d%n", alpha_cnt);
		System.out.printf("숫자 : %d%n", arith_cnt);
		System.out.printf("화이트 문자 : %d%n", white_cnt);
		System.out.printf("특수 문자 : %d%n", special_cnt);
	}

}


public class _Q06_제어문연습7 {

	public static void main(String[] args) {
		System.out.println("정수값	  제곱      세제곱");
		System.out.println("------------------------------");
		
		for(int i = 0; i <= 5; i++) {
			System.out.printf("%-10d%-10d%-10d\n",i,i*i, (int)Math.pow(i,3) /*i*i*i*/);
		}
	}

}

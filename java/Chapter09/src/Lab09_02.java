import java.util.Scanner;
public class Lab09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] score = new int[5];
		int sum = 0;
		double avg;
		
		System.out.println("김연아 선수의 경기가 끝났습니다.");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("평가 점수 ==> ");
			score[i] = s.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			sum += score[i];
		}
		avg = (double) sum / 5;
		
		System.out.printf("심사위원 점수: %5.2f", avg);
		
		s.close();
	}

}

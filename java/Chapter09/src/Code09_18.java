import java.util.Scanner;
public class Code09_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int row, col;
		
		System.out.print("행 개수 입력: ");
		row = s.nextInt();
		
		System.out.print("열 개수 입력: ");
		col = s.nextInt();
		
		int[][] ary = new int[row][col];
		int value = 1;
		
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++) {
				ary[i][k] = value;
				value++;
			}
		}
		
		System.out.printf("ary[0][0]부터 ary[%d][%d]까지 출력 \n", row, col);
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++) {
				System.out.printf("%3d", ary[i][k]);
			}
			System.out.println();
		}
	}

}

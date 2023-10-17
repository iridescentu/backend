
public class Code09_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] ary = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
		
		System.out.printf("ary[0][0]부터 ary[2][3]까지 출력 \n");
		
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 4; k++) {
				System.out.printf("%3d", ary[i][k]);
			}
			System.out.printf("\n");
		}
	}

}

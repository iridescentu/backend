
public class Code09_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] ary  = new int[3][4];
		
		ary[0][0] = 1; ary[0][1] = 2; ary[0][2] = 3; ary[0][3] = 4;
		ary[1][0] = 5; ary[1][1] = 6; ary[1][2] = 7; ary[1][3] = 8;
		ary[2][0] = 9; ary[2][1] = 10; ary[2][2] = 11; ary[2][3] = 12;
		
		System.out.printf("ary[0][0]부터 ary[2][3]까지 출력 \n");
		
		System.out.printf("%3d%3d%3d%3d\n", ary[0][0], ary[0][1], ary[0][2], ary[0][3]);
		System.out.printf("%3d%3d%3d%3d\n", ary[1][0], ary[1][1], ary[1][2], ary[1][3]);
		System.out.printf("%3d%3d%3d%3d\n", ary[2][0], ary[2][1], ary[2][2], ary[2][3]);
	}

}

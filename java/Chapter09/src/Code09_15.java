
public class Code09_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


		
		// 2중 for문
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				B[i][j] = A[i][j];
			}
		}
		
		// 반복문 + System.arraycopy()
		int[][] C = new int[A.length][A[0].length]; // C 선언
		for (int i = 0; i < A.length; i++) {
			System.arraycopy(A[i], 0, C[i], 0, C[i].length 
					);
		}
	}

}

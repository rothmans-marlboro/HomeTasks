package HomeTask3;

public class TaskAddNumber1 {
	// obtain a sequence of elements of the main and auxiliary diagonals
	public static void main(String[] args) {
		int matrix[][] = { { 1, 6, 2, 7 }, { 5, 7, 3, 6 }, { 4, 8, 9, 2 }, { 2, 1, 6, 8 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
				// for clarity, I decided to bring the matrix to the console
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		int n;
		for (n = 0; n < matrix.length; n++) {
			System.out.print(matrix[n][n]);
		}
		System.out.print(" ");
		for (n = 0; n < matrix.length; n++) {
			int s = n;
			int p = matrix.length - 1 - s;
			System.out.print(matrix[s][p]);
		}
	}
}
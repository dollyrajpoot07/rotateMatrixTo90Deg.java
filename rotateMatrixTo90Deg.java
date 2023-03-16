// Given a square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.

// Input:
//  1  2  3
//  4  5  6
//  7  8  9
// Output:
//  3  6  9 
//  2  5  8 
//  1  4  7 
// Rotated the input matrix by
// 90 degrees in anti-clockwise direction.

// Input:
//  1  2  3  4 
//  5  6  7  8 
//  9 10 11 12 
// 13 14 15 16 
// Output:
//  4  8 12 16 
//  3  7 11 15 
//  2  6 10 14 
//  1  5  9 13
// Rotated the input matrix by
// 90 degrees in anti-clockwise direction.



import java.util.*;

class rotateMatrixTo90Deg {

	static void rotateby90(int arr[][]) {
		int n = arr.length;
		int a = 0, b = 0, c = 0, d = 0;

		for (int i = 0; i <= n / 2 - 1; i++) {

			for (int j = 0; j <= n - 2 * i - 2; j++) {
				a = arr[i + j][i];
				b = arr[n - 1 - i][i + j];
				c = arr[n - 1 - i - j][n - 1 - i];
				d = arr[i][n - 1 - i - j];

				arr[i + j][i] = d;
				arr[n - 1 - i][i + j] = a;
				arr[n - 1 - i - j][n - 1 - i] = b;
				arr[i][n - 1 - i - j] = c;
			}
		}
	}
	static void printMatrix(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 },
						{ 13, 14, 15, 16 } };

		rotateby90(arr);
		printMatrix(arr);
	}
}


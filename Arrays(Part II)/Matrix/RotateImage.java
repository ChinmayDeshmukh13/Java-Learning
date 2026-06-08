package Matrix;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i<j) {
                    swap(matrix, i, j);
                }
            }
        }

        for (int column = 0; column < n; column++) {
            int left = 0; 
            int right = n-1;
            while(left < right) {
                int temp = matrix[column][left];
                matrix[column][left] = matrix[column][right];
                matrix[column][right] = temp;
                left++;
                right--;
            }    
        }
    }

    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}

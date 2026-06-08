package Matrix;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 13;
        if(searchMatrix(matrix, target)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix == null || target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m-1;
        int targetRow = 0;
        int left = 0;
        int right = n-1;
        while(top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (matrix[mid][0] <= target && target <= matrix[mid][n-1]) {
                targetRow = mid;
                break;
            }
            else if(target < matrix[mid][0]) {
                targetRow = mid;
                bottom = mid - 1;
            }
            else {
                top = mid + 1;
            }
        }
        if (targetRow == -1) {
            return false;
        }

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(matrix[targetRow][mid] == target) {
                return true;
            }
            else if(matrix[targetRow][mid] > target) {
                right = mid - 1; 
            }
            else {
                left = mid + 1;
            }
        }
        return false;
    }
}

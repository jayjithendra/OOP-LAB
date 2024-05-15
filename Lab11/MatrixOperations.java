class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public void displayTranspose() {
        System.out.println("Transpose of Matrix:");
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayMaxValue() {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        System.out.println("Maximum value in the matrix: " + max);
    }

    public void displayPrincipalDiagonal() {
        System.out.println("Principal Diagonal Elements:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + "\t");
        }
        System.out.println();
    }

    public void displayNonDiagonal() {
        System.out.println("Non-Diagonal Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
        System.out.println();
    }
}

public class MatrixOps {
    public static void main(String[] args) {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(data);

        Thread t1 = new Thread(() -> matrix.displayMatrix());
        Thread t2 = new Thread(() -> matrix.displayTranspose());
        Thread t3 = new Thread(() -> matrix.displayMaxValue());
        Thread t4 = new Thread(() -> matrix.displayPrincipalDiagonal());
        Thread t5 = new Thread(() -> matrix.displayNonDiagonal());

        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join();
            t5.start();
            t5.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

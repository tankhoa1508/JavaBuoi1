public class Array {
    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        int[] [] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++ ) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Tính tổng đường chéo chính
        int tong=0;
        for (int i =0; i< matrix.length; i++) {
            tong+= matrix[i][i];
        }
        System.out.printf("Tổng đường chéo chính là: %d", tong);
        System.out.println();
        int tong1=0;
        for (int i=0; i< matrix.length; i++){
            tong1+=matrix[i][matrix.length-i-1];
        }
        System.out.printf("Tổng đường chéo chính là: %d", tong1);
    }
}

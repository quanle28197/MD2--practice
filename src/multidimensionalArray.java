public class multidimensionalArray {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {8, 9 , 10},
                {11, 12, 13, 14, 15},
                {43, 14, 15, 76, 45, 78}
        };

        double max = Double.NEGATIVE_INFINITY;
        for (int[] ints : array ) {
            for (int anInt: ints) {
                if(anInt> max) {
                    max = anInt;
                }
            }
        }
        System.out.println("max = " + max);
    }
}

public class star_prob {
    public static void main(String[] args) {

        /*int row;
        for (row = 1; row <= 5; row++) {
            for (int col = 4; col >= row; col--) {
                System.out.print(" ");}
                for (int col = 5; col <= 9; col++){
                    System.out.print("*");
                }

            System.out.println();
        } */
        for (int row = 1; row <= 5; row++) {
            for (int col = 4; col >= row; col--) {
                System.out.print("-");
            }
                System.out.println();
        }
        for(int row = 1; row <=5; row++){
            for(int col = 1; col>=row ; col++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

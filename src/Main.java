import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String A[][] = new String [4][4];
        final String key = "home";
        for (int x=0;x<4;x++) {
            for (int y=0;y<4;y++) {
                A[x][y] = "outside";
            }
        }
        A[1][2] = "home";
        System.out.println("given two-dimensional array: ");
        for (String[ ] i : A) {
            System.out.println(Arrays.toString(i));
        }
        for (int x=0;x<4;x++) {
            for (int y=0;y<4;y++) {
                if (A[x][y] == "home") {
                    System.out.println ("key found at row " + y + " and column " + x);
                }
            }
        }
    }
}
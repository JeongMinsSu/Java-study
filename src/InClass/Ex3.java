package InClass;

public class Ex3 {
    public static void main(String[] args) {
        int a[][] = new int [5][5];
        int k =0;

        for(int i=0; i<5; i++){
            for (int j = (4-i); j < 5; j++) {
                a[i][j] = ++k;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}

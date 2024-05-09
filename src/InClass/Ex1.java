package InClass;

public class Ex1 {
    public static void main(String[] args) {

        int sw = 0;
        int h = 0;
        for(int i = 3; i <= 100; i++) {
            h = i/2;
            for(int j = 2; j <= h; j++) {
                if(i % j == 0) {
                    sw = 1;
                    break;
                }
            }
            if(sw == 0) {
                System.out.println(i);
            }
            sw = 0;
        }
    }
}

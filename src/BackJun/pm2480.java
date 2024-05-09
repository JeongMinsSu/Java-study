package BackJun;

import java.util.Scanner;

public class pm2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;

//        1. 같은 눈이 3개
//        2. 같은눈 2개
//        3. 모두 다른 눈
        if (a == b && b == c) {
            result = 10000+(a*1000);
            System.out.println(result);
        } else if (a==b || a==c || b ==c) {
            if (a == b) {
                result = 1000+(a*100);
                System.out.println(result);
            }
            if (a == c) {
                result = 1000+(a*100);
                System.out.println(result);
            }
            if (b == c) {
                result = 1000+(b*100);
                System.out.println(result);
            }
        } else {
            if(a>b&&a>c){
                System.out.println(a*100);
            }
            if(b>a&&b>c){
                System.out.println(b*100);
            }
            if(c>a&&c>b){
                System.out.println(c*100);
            }
        }
    }
}

package BackJun;

import java.util.Scanner;

public class pm2525 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        int C = in.nextInt();

        int min = 60 * A + B;   // 시 -> 분
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);

    }
}
//import java.util.Scanner;
//
//public class pm2525 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt(); // 시
//        int B = sc.nextInt(); // 분
//        int C = sc.nextInt(); // 분
//
//        if(B+C>=60){
//          A += (B+C)/60;
//          B = (B+C)%60;
//          if(A>=24){
//              A = 0;
//              A += (B+C)/60;
//          }
//        }else{
//            B += C;
//        }
//        System.out.print(A + " " + B);
//    }
//}

package BackJun;

import java.util.Scanner;

public class pm2884 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int H = sc.nextInt();
//        int M = sc.nextInt();
//        if((23>=H && H>=0) && (0<=M && M<=59)){
//            if(H>0&&M<45){
//                System.out.print(H-1);
//                System.out.print(" ");
//                System.out.print((M+60)-45);
//            }else if(H==0&&M<45){
//                System.out.print(H+23);
//                System.out.print(" ");
//                System.out.print((M+60)-45);
//            }else if(H>0&&M>45){
//                System.out.print(H);
//                System.out.print(" ");
//                System.out.print(M-45);
//            }
//        }
        Scanner in = new Scanner(System.in);

        int H = in.nextInt(); // 시
        int M = in.nextInt(); // 분
        in.close();

        if(M < 45) {
            H--;		// 시(hour) 1 감소
            M= 60 - (45 - M); 	// 분(min) 감소
            if(H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        }
        else {
            System.out.println(H + " " + (M - 45));
        }
    }
}

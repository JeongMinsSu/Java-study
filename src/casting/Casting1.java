package casting;

import java.util.Scanner;

public class Casting1 {
    public static void main(String[] args) {
        // 홀수 짝수 판별 알고리즘
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println( num + " = 짝수입니다.");
        }else{
            System.out.println( num + " = 홀수입니다.");
        }
    }
}

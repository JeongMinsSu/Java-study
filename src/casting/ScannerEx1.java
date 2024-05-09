package casting;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력한 값이 종료일때 종료");

        while (true) {
            System.out.println("입력한 값 : ");
            String s1 = sc.nextLine();
            if(s1.equals("종료")){
                break;
            }
        }

    }
}

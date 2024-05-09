//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        int[] A = {10,20,30,40,50};
        int sum = 0;
        for (int i =0;i<5;i++){
            // 카드게임 5회 진행
            // 각 회차마다 정수 A가 있
            sum += A[i];
        }
        System.out.println("총합 : " + sum );
    }
}
package InClass;

public class Ex2 {
    public static void main(String[] args) {
        int dan = 2;
        int i=0,j=0,k=0,l=0;
        for(k = 2; k<=6; k+=4){
            for(l=k; l<=k+3; l++){
                System.out.printf("  [ %d 단 ]", l);
            }
            System.out.println();
    // 2부터 5단까지 먼저 출력
            for(j = 1; j<=9; j++){
                for(i=k; i<=(k+3); i++){
                    System.out.printf(" %d * %d =%2d",i,j,i*j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

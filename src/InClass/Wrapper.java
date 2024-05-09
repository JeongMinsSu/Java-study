package InClass;

public class Wrapper {
    public static void main(String[] args) {
       String str = new String("ab,ij");
       String[] parts = str.split(",");
       for(String part : parts){
           System.out.println(part);
       }
    }
}

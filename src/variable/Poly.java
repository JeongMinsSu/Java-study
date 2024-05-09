package variable;

public class Poly {
    void print() {
        System.out.println("부모 poly");
    }
}
class Minipoly extends Poly{
    @Override
    public void print(){
        System.out.println("자식 poly");
    }
}
 class Test {
    public static void main(String[] args) {
        Poly p1 = new Poly(); // 자기자신 객체 생성
        Minipoly mp1 = new Minipoly();
        Poly p2 = new Minipoly();
        p1.print();
        mp1.print();
        p2.print();
    }

}
package sec1;
//제네릭<참조형> 인스턴스명 = new 생성자함수<>();
//인스턴스명.setType(지정한참조형에맞는값)
public class GenEx1 {
    public static void main(String[] args) {
        //제네릭은 타입이 반드시 기본타입이 아닌 참조형이어야 한다.
        Gen1<Integer> g1 = new Gen1<>();
        g1.setType(20);
        System.out.println("결과 :"+g1.getType());

        Gen1<Member> g2 = new Gen1<>();
        Member m1 = new Member();
        m1.setId(1);
        m1.setName("김보경");
        g2.setType(m1);
        System.out.println(m1.toString());
    }
}

package sec1;
/*
클래스명.java 파일인 경우 반드시 파일이름과 같은 public 클래스가 하나만 있어야함.
[접근제한자] class 클래스이름 {
    final static 데이터타입 필드명; //상수멤버필드
    [접근제한자] [지시자] 데이터타입 필드명;   //멤버필드
    [접근제한자] [지시자] 하위클래스명  객체명,  //멤버객체(클래스)
    public 클래스명([매개변수타입 매개변수명]) { } //생성자
    [접근제한자] [지시자] 반환타입 메소드명([매개변수타입 매개변수명]) { } //멤버메소드
}
 */
/*
접근제한자 : 접근 제한 범위를 지정할 수 있는 선언자로서 public > protected > default > private
private : 필드에만 적용 -> 현재 클래스내에서만 접근
default : 필드, 메소드, 클래스 -> 현재 패키지내에서만 접근
protected : 필드, 메소드에만 적용 -> 현재 패키지내 또는 상속관계에서만 접근
public : 필드, 메소드, 생성자, 클래스 -> 현재 패키지를 포함한 다른 패키지에서도 접근

특수한 경우가 아니면, class는 접근제한자가 public이며, 필드는 private을 적용하여 같은 클래스내에서만
접근이 가능할 수 있게하고, 다른 클래스에서는 클래스 내부에 있는
(public) getter/setter의 메소드에 의해 접근,
생성자 외부에서 클래스(생성자)를 활용하여 생성할 수 있도록
*/
/*
지시자 : 클래스 자신이나 또는 멤버의 활용을 제한할 수 있음 -> modifier(제한)
final : 클래스(더 이상 상속하지 않을 때), 메소드(오버라이딩을 하지 않게 하고 싶은 경우),
    필드(값을 변경하지 못하게 하는 상수 선언시 사용)
static : 메소드(인스턴스를 생성하지 않고, 사용하고 싶은 메소드),
    필드(공통저장소로서 인스턴스를 생성하지 않고, 같은 기억장소를 가지게 할 때)
abstract : 클래스에도 abstract 지정, 해당 메소드에도 abstract 지정 -> 추상 클래스
    메소드인 멤버에만 추상화(abstract)할 수 있다.
*/
class Body {
    private int legs;
}

abstract class Head {
    void play(){
        System.out.println("놀고 있네");
    }
    abstract void stop();
}

public class People {
    private String name;
    private String id;
    private String pw;
    private String addr;
    private Body b;
    public static int k = 10;

    public static void mani(){
        System.out.println("많이 드세요~!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

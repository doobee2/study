package sec1;
//제네릭(Generic) : 어떠한 형태도 공통으로 데이터를 받을 수 있도록한
// 외부에서 데이터 타입을 정하는 구조
/*
public class 클래스이름<대표변수> { 멤버; }
대표변수는 기본타입이 아닌 클래스나 레퍼런스 타입이어한다.
 */
public class Gen1<T> {
    private T type;
    public T getType() {  return type;  }
    public void setType(T type) { this.type = type;  }
}

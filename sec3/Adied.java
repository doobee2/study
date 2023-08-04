package sec1;
//추상화할 메소드만 선언만 한다.
//매개변수, 반환값 등의 유무를 정확히 상속받는 클래스도 일치되어야 함.
public interface Adied {
    void play();    //매개변수X, 반환값X
    int speedUp();
    void speedPrint(int a);
    int speedDown(int a);
}

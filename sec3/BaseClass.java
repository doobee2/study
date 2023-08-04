package sec1;

public class BaseClass {
    public static void main(String[] args) {
        String[] arr = {"김","이","박","최","정","오"};
        String[] arr2 = {"김","kkt09072","1234","가산동"};
        //배열과 같은 기억장소에 여러 데이터를 저장하여
        //활용하는 경우는 데이터 구분이나 접근이 힘들다.
        //해당 데이터의 위치나 불러온 데이터의 정체를 알 길 없음
        //객체 지향형은 해당 데이터의 정체를 쉽게 알 수 있고,
        //서로 관련성이 있는 것끼리 묶을 수 있는 장점이 있으며,
        //정보은닉, 캡슐화 , 재사용성, 다형성(오버라이딩, 오버로딩, 형변환,..)
        //상속성 등의 특성이 있어 활용도가 높음
        //객체 생성 문법
        //클래스명  객체1 = new 생성자함수();
        People p1 = new People();
        p1.mani();
        People.mani();
        p1.k = 100;
        People.k = 500;
        System.out.println(p1.k);
        System.out.println(People.k);

        Giral a1 = new Giral();
        Adied a2 = new Giral();
        a2.play();
        //a1 = new Yoem();
        a2 = new Yoem();
        a2.play();
    }
}
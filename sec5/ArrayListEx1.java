package sec2;
import java.util.*;
import sec1.Member;
//컬렉션프레임워크(Collection Framework) : 하나의 데이터가 아닌 여러 개의
//데이터를 하나의 저장소에서 쉽게 관리할 수 있도록 자바에서 기본으로 제공하는 제네릭타입
public class ArrayListEx1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(60); //요소 추가
        l1.add(100);
        l1.add(90);
        l1.add(80);
        l1.add(85);
        l1.add(95);
        l1.remove(2);

        ArrayList<Member> l2 = new ArrayList<>();
        for(int i=0;i<10;i++){
            Member mem = new Member();
            mem.setId(i);
            mem.setName("김보경"+i);
            l2.add(mem);
        }

        System.out.println("l1의 요소1");
        for(Integer i:l1){
            System.out.println(i);
        }

        System.out.println("l1의 요소2");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        System.out.println("l2의 요소1");
        for(Member m:l2){
            System.out.println("번호 : "+m.getId());
            System.out.println("이름 : "+m.getName());
        }
        System.out.println();
        System.out.println("l2의 요소2");
        for(int i=0;i<l2.size();i++){
            Member m = l2.get(i);
            System.out.println("번호 : "+m.getId());
            System.out.println("이름 : "+m.getName());
        }
        //리스트의 요소 비우기 : l1.clear()
        //해당요소가 있는지 검사 : l1.contains(값)
        //해당요소가 비어 있는지 검사 : l1.isEmpty()
        //해당 요소 지우기 : l1.remove(인덱스)
        //리스트의 요소 수 : l1.size()
        //해당 인덱스 위치의 요소 접근(가져오기) : l1.get(인덱스)
        //해당 인덱스 위치의 요소 접근(저장하기) : l1.set(인덱스, 값)
        //요소 추가 : l1.add([인덱스,] 값)
    }
}

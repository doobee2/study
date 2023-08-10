package sec2;
import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("kor", 100);    //요소 추가
        m1.put("eng", 80);
        m1.put("mat", 95);
        m1.put("sci", 90);
        m1.put("his", 90);
        //특정 키에 해당하는 요소 제거 : m1.remove("eng");
        //모두 비우기 : m1.clear();
        //요소 추가 : m1.put(키, 값)
        //키만 추출하여 Set으로 저장 : m1.keySet()
        //특정 키에 해당하는 값만 접근 : m1.get(키)

        System.out.println("순회1");
        //순회 : Entry 이용
        for(Map.Entry<String, Integer> entry : m1.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("순회2");
        //순회 : keySet() 이용
        for(String k : m1.keySet()){
            System.out.println(k+":"+m1.get(k));
        }
        System.out.println("순회3");

        //순회 : entrySet().iterater()
        Iterator<Map.Entry<String, Integer>> ent = m1.entrySet().iterator();
        while(ent.hasNext()){
            Map.Entry<String, Integer> entry = ent.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("순회4");
        Iterator<String> keys = m1.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(key+":"+m1.get(key));
        }
    }
}

package sec1;

public class GenEx2 {
    public static void main(String[] args) {
        Gen2<String, Integer> g2 = new Gen2<>();
        g2.setKey("kor");
        g2.setValue(90);
        System.out.println(g2.getKey()+":"+g2.getValue());
    }
}

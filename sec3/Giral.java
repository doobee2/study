package sec1;

public class Giral implements Adied {
    @Override
    public void play() {
        System.out.println("플레이");
    }

    @Override
    public int speedUp() {
        return 100;
    }

    @Override
    public void speedPrint(int a) {
        System.out.println("속도 : "+a);
    }

    @Override
    public int speedDown(int a) {
        return a-10;
    }
}

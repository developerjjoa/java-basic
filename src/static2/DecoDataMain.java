package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("4. 정적 메서드에 참조값을 매개변수로 받아 인스턴스 변수와 메서드 사용하기");
        DecoData.staticCall(data1);
    }
}

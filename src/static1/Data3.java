package static1;

public class Data3 {
    public String name;
    public static int count; //static 변수

    public Data3(String name) {
        this.name = name;
        //Data3.count++ 해야하지만 내 클래스 안이기 때문에 이렇게 해도 됨
        count++;
    }
}

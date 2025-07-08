package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException 예외 발생
        System.out.println("bigData.data.value = " + bigData.data.value);

        //System.out.println("bigData.data.value = " + x001.data.value);

        //System.out.println("bigData.data.value = " + null.value);
    }
}

package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value); //dataA.value = 10
        System.out.println("dataA = " + dataA); //dataA = x001
        changeReference(dataA); //x001.value = 20;
        System.out.println("메서드 호출 후 dataA.value = " + dataA.value); //dataA.value = 20;
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX); //dataX = x001
        dataX.value = 20; //x001.value = 20;
    }
}

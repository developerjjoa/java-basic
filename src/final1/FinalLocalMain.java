package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        System.out.println("data1 = " + data1);
        //data1 = 20; // 컴파일 오류

        //final 지역 변수2
        final int data2 = 10;
        System.out.println("data2 = " + data2);
        //data2 = 20; //컴파일 오류(값이 10으로 이미 들어가 있기 때문에 컴파일 오류)

        //method(final int parameter) 밑에 코드로 이미 파라미터에 값 10을 전달해 주었기 때문에
        method(10);
    }

    static void method(final int parameter) {
        //parameter = 20; //컴파일 오류, parameter는 final로 이미 method 호출 시 parameter 값에 10이 들어와서
        System.out.println("parameter = " + parameter);
    }
}

package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();//x001
        System.out.println("bigData = " + bigData);//x001

        //BigData.data는 null로 초기화 되기 때문에 new Data()로 Data 인스턴스를 만들고 BigData.data 멤버 변수에 참조값을 할당하면 된다.
        bigData.data = new Data(); //x002
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data); //x002

        //NullPointerException 예외 발생 오류 해결
        System.out.println("bigData.data.value = " + bigData.data.value); //x001.data.value -> x002.value -> 결과값 0
    }
}

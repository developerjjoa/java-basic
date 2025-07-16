package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    //static final이 붙으면(공용변수) 변수 이름을 다 대문자로 써야하는게 관례

    final int value = 10;

    //이미 위에서 final int value = 10으로 할당했기 때문에 생성자를 통해서도 바꾸지 못함
    /*
    public FieldInit(int value) {
        this.value = value;
    }*/
}

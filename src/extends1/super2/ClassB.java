package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        //super();//매개변수 없는 기본 생성자일 경우에는 생략 가능, 하지만 this(a, 0)을 해줬고 this()와 super()는 첫번째 줄에만 쓸 수 있기 때문에 여기서는 생략을 해도 자동으로 만들어주지 않음.
        this(a, 0);
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        //super();//매개변수 없는 기본 생성자일 경우에는 생략 가능, 생성자 첫줄에는 this(..) super()가 올 수 있는데 동시에 사용하는건 안됨. 만약에 ClassA에 기본생성자가 없으면 super()는 생략하지 못함. super() 명시를 해줘야 함 하지만 여기서는 A의 생성자가 기본생성자이므로 생략 가능
        //적어도 한번은 super()가 호출되어야 함
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}

package poly.ex3;

public class HelloAnimal extends AbstractAnimal{
    //메서드 오버라이딩을 할 때는 상관이 없지만, 오버라이딩 하지 않으면 HelloAnimal 클래스도 추상 클래스가 되어야한다.
    @Override
    public void sound() {
        System.out.println("HelloAnimal.sound");
    }
}

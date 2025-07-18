package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //이유 1: Parent 클래스에 자식에 대한 정보가 없음. 이유 2: 상속 관계는 부모 방향으로 찾아 올라갈 수는 있지만 자식 방향으로 찾아 내려갈 수는 없기 때문이다.
        //자식의 기능을 사용하려면 캐스팅을 해줘야함.
        //poly.childMethod();

        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다.
    }
}

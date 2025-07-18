package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck(), new Pig()};
        //모든 동물들이 Animal 클래스 즉, 부모 클래스의 sound() 메서드를 반드시 오버라이딩 해서 동물 각각의 울음소리를 출력하고 싶은데, Pig 클래스는 sound()를 오버라이딩 하지 않아서 Animal의 sound()가 호출됨.
        //이런 문제를 어떻게 해결해야 될까

        //동물이 추가 되더라도 변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //동물이 추가되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

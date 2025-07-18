package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();
        Cow cow3 = new Cow();

        //배열
        //Cow[] cawArr = {cow1, cow2, cow3}; //얘는 같은 타입이라 Cow 배열에 넣을수 있지만 우리가 넣어야할 것은 dog랑 cat임.
        //Caw[] cawArr = {dog, cat, cow}; //dog, cat이 cow랑 아예 다른 타입이기 때문에 배열에 넣을 수 없음

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        /*
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
        */
        soundCat(cat);
        soundCow(cow);

        /*System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");*/
    }

    private static void soundCat(Cat cat) {
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        System.out.println("===ClassC 생성===");
        ClassC classC = new ClassC();

        System.out.println("===ClassB 생성===");
        ClassB classB = new ClassB(100);
    }
}

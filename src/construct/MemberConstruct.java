package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    public MemberConstruct(String name, int age) {
        this(name, age, 50);
        //중복되는 코드 생략 가능
        //this.name = name;
        //this.age = age;
        //this.grade = 50;
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

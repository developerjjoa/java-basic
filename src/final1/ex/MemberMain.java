package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2", "seo"); //id는 final이므로 변경되지 않고 이름만 변경됨
        member.print();
    }
}

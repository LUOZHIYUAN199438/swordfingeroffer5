package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-28.
 * @time 0:16
 */
public class FieldTest {

    public void doSomething(User user){
        user.age = 1000;
        user.name = "luo";
    }

    public static void main(String[] args) {
        FieldTest fieldTest = new FieldTest();
        User user = new User(5,"san");
        System.out.println(user.age + ":" + user.name);
        fieldTest.doSomething(user);
        System.out.println(user.age + ":" + user.name);
    }

}
class User{
    public int age;
    public String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
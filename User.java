public class User {
    private String name;
    private int age;
    private static User instance;

    private User() {
        this.name = "Default Name";
        this.age = 0;
    }

    public static User getInstance() {

        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
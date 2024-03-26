class Main {
    public static void main(String[] args) {

        User user1 = User.getInstance();
        User user2 = User.getInstance();

        System.out.println("User 1 - Default Information:");
        user1.printUserInfo();
        System.out.println();

        user2.setName("John Doe");
        user2.setAge(30);

        System.out.println("User 2 - Modified Information:");
        user2.printUserInfo();
    }
}
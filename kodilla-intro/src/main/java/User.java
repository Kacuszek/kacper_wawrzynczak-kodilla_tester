public class User {
    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        User kacper = new User("Kacper", 23);
        User karol = new User("Karol", 33);
        User stefan = new User("Stefan", 58);
        User szymek = new User("Szymek", 13);
        User dominik = new User("Dominik", 18);
        User olek = new User("Olek", 45);
        User[] users = {kacper, karol, stefan, szymek, dominik, olek};
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        int average = result / users.length;
        for (int i = 0; i < average; i++ ) {
            System.out.println(users[i]);
        }
    }
}

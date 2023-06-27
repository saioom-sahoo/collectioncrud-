public class Home {
    public static void main(String[] args) {
        User user1 = new User("sai", 1, "BBSR");
        User user2 = new User("avinash", 2, "ctc");
        CrudUser crudUser = new CrudUser();
        crudUser.addUser(user1);
        crudUser.addUser(user2);
        crudUser.retriveUser();
        crudUser.deleteUser(1);
        crudUser.retriveUser();

    }
}

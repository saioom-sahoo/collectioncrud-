import java.util.ArrayList;
import java.util.List;

public class CrudUser {
    private List<User> ll = new ArrayList<>();

    public void addUser(User u) {
        ll.add(u);
    }

    public void retriveUser() {
        for (User user : ll) {
            System.out.println(user);
        }

    }

    public void deleteUser(int i) {
        System.out.println("Element is present : ");
        ll.remove(i);
    }
}

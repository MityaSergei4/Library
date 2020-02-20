import java.sql.ResultSet;
import java.sql.SQLException;

public class Solution {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Base base = new Base();
        ResultSet set = base.getUser("alex@mail.ru");
        while (set.next()){
            int id = set.getInt("id");
            String name = set.getString("name");

            System.out.println("id: " + id);
            System.out.println("Name: " + name);
        }
    }
}

package ua.ictloud.lessons.jdbch2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 08-Jun-18.   подключили LIBS h2, база локальная на ПК
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");                                           //загрузка драйвера
        Connection conn = DriverManager.getConnection("jdbc:h2:./test");        //создаем коннект

        Statement stmt = conn.createStatement();

        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS USERS (" +
                "id INT(11) PRIMARY KEY AUTO_INCREMENT," +
                "username VARCHAR(50)," +
                "password VARCHAR(50)" +
                ");"
        );

//        stmt.execute("INSERT INTO users (username, password)"+
//        "VALUES ('username','password');");

        ResultSet rs = stmt.executeQuery("SELECT * from users;");
        List<User> users = new ArrayList<>();
        while (rs.next()) {

            System.out.print("User:\t");
            System.out.print(rs.getInt(1) + "\t");  //получаем по индексу из рекордсета, отсчет идет с 1, нужно указать тип извлекаемых данных
            System.out.print(rs.getString("username") + "\t");  //или по имени столбца
            System.out.print(rs.getString(3) + "\t");
            System.out.println();

            User user = new User();         //создаем юзера
            user.setId(rs.getInt(1));
            user.setUserName(rs.getString(2));
            user.setPassword(rs.getString(3));

            users.add(user);            //кидаем в list
        }

        System.out.println(users);

        rs.close();
        stmt.close();
        conn.close();
    }
}

package univerbig.repository.impl.db.mysql;

/**
 * Created by student on 27-Apr-18.     //просто пример конекта
 */
public class DBMySQLConnection {
    private static DBMySQLConnection instance;

    private DBMySQLConnection() {
    }

    public static DBMySQLConnection getInstance() {            //синглтон
        if (instance == null) {
            instance = new DBMySQLConnection();
        }
        return instance;
    }

    public void CreateQuery(String query) {

    }
}

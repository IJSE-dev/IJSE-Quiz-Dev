/**
 * @author Lakal Ranuja <wadduwage.lakal@gmail.com>
 * @since 8/7/21
 * @version v1.0.0
 */

package lk.ijse.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    private static dbConnection dbConnetion;
    private Connection connection;

    private void DBConnetion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/cusItemIjse";
            String userName = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, userName, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static dbConnection getInstance() {
        return (null == dbConnetion) ? (dbConnetion = new dbConnection()) : (dbConnetion);
    }

    public Connection getConnection() {
        return connection;
    }
}

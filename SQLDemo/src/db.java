import lesson42.conn;

import java.sql.SQLException;

public class db {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        conn.Conn();
        conn.CreateDB();
        conn.WriteDB();
        conn.ReadDB();
        conn.CloseDB();
    }
}

import java.sql.*;

public class DataBeseConector {

    public static final String HOST = "jdbc:postgresql://snuffleupagus.db.elephantsql.com/";
    public static final String USER  = "wvxklxmw";
    public static final String DATABASE = "wvxklxmw";
    public static final String PASSWORD = "1gdBSQnXTDZK_ehKuBzi47SaQqAMsebY";
    public Connection connection;
    public Statement stm;
    public void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager
                    .getConnection(HOST + DATABASE, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");

    }
    public void executeSqlInsert(String insert) {
        try {
            stm.execute(insert);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
        public ResultSet executeSqlSelect(String select) {
            try {
                return stm.executeQuery(select);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    
        public int executeSqlUpdate(String update) {
            try {
                return stm.executeUpdate(update);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    
        public int executeSqlDelete(String delete) {
            try {
                return stm.executeUpdate(delete);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    // public Person executeSqlSelect() {
    //     Person person = null;
    //     try {
    //         Statement stm = this.connection.createStatement();
    //         ResultSet rs = stm.executeQuery("SELECT * FROM PERSON;");
    //         while (rs.next()) {
    //             long id = rs.getInt("id");
    //             String username = rs.getString("username");
    //             String email = rs.getString("email");
    //             String password = rs.getString("password");
    //             Boolean enable = rs.getBoolean("enable");
    //             String number = rs.getString("number");
    //             person = new Person(id, username, email, password, enable, number);
    //             System.out.println("ID = " + id);
    //             System.out.println("username = " + username);
    //             System.out.println("email = " + email);
    //             System.out.println("password = " + password);
    //             System.out.println("enable = " + enable);
    //             System.out.println();
    //         }
    //         rs.close();
    //         stm.close();
    //         this.connection.close();
    //     } catch (Exception e) {
    //         System.err.println(e.getClass().getName() + ": " + e.getMessage());
    //         System.exit(0);
    //     }
    //     return person;
    // }


}
public class Main {
    public static void main(String[] args) {
        DataBeseConector db  = new DataBeseConector();
        db.connect();
        db.executeSqlInsert("insert into person (username,email,number,id,password,enable) \n" +
                "VALUES ('tomek2', 'tomek2@wp.pl', 76666666, 2, 'haslo', true)");
        db.executeSqlSelect();
    }
}
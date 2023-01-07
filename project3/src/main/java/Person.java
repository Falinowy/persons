public class Person {
    Long id;
    String username;
    String password;
    String email;
    Boolean enable;
    String number;

    public Person(Long id, String username, String password, String email, Boolean enable, String number) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.enable = enable;
        this.number = number;
    }

    public void add(DataBeseConector db) {
        String insert = "insert into person (username,email,number,id,password,enable) \n" +
                "VALUES (" + this.username + "," + this.email + ',' + this.number + ',' + this.id + ',' + this.password + ',' + this.enable +")";
                db.executeSqlInsert(insert);
    }
    public void read(DataBeseConector db) {
        String insert = "SELECT * FROM PERSON WHERE USERNAME =" + this.username;
        db.executeSqlInsert(insert);
    }
    public void delete(DataBeseConector db) {
        String insert = "DELETE * FROM PERSON WHERE =" + this.id;
        db.executeSqlInsert(insert);
    }
    public void update(DataBeseConector db) {
        String insert = "UPDATE * FROM PERSON WHERE =" + this.id;;
        db.executeSqlInsert(insert);
    }
}


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
        String insert = "INSERT INTO PERSON VALUES ('" +
                this.id + "', '" +
                this.username + "', '" +
                this.password + "', " +
                this.email + "', " +
                this.enabled.toString() + ", " +
                this.number + ")";
        db.executeSqlInsert(insert);
    }
    public void read(DataBeseConector db) {
        String select = "SELECT * FROM person WHERE username = '" + this.username + "'";
        ResultSet rs = db.executeSqlSelect(select);
        while (rs.next()) {
            long id = rs.getLong("id");
            String username = rs.getString("username");
            String email = rs.getString("email");
            String password = rs.getString("password");
            boolean enabled = rs.getBoolean("enabled");
            Person person = new Person(id, username, email, password, enabled, number);
            System.out.println("id: " + id + ", username: " + username + ", email: " + email + ", password: " + password + ", enabled: " + enabled + ", number: " + number);
        }
    }
    public void delete(DataBeseConector db) {
        String delete = "DELETE FROM person WHERE username = '" + this.username  + "'and id ='" + this.id "'";
        int count = db.executeSqlDelete(delete);
        System.out.println("Usunięto " + count + " rekordów.");
    }
    public void update(DataBeseConector db) {
        String update = "UPDATE person SET email = '" + this.email + "and password ='" + this.password + "and number = '" + this.number "' WHERE username = '" + this.username + "'";
        int count = db.executeSqlUpdate(update);
        System.out.println("Zaktualizowano " + count + " rekordów.");
    }
}


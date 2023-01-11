public class Main {
    public static void main(String[] args) {
        DataBeseConector db  = new DataBeseConector();
        db.connect();
        // db.executeSqlInsert("insert into person (username,email,number,id,password,enable) \n" +
        //         "VALUES ('tomek2', 'tomek2@wp.pl', 76666666, 2, 'haslo', true)");
        // db.executeSqlSelect();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!exit) {
            System.out.println("Wpisz numer operacji jaką chcesz wykonać:");
            System.out.println("1. Dodaj nowego użytkownika");
            System.out.println("2. Odczytaj użytkownika");
            System.out.println("3. Zaktualizuj użytkownika");
            System.out.println("4. Usuń użytkoniwka");
            System.out.println("5. Zamknij program");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Podaj id użytkownika: ");
                    Long newId = scanner.nextLine();
                    System.out.print("Podaj nazwę użytkownika: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Podaj email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Podaj hasło: ");
                    String newPassword = scanner.nextLine();
                    System.out.print("Czy użytkownik ma być włączony?(napisz true/false): ");
                    boolean newEnabled = scanner.nextBoolean();                    
                    System.out.print("Podaj swoją ulubiąna cyfre: ");
                    boolean newNumber = scanner.nextBoolean();
                    scanner.nextLine(); 
                    Person newPerson = new Person(newId, newUsername, newEmail, newPassword, newEnabled, newNumber);
                    newPerson.create(dbc);
                    break;
                case 2:
                    System.out.print("Podaj nazwę użytkownika: ");
                    username = scanner.nextLine();
                    Perons readPerson = new Person(null, username, "", "", false);
                    readPerson.read(dbc);
                    break;
                case 3:
                    System.out.print("Podaj id użytkownika: ");
                    Long updateId = scanner.nextLine();
                    System.out.print("Podaj nazwę użytkownika: ");
                    String updateUsername = scanner.nextLine();
                    System.out.print("Podaj email: ");
                    String updateEmail = scanner.nextLine();
                    System.out.print("Podaj hasło: ");
                    String updatePassword = scanner.nextLine();
                    System.out.print("Czy użytkownik ma być włączony?(napisz true/false): ");
                    boolean updateEnabled = scanner.nextBoolean();            
                    System.out.print("Podaj swoją ulubiąna cyfre: ");
                    boolean newNumber = scanner.nextBoolean();
                    scanner.nextLine();
                    Person updatePerson = new Person(updateId, updateUsername, updateEmail, updatePassword, updateEnabled, newNumber);
                    updatePerson.update(dbc);
                    break;
                case 4:
                    System.out.print("Podaj id użytkownika: ");
                    Long deleteId = scanner.nextLine();
                    System.out.print("Podaj nazwę użytkownika: ");
                    String deleteUsername = scanner.nextLine();
                    System.out.print("Podaj email: ");
                    String deleteEmail = scanner.nextLine();
                    Person deletePerson = new Person(deleteId, deleteUsername, deleteEmail, "", false);
                    deletePerson.delete(dbc);
                    break;
                case 5:
                    exit = true;
                    break;
            }
        }
    }
}
package insomnia.database;

public class DBtest {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            System.out.println("Connection succesfull!");
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}

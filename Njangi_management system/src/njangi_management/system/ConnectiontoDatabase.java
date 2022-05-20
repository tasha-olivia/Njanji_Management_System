package njangi_management.system;

public class ConnectiontoDatabase {
    public Connection databaselink;

    public Connection getConnection(){
        String databaseUser = "root";
        String databaseName = "school_database";
        String databasePassword = "willywillywils";
        String database_port = "3308";
        String url = "jdbc:mysql://localhost:"+database_port+ "/" + databaseName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink = DriverManager.getConnection(url, databaseUser, databasePassword);

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("There is an error");

        }
        return  databaselink;
    }
}

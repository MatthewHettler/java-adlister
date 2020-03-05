class Config {
    public static final String URL = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "codeup";

    public static String getUrl() {
        return URL;
    }
    public static String getUsername() {
        return USERNAME;
    }
    public static String getPassword() {
        return PASSWORD;
    }
}
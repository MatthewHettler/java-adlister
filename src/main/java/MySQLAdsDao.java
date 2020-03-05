import java.sql.*;
import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads  {

    private Connection connection;
    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.URL,
                    Config.USERNAME,
                    Config.PASSWORD
            );
            System.out.println("Database Connection Successful");
        } catch (SQLException ex) {
            System.out.println("Database Connection Failed");
        }
    }

    @Override
    public Long insert(Ad ad) {
        String query = String.format(
                "INSERT INTO ads(user_id, title, description)"+
                "VALUES (%d, %s, %s)",
                1, ad.getTitle(), ad.getDescription()
        );
        try {
            Statement stmt = connection.createStatement();
            long id = (long)stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            System.out.println("Successfully created a new ad.");
            return id;
        } catch (SQLException ex) {
            System.out.println("There was an error creating a new ad.");
        }
        return null;
    }

    @Override
    public List<Ad> all() {
        String query = "SELECT * FROM ads;";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            List<Ad> ads = new ArrayList<>();
            while (rs.next()) {
                ads.add(new Ad(rs.getLong(1),
                        rs.getLong(2),
                        rs.getString(3),
                        rs.getString(4))
                );
            }
            return ads;
        } catch (SQLException ex) {
            System.out.println("There was an error retrieving ads.");
        }
        return null;
    }

    public static void main(String[] args) {
        MySQLAdsDao dao = new MySQLAdsDao();
//        Ad newAd = new Ad(1, "Test", "test");
//        dao.insert(newAd);
        List <Ad> ads = dao.all();
        for (Ad ad : ads) {
            System.out.println(ad.getTitle());
        }
    }
}

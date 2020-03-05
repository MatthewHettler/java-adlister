import java.util.List;

public interface Ads {
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    // get a list of all the adds
    List<Ad> all();
//    List<Ad> allSortedByTitle();
//    List<Ad> getAllByUser(long userId);
//    List<Ad> getAdsByCategory(String category);

//    Ad getOne(long id);
//    Ad retrieve(long id);

//    boolean update(Ad ad);
//    boolean refresh(Ad ad);
//    boolean delete(long id);
}

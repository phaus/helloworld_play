package models;

import java.util.Date;
import javax.persistence.Entity;
import play.db.jpa.Model;

/**
 *
 * @editor Folkert Meeuw
 */
@Entity
public class Profiles extends Model {

    public String profession = null;
    public String company = null;
    public StringBuffer about = null;
    public int userId = -1;
    public int privateAddressId = -1;
    public int businessAddressId = -1;
    public Date createdAt = null;
    public Date updatedAt = null;
    public String firstName = null;
    public String lastName = null;
    public String photoFileName = null;
    public String photoContentType = null;
    public int photoFileSize = -1;
    
}

package app.api.app_api_crud;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class App {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appId;
    private String appName;
    private String appVendor;
    private int downloadedCount;
    private double ratings;
    transient private List<Profile> myProfiles;
    @ManyToOne
    private Profile profile;
}

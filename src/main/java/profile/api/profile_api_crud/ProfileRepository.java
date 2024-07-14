

package profile.api.profile_api_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    List<Profile> findAllByProfileId(int profileId);
    List<Profile> findAllByAppId(int appId);  // This method should now work
}

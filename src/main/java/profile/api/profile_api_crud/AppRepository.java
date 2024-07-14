package app.api.app_api_crud;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppRepository extends JpaRepository<App, Integer> {
    List<App> findAllByProfileProfileId(int profileId);
}

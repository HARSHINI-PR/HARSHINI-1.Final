package app.api.app_api_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    private AppRepository appRepository;

    public List<App> findAllApps() {
        return appRepository.findAll();
    }

    public List<App> findAppsByProfileId(int profileId) {
        return appRepository.findAllByProfileProfileId(  profileId);
    }

    public App findAppById(int id) {
        return appRepository.findById(id).orElse(new App());
    }

    public App saveApp(App app) {
        return appRepository.save(app);
    }

    public void deleteApp(int id) {
        appRepository.deleteById(id);
    }
}

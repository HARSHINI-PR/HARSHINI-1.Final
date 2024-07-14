package profile.api.profile_api_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository repository;

    public List<Profile> implementFindApp(int appId) {
        return repository.findAllByAppId(appId);
    }

    public Profile implementFindProfileById(int id) {
        return repository.findById(id).orElse(new Profile());
    }

    public Profile implementSaveProfile(Profile profile) {
        return repository.save(profile);
    }

    public void implementDeleteProfile(int id) {
        repository.deleteById(id);
    }

    public List<Profile> implementFindAllProfiles() {
        return repository.findAll();
    }
}



package profile.api.profile_api_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService service;

    @GetMapping("/byApp/{appId}")
    public List<Profile> callByApp(@PathVariable("appId") int appId) {
        return service.implementFindApp(appId);
    }

    @GetMapping("/{id}")
    public Profile fetchone(@PathVariable("id") int id) {
        return service.implementFindProfileById(id);
    }

    @PostMapping("/")
    public Profile ip(@RequestBody Profile profile) {
        return service.implementSaveProfile(profile);
    }

    @PutMapping("/")
    public Profile progress(@RequestBody Profile profile) {
        return service.implementSaveProfile(profile);
    }

    @DeleteMapping("/{id}")
    public String deleteProfile(@PathVariable("id") int id) {
        service.implementDeleteProfile(id);
        return "Profile with ID " + id + " has been deleted";
    }

    @GetMapping("/")
    public List<Profile> viewAll(){
        return service.implementFindAllProfiles();
    }
}



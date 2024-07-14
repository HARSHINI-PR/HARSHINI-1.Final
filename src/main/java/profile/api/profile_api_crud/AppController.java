package app.api.app_api_crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private AppService appService;

    @GetMapping("/")
    public List<App> getAllApps() {
        return appService.findAllApps();
    }

    @GetMapping("/profile/{profileId}")
    public List<App> getAppsByProfileId(@PathVariable("profileId") int profileId) {
        return appService.findAppsByProfileId(profileId);
    }

    @GetMapping("/{id}")
    public App getAppById(@PathVariable("id") int id) {
        return appService.findAppById(id);
    }

    @PostMapping("/")
    public App createApp(@RequestBody App app) {
        return appService.saveApp(app);
    }

    @PutMapping("/")
    public App updateApp(@RequestBody App app) {
        return appService.saveApp(app);
    }

    @DeleteMapping("/{id}")
    public String deleteApp(@PathVariable("id") int id) {
        appService.deleteApp(id);
        return "App with ID " + id + " has been deleted";
    }
}

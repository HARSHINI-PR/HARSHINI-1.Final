package app.api.app_api_crud;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "appService", url = "http://localhost:8087")
public interface AppFeign {

    @GetMapping("/profile/byApp/{appId}")
    List<Profile> callProfile(@PathVariable("appId") int appId);
}

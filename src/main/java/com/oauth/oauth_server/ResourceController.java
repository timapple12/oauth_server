package com.oauth.oauth_server;

import com.oauth.oauth_server.domain.UserProfileModel;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResourceController {
    @RequestMapping("/api/users/me")
    public ResponseEntity<UserProfileModel> getProfile(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserProfileModel profileModel = new UserProfileModel();
        profileModel.setuName(user.getUsername());

        return ResponseEntity.ok(profileModel);
    }
}

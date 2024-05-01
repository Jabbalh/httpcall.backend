package fr.Services;

import fr.dtos.UserProfile;
import fr.dtos.UserTheme;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserProfile getUserProfile() {
        UserProfile userProfile = new UserProfile();
        userProfile.setFirstName("thibault");
        userProfile.setLastName("HUET");
        userProfile.setEmail("thibault.huet.bzh@gmail.com");
        UserTheme userTheme = new UserTheme();
        userTheme.setAccent("#1adbc5");
        userTheme.setDarkMode(true);
        userProfile.setUserTheme(userTheme);
        return userProfile;
    }
}

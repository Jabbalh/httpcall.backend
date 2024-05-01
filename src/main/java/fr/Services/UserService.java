package fr.Services;

import fr.dtos.UserProfile;
import fr.dtos.UserTheme;
import fr.repositories.UserProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserProfilRepository userProfilRepository;

    public UserProfile getUserByEmail(String email) {
        List<UserProfile> liste =  this.userProfilRepository.findAll();
        return liste
                .stream()
                .filter(userProfile -> userProfile.getEmail().equals(email))
                .findFirst()
                .orElse(null);

    }

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

    public void save(UserProfile userProfile){
        if ("".equals(userProfile.getId())){
            userProfile.setId(String.valueOf(java.util.UUID.randomUUID()));
        }
        this.userProfilRepository.save(userProfile);
    }

}

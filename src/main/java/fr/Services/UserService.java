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
        return this.userProfilRepository.findByEmail(email);
    }

    public void save(UserProfile userProfile){
        if ("".equals(userProfile.getId())){
            userProfile.setId(String.valueOf(java.util.UUID.randomUUID()));
        }
        this.userProfilRepository.save(userProfile);
    }

}

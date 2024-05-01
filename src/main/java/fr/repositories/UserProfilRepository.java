package fr.repositories;

import fr.dtos.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfilRepository extends MongoRepository<UserProfile, String> {
    //UserProfile findByUserName(String username);
}

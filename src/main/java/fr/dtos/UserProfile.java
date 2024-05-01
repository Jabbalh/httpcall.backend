package fr.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class UserProfile {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private UserTheme userTheme;


}

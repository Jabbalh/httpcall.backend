package fr.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserProfile {
    private String firstName;
    private String lastName;
    private String email;
    private UserTheme userTheme;


}

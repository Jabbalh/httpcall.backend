package fr.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserTheme {
    /**
     * renvoie couleur accent
     */
    private String accent;

    /**
     * renvoie si le thème sombre est activé
     */
    private Boolean darkMode;
}

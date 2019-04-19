package insomnia.pages.base.credentials;


import lombok.Data;

import java.lang.ref.SoftReference;

@Data
public class User {

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    private String name;
    private String password;
    private String email;

}

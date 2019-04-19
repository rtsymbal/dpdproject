package insomnia.pages.base.credentials;


import lombok.Data;

@Data
public class User {

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    private String name;
    private String password;



}

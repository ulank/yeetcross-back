package kz.market.yeetcross.dto;

/**
 * @author Ulan
 * @date 11/17/2022
 */

public class AuthDto {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

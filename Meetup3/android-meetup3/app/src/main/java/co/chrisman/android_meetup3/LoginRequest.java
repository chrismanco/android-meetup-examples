package co.chrisman.android_meetup3;

import org.springframework.util.LinkedMultiValueMap;

/**
 * Created by chrismac on 7/30/15.
 */
public class LoginRequest extends LinkedMultiValueMap<String, String> {
    public LoginRequest(String username, String password) {
        add("user", username);
        add("pwd", password);
    }
}

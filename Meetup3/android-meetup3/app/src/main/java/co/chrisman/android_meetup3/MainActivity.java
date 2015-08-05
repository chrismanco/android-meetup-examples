package co.chrisman.android_meetup3;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;
import org.androidannotations.api.rest.MediaType;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @RestService
    ServiceClient restClient;

    @ViewById(R.id.username)
    EditText username;

    @ViewById(R.id.password)
    EditText password;

    @Click(R.id.login)
    public void login() {
        request();
    }

    @Background
    void request() {
        try {
            restClient.setHeader("Content-Type", MediaType.APPLICATION_FORM_URLENCODED);

            LoginRequest request = new LoginRequest(username.getText().toString(), password.getText().toString());

            String response = restClient.login(request);

            showMessage(response);

        } catch (Exception e) {
            Log.e("", "Error invocacion REST", e);

            showMessage("Error invocando login");
        }
    }

    @UiThread
    void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

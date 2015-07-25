package co.chrisman.meetup2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main2)
public class MainActivity2 extends AppCompatActivity {

    @Click(R.id.button123)
    public void click() {
        Toast.makeText(this, "Holaaaaaaaa", Toast.LENGTH_SHORT).show();
    }

}

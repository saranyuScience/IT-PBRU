package pbru.lab324_16ex.itpbru;

import android.content.Intent;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    tess

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // Main Method
    public void clickSignUpMain(View view){
startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }

}   // Main Class this is main class //

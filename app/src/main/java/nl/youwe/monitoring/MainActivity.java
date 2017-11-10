package nl.youwe.monitoring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TextView mWelcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWelcomeTextView = findViewById(R.id.welcomeTextView);

        Button fetchButton = findViewById(R.id.fetchButton);
        fetchButton.setOnClickListener((v) -> { fetchWelcome(); });

    }

    private void fetchWelcome() {

        mWelcomeTextView.setText(mFirebaseRemoteConfig);

    }
}

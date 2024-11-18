package edu.csueb.codepath.fitness_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignupActivity extends AppCompatActivity {
    public static final String TAG = "Signup Activity";

    private EditText firstName;
    private EditText lastName;
    private EditText emailAddress;
    private EditText weight;
    private EditText height;
    private EditText age;

    private EditText username;
    private EditText password;

    private Button submit;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_signup);
        back = findViewById(R.id.back);
        firstName = findViewById(R.id.etfirstname);
        lastName = findViewById(R.id.etlastname);
        emailAddress = findViewById(R.id.etEmailAddress);
        weight = findViewById(R.id.etWeight);
        height = findViewById(R.id.etHeight);
        age = findViewById(R.id.etAge);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);

        submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "Submit clicked");

                // Validate fields
                if (!validateFields()) {
                    return; // Exit if validation fails
                }

                // If all validations pass, proceed with sign-up
                ParseUser user = new ParseUser();
                user.setPassword(password.getText().toString());
                user.setUsername(username.getText().toString());
                user.setEmail(emailAddress.getText().toString());
                user.put("firstname", firstName.getText().toString());
                user.put("lastname", lastName.getText().toString());
                user.put("height", Integer.parseInt(height.getText().toString()));
                user.put("weight", Integer.parseInt(weight.getText().toString()));
                user.put("age", Integer.parseInt(age.getText().toString()));

                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e != null) {
                            Log.e(TAG, "User creation unsuccessful", e);
                            Toast.makeText(SignupActivity.this, "Sign-up unsuccessful: " + e.getMessage(), Toast.LENGTH_LONG).show();
                            return;
                        }
                        Log.i(TAG, "Success on Sign-up!");
                        Toast.makeText(SignupActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();
                        goMainActivity();
                    }
                });
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(i);
                Animatoo.animateSlideRight(SignupActivity.this);
                finish();
            }
        });


  } // on Create
    private void goMainActivity() {
        Intent i = new Intent(SignupActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }


    private boolean validateFields() {
        if (firstName.getText().toString().isEmpty() ||
                lastName.getText().toString().isEmpty() ||
                emailAddress.getText().toString().isEmpty() ||
                weight.getText().toString().isEmpty() ||
                height.getText().toString().isEmpty() ||
                age.getText().toString().isEmpty() ||
                username.getText().toString().isEmpty() ||
                password.getText().toString().isEmpty()) {

            Toast.makeText(SignupActivity.this, "Please fill out all fields", Toast.LENGTH_LONG).show();
            return false;
        }

        // Validate email format
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (!emailAddress.getText().toString().matches(emailPattern)) {
            Toast.makeText(SignupActivity.this, "Invalid email format", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }

} // class






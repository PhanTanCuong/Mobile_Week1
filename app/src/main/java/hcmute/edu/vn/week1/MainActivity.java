package hcmute.edu.vn.week1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Your name: Phan Tan Cuong
    // Your StudentID:20110356

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Meaning of the layout:
        // The layout is a simple RelativeLayout containing a TextView, an EditText, and a Button.
        // Elements are positioned relative to each other with some padding.

        // TextView control
        TextView helloTextView = findViewById(R.id.helloTextView);
        helloTextView.setText("Hello, World!"); // Setting initial text
        helloTextView.setTextSize(24); // Setting text size
        helloTextView.setTextColor(getResources().getColor(R.color.black)); // Setting text color

        // EditText control
        final EditText editText = findViewById(R.id.editText);
        editText.setHint("Enter your name"); // Setting a hint for the user
        editText.setInputType(android.text.InputType.TYPE_CLASS_TEXT); // Setting input type to text


        // Button control
        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setText("Submit"); // Setting the text on the button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                helloTextView.setText("Hello, " + inputText + "!");
            }
        });
    }
}
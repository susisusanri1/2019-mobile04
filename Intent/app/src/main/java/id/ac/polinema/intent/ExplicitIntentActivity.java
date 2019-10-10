package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {
    private EditText nameInput;
    private TextView nameOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        nameInput = findViewById(R.id.input_name);
        nameOutput =findViewById(R.id.text_output);
    }
    public void handleSubmit(View view){
        String name = nameInput.getText().toString();
        nameOutput.setText("Hello " +name+", Congratulation");
    }
}

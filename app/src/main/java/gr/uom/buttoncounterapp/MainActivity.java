package gr.uom.buttoncounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private Button button;
    private TextView textView;
    private int numTimesClicked=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button2);
        textView=findViewById(R.id.textView);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                numTimesClicked++;
                String result="\n The button clicked "+numTimesClicked+" times";
                textView.append(result);


            }
        };
        button.setOnClickListener(listener);

        }
    }
}

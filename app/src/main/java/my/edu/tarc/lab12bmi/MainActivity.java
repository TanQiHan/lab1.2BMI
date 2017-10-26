package my.edu.tarc.lab12bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight,editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextWeight =(EditText)findViewById(R.id.editTextWeight);
        editTextHeight=(EditText)findViewById(R.id.editTextHeight);
        textViewResult=(TextView)findViewById(R.id.textViewResult);
        imageViewResult=(ImageView)findViewById(R.id.imageViewResult);

    }
    public void calculatebmi(View view){
        Double weight,height,BMI;
        weight=Double.parseDouble(editTextWeight.getText().toString());
        height=Double.parseDouble(editTextHeight.getText().toString());
        BMI=weight/(height*height);
        textViewResult.setText("BMI :"+String.format("%.2f",BMI));
        if (BMI<=18.5)
        {
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if(BMI>18.5 && BMI<25){
            imageViewResult.setImageResource(R.drawable.normal);
        }
        else
        {
            imageViewResult.setImageResource(R.drawable.over);
        }


    }
    public void reset(View view){
        editTextHeight.setText("");
        editTextWeight.setText("");
        textViewResult.setText("BMI :");
        imageViewResult.setImageResource(R.drawable.empty);

    }

}

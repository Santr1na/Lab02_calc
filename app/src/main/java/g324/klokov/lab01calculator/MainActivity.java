package g324.klokov.lab01calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.textclassifier.TextClassifierEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textView2, textView3, result, textView, result_2, result_3, result_4;
    private EditText number_1, number_2, number_3, number_4, number_5, number_6;
    private Button Add, Subtract, Multiply, Divide, Sinys, Cosinys, Tangens, Root, Pow;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        result_2 = findViewById(R.id.result_2);
        result_3 = findViewById(R.id.result_3);
        result_4 = findViewById(R.id.result_4);

        number_1 = findViewById(R.id.number_1);
        number_2 = findViewById(R.id.number_2);
        number_3 = findViewById(R.id.number_3);
        number_4 = findViewById(R.id.number_4);
        number_5 = findViewById(R.id.number_5);
        number_6 = findViewById(R.id.number_6);

        Add = findViewById(R.id.Add_number);
        Subtract = findViewById(R.id.Subtract_number);
        Multiply = findViewById(R.id.Multiply_number);
        Divide = findViewById(R.id.Divide_number);

        Sinys = findViewById(R.id.Sinys);
        Cosinys = findViewById(R.id.Cosinys);
        Tangens = findViewById(R.id.Tangens);

        Root = findViewById(R.id.Root);
        Pow = findViewById(R.id.Pow);
        

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float num1 = Float.parseFloat(number_1.getText().toString());
                    float num2 = Float.parseFloat(number_2.getText().toString());
                    result.setText(String.valueOf("Result: "+(num1 + num2)));
                }
                catch (Exception e)
                {
                    result.setText(String.valueOf("Result: Error!"));
                }
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float num1 = Float.parseFloat(number_1.getText().toString());
                    float num2 = Float.parseFloat(number_2.getText().toString());
                    result.setText(String.valueOf("Result: " +(num1 - num2)));
                }
                catch (Exception e)
                {
                    result.setText(String.valueOf("Result: Error!"));
                }
            }
        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float num1 = Float.parseFloat(number_1.getText().toString());
                    float num2 = Float.parseFloat(number_2.getText().toString());
                    result.setText(String.valueOf("Result: "+(num1 * num2)));
                }
                catch (Exception e)
                {
                    result.setText(String.valueOf("Result: Error!"));
                }

            }
        });
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float num1 = Float.parseFloat(number_1.getText().toString());
                    float num2 = Float.parseFloat(number_2.getText().toString());
                    if (num2 == 0)
                    {
                        CharSequence text = "You can't divide by 0";
                        result.setText(String.valueOf("Result: "+text));
                    }
                    else {
                        result.setText(String.valueOf("Result: " + (num1 / num2)));
                    }
                }
                catch (Exception e)
                {
                    result.setText(String.valueOf("Result: Error!"));
                }
            }
        });

        Sinys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num = Double.parseDouble(number_3.getText().toString());
                    double num1 = Math.toRadians(num);
                    result_2.setText(String.valueOf("Result: "+Math.sin(num1)));
                }
                catch (Exception e)
                {
                    result_2.setText(String.valueOf("Result: Error!"));
                }

            }
        });

        Cosinys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num = Double.parseDouble(number_3.getText().toString());
                    double num1 = Math.toRadians(num);
                    result_2.setText(String.valueOf("Result: "+Math.cos(num1)));
                }
                catch (Exception e)
                {
                    result_2.setText(String.valueOf("Result: Error!"));
                }
            }
        });

        Tangens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num = Double.parseDouble(number_3.getText().toString());
                    double num1 = Math.toRadians(num);
                    result_2.setText(String.valueOf("Result: "+Math.tan(num1)));
                }
                catch (Exception e)
                {
                    result_2.setText(String.valueOf("Result: Error!"));
                }
            }
        });

        Root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num = Double.parseDouble(number_4.getText().toString());
                    if (num >= 0) {
                        result_3.setText(String.valueOf("Result: " + Math.sqrt(num)));
                    }
                    else {
                        result_3.setText(String.valueOf("Result: Error!"));
                    }
                }
                catch (Exception e)
                {
                    result_3.setText(String.valueOf("Result: Error!"));
                }
            }
        });

        Pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num1 = Double.parseDouble(number_5.getText().toString());
                    double num2 = Double.parseDouble(number_6.getText().toString());
                    result_4.setText(String.valueOf("Result: "+Math.pow(num1,num2)));
                }
                catch (Exception e)
                {
                    result_4.setText(String.valueOf("Result: Error!"));
                }
            }
        });
        }
    }
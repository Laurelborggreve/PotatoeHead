package com.example.assignment01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import static com.example.assignment01.R.id.body;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

        outState.putInt("Arms_Visibility", findViewById(R.id.arms_img).getVisibility());
        outState.putInt("Ears_Visibility", findViewById(R.id.ears_img).getVisibility());
        outState.putInt("Eyebrows_Visibility", findViewById(R.id.eyebrows_img).getVisibility());
        outState.putInt("Eyes_Visibility", findViewById(R.id.eyes_img).getVisibility());
        outState.putInt("Glasses_Visibility", findViewById(R.id.glasses_img).getVisibility());
        outState.putInt("Hat_Visibility", findViewById(R.id.hat_img).getVisibility());
        outState.putInt("Mustache_Visibility", findViewById(R.id.mustache_img).getVisibility());
        outState.putInt("Mouth_Visibility", findViewById(R.id.mouth_img).getVisibility());
        outState.putInt("Nose_Visibility", findViewById(R.id.nose_img).getVisibility());
        outState.putInt("Shoes_Visibility", findViewById(R.id.shoes_img).getVisibility());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        findViewById(R.id.arms_img).setVisibility(savedInstanceState.getInt("Arms_Visibility"));
        findViewById(R.id.ears_img).setVisibility(savedInstanceState.getInt("Ears_Visibility"));
        findViewById(R.id.eyebrows_img).setVisibility(savedInstanceState.getInt("Eyebrows_Visibility"));
        findViewById(R.id.eyes_img).setVisibility(savedInstanceState.getInt("Eyes_Visibility"));
        findViewById(R.id.glasses_img).setVisibility(savedInstanceState.getInt("Glasses_Visibility"));
        findViewById(R.id.hat_img).setVisibility(savedInstanceState.getInt("Hat_Visibility"));
        findViewById(R.id.mustache_img).setVisibility(savedInstanceState.getInt("Mustache_Visibility"));
        findViewById(R.id.mouth_img).setVisibility(savedInstanceState.getInt("Mouth_Visibility"));
        findViewById(R.id.nose_img).setVisibility(savedInstanceState.getInt("Nose_Visibility"));
        findViewById(R.id.shoes_img).setVisibility(savedInstanceState.getInt("Shoes_Visibility"));
    }

    public <string> void checkClicked(View view) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) view;

        // Is the checkbox checked?
        boolean checked = checkbox.isChecked();
   //     String CheckBoxName = checkbox.getText().toString();

        // Check which checkbox is checked and show image if checked
        switch (view.getId()) {
            case R.id.Arms:
                if (checked)
                    findViewById(R.id.arms_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.arms_img).setVisibility(View.INVISIBLE);
                break;
            case R.id.Ears:
                if (checked)
                    findViewById(R.id.ears_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.ears_img).setVisibility(View.INVISIBLE);
                break;
            case R.id.Eyebrows:
                if (checked)
                    findViewById(R.id.eyebrows_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.eyebrows_img).setVisibility(View.INVISIBLE);
                break;
            case R.id.Eyes:
                if (checked)
                    findViewById(R.id.eyes_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.eyes_img).setVisibility(View.INVISIBLE);
                break;
            case R.id.Glasses:
                if (checked)
                    findViewById(R.id.glasses_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.glasses_img).setVisibility(View.INVISIBLE);
                break;
            case R.id.Hat:
                if (checked)
                    findViewById(R.id.hat_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.hat_img).setVisibility(View.INVISIBLE);
                break;
            case R.id.Mustache:
                if (checked)
                    findViewById(R.id.mustache_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.mustache_img).setVisibility(View.INVISIBLE);
                break;
            case R.id.Mouth:
                if (checked)
                    findViewById(R.id.mouth_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.mouth_img).setVisibility(View.INVISIBLE);
                break;
            case R.id.Nose:
                if (checked)
                    findViewById(R.id.nose_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.nose_img).setVisibility(View.INVISIBLE);
                break;
            case R.id.Shoes:
                if (checked)
                    findViewById(R.id.shoes_img).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.shoes_img).setVisibility(View.INVISIBLE);
                break;
        }
    }

}

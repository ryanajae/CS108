package edu.stanford.cs108.colorpicker;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeColor(View view) {
        SeekBar redBar = (SeekBar)findViewById(R.id.redBar);
        SeekBar greenBar = (SeekBar)findViewById(R.id.greenBar);
        SeekBar blueBar = (SeekBar)findViewById(R.id.blueBar);
        int red = redBar.getProgress();
        int green = greenBar.getProgress();
        int blue = blueBar.getProgress();
        View colorView = (View)findViewById(R.id.colorBack);
        colorView.setBackgroundColor(Color.rgb(red,green,blue));
        TextView rgbValues = (TextView)findViewById(R.id.rgbValues);
        rgbValues.setText("Red: " + red + ", Green " + green + ", Blue " + blue);
    }
}

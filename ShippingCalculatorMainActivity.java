package edu.stanford.cs108.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final int nextDayAir = 10, secondDayAir = 5, stdAir = 3;

    /*
     * calculateCost is called when the Calculate Cost button is clicked.
     * The function first parses the string entered in the EditText to the
     * number of lbs to be shipped. That weight is then multiplied times
     * the appropriate rate as determined by the user-checked radio button.
     * Finally, the CheckBox is checked and the cost is increased by 20% if
     * so. The cost is then set in the displayCost TextView.
     */
    public void calculateCost(View view) {
        TextView displayCost = (TextView)findViewById(R.id.totalCost);
        EditText weight = (EditText)findViewById(R.id.enteredWeight);

        int cost = Integer.parseInt(weight.getText().toString()); // lbs to be shipped

        RadioGroup shipSpeed = (RadioGroup)findViewById(R.id.shipSpeed);
        int chosenSpeed = shipSpeed.getCheckedRadioButtonId();
        if (chosenSpeed == R.id.nextDay) {
            cost = cost * nextDayAir;
        } else if (chosenSpeed == R.id.secondDay) {
            cost = cost * secondDayAir;
        } else if (chosenSpeed == stdAir) {
            cost = cost * stdAir;
        }

        CheckBox insurBox = (CheckBox)findViewById(R.id.insurBox);
        if (insurBox.isChecked()) cost += (cost * 0.2);

        displayCost.setText("Cost: $" + cost);
    }

}

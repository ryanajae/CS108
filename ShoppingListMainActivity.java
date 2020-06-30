package edu.stanford.cs108.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String globalList = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * addItem is called when the Add Item button is clicked.
     * The grocery item entered into the EditText view is
     * converted toString and appended to the global shopping
     * list String. The textView then has its text reset with
     * the updated list.
     */
    public void addItem(View view) {
        TextView textView = (TextView)findViewById(R.id.textOutput);
        EditText edit = (EditText)findViewById(R.id.addItem);
        String newItem = edit.getText().toString();
        globalList = globalList + newItem + "\n";
        textView.setText(globalList);
        edit.getText().clear();
    }

    /*
     * clearList is called when the Clear List button is
     * clicked. The global shopping list String is set to the
     * empty string, and the TextView is updated to display
     * the new globalList.
     */
    public void clearList(View view) {
        TextView textView = (TextView)findViewById(R.id.textOutput);
        globalList = "";
        textView.setText(globalList);
    }

}

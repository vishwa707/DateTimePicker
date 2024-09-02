package com.example.datetimepicker;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this matches your layout file name

        // Initialize views
        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1; // Month is 0-based
                int year = datePicker.getYear();

                // Get selected time
                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();

                // Format date and time
                String selectedDateTime = "Selected Date: " + day + "/" + month + "/" + year + "\n" +
                        "Selected Time: " + String.format("%02d:%02d", hour, minute);

                // Display in TextView
                textView.setText(selectedDateTime);
            }
        });
    }
}

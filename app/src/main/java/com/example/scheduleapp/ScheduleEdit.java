package com.example.scheduleapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ScheduleEdit extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog alertDialog;
    private TextView txtTitle,txtDesc;
    private CardView btnCalendar,btnDelete,btnEdit;
    private ImageView btnScheduleBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_edit);

        txtTitle = findViewById(R.id.scheduleEditTitle);
        txtDesc = findViewById(R.id.scheduleDescTxt);
        btnScheduleBack = findViewById(R.id.scheduleBtnBack);
        btnCalendar = findViewById(R.id.btnCalendar);
        btnDelete = findViewById(R.id.scheduleBtnDelete);
        btnEdit = findViewById(R.id.scheduleBtnEdit);

        btnScheduleBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        txtTitle.setText("Jemput Ela");

        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createNewCalendarDialog();
            }
        });

    }

    private void createNewCalendarDialog(){
        CalendarView calendarView;
        EditText editTextStart,editTextFinish;
        Button btnSave;
        ImageView btnClose;

        dialogBuilder = new AlertDialog.Builder(this);
        final View calendarPopupView = getLayoutInflater().inflate(R.layout.schedule_calendar_pop_up,null);

        calendarView = calendarPopupView.findViewById(R.id.calendarView);
        editTextStart = calendarPopupView.findViewById(R.id.editTextTimeStart);
        editTextFinish = calendarPopupView.findViewById(R.id.editTextTimeFinish);
        btnSave = calendarPopupView.findViewById(R.id.btnSave);

        dialogBuilder.setView(calendarPopupView);
        alertDialog = dialogBuilder.create();
        alertDialog.show();

        btnClose = calendarPopupView.findViewById(R.id.btnClose); btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { alertDialog.dismiss(); }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //alertDialog.dismiss();
            }
        });
    }
}
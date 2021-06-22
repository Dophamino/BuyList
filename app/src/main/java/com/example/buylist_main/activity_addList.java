package com.example.buylist_main;

import android.text.InputType;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class activity_addList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list);
        createArrays();
    }

    public void createArrays(){
        ArrayList<View> txtEdits = new ArrayList<>();
        ArrayList<View> trashbins = new ArrayList<>();
        txtEdits.add(findViewById(R.id.addList_item0));
        trashbins.add(findViewById(R.id.addList_btnDel0));
    }

    public void addList_addItem (View view){
        GridLayout tmpGLA = findViewById(R.id.addList_grid);
        EditText newTxtEdit = new EditText(this);
        newTxtEdit.setId(View.generateViewId());
        GridLayout.LayoutParams lpTxtEdit = new GridLayout.LayoutParams();
        lpTxtEdit.leftMargin =(int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,8,getResources().getDisplayMetrics());
        lpTxtEdit.rightMargin =(int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,8,getResources().getDisplayMetrics());
        lpTxtEdit.columnSpec=GridLayout.spec(GridLayout.UNDEFINED,9f);
        newTxtEdit.setLayoutParams(lpTxtEdit);
        newTxtEdit.setHint(R.string.addList_itemHint);
        newTxtEdit.setInputType(InputType.TYPE_CLASS_TEXT);
        newTxtEdit.setHintTextColor(getResources().getColor(R.color.lightGray));
        newTxtEdit.setTextColor(getResources().getColor(R.color.white));
        newTxtEdit.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(),R.color.black));

        ImageButton newImgBut = new ImageButton(this);
        newImgBut.setId(View.generateViewId());
        GridLayout.LayoutParams lpImgBut = new GridLayout.LayoutParams();
        lpImgBut.leftMargin=(int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,8,getResources().getDisplayMetrics());
        lpImgBut.rightMargin=(int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,8,getResources().getDisplayMetrics());
        lpImgBut.columnSpec=GridLayout.spec(GridLayout.UNDEFINED,1f);
        newImgBut.setLayoutParams(lpImgBut);
        newImgBut.setImageResource(R.drawable.app_trashbin);
        newImgBut.setBackgroundResource(R.color.transparent);
        newImgBut.setScaleX((float) 0.75);
        newImgBut.setScaleY((float) 0.75);
        newImgBut.setImageTintList(ContextCompat.getColorStateList(getApplicationContext(),R.color.black));

        tmpGLA.addView(newTxtEdit);
        tmpGLA.addView(newImgBut);
    }
}
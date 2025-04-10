package com.ifsc.imc;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomButton extends  androidx.appcompat.widget.AppCompatButton{
    float inicialx;

    public CustomButton(@NonNull Context context) {
        super(context);
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d( "Coordenadas","x" + Float.toString(event.getX())+
                " y"+Float.toString(event.getY()));

       int acao=event.getAction();

       switch (event.getAction()){
           case (MotionEvent.ACTION_DOWN):
               inicialx=event.getRawX();
               return true;

           case (MotionEvent.ACTION_MOVE):
               if(inicialx < event.getRawX()){
                   this.setBackgroundColor(Color.GREEN);
               }
               if(inicialx > event.getRawX()){
                   this.setBackgroundColor(Color.RED);
               }
               return true;
       }
    return true;

    }
}

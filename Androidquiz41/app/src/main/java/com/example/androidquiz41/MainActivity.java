package com.example.androidquiz41;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View V = new View(this)
        {
            int x = 150;
            int y = 150;
            protected void onDraw(Canvas canvas)
            {
                super.onDraw(canvas);
                Paint paint = new Paint();
                paint.setColor(Color.BLACK);
                canvas.drawRect(new Rect(0,0,getWidth(),getHeight()),paint);
                // ADD CODE HERE
                paint.setColor(Color.RED);
                canvas.drawRect(new Rect(0,0,getWidth()/2,getHeight()/2),paint);
                paint.setColor(Color.GREEN);
                canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,canvas.getWidth()/2,paint);
                paint.setColor(Color.YELLOW);
                for(int x = 0; x< getHeight(); x+=10){
                    canvas.drawLine(getWidth(),x,getWidth()-x,getHeight(),paint);

                }

            }

        };
        setContentView(V);
    }
}
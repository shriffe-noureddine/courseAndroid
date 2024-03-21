package com.example.androidquiz42;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); View V = new View(this)
        {
            int x = 100;
            int y = 100;
            char[]   A   =   new char[]{' ','x','o', ' ','x','o', 'o','x',' '};

            protected void onDraw(Canvas canvas)
            {
                super.onDraw(canvas);
                Paint paint = new Paint();
                paint.setColor(Color.BLACK);
                // ADD CODE HERE
                canvas.drawLine(getWidth()/3, 30, getWidth()/3, getHeight()-30, paint);
                canvas.drawLine((float) (getWidth() *(0.66)), 30, (float) (getWidth()* (0.66)), getHeight()-30, paint);
                canvas.drawLine(30, getHeight()/3, getWidth()-30, getHeight()/3, paint);
                canvas.drawLine(30, (float) (getHeight() *(0.66)), getWidth()-30, (float) (getHeight() *(0.66)), paint);

//                canvas.drawText(A,0,1,getWidth()/6,getHeight()/6,paint);
//                canvas.drawText(A,1,1,getWidth()/2,getHeight()/6,paint);
//                canvas.drawText(A,2,1, (float) (getWidth()*(0.833)), getHeight()/6,paint);
//
//                canvas.drawText(A,3,1,getWidth()/6,getHeight()/2,paint);
//                canvas.drawText(A,4,1,getWidth()/2,getHeight()/2,paint);
//                canvas.drawText(A,5,1,(float) (getWidth()*(0.833)),getHeight()/2,paint);
//
//                canvas.drawText(A,6,1,getWidth()/6,(float) (getHeight()*(0.833)),paint);
//                canvas.drawText(A,7,1,getWidth()/2,(float) (getHeight()*(0.833)),paint);
//                canvas.drawText(A,8,1,(float) (getWidth()*(0.833)),(float) (getHeight()*(0.833)),paint);

            }

            public boolean onTouchEvent(MotionEvent event)
            {
                x = getWidth() / (int) event.getX() ;
                y = getHeight() / (int) event.getY();

                int i = x+y;
                System.out.println("x "+x);
                System.out.println("y "+y);

                if (A[i] == 'x'){
                    A[i] = 'o';
                }else if (A[i] == 'o'){
                    A[i] = 'x';
                }else {
                    A[i] = 'x';
                }
                invalidate();
                return super.onTouchEvent(event);
            }
        };
        setContentView(V);
    }
}

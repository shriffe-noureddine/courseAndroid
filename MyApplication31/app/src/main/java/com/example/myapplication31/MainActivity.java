package com.example.myapplication31;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button B;
    ProgressBar P;
    TextView T;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B = (Button) findViewById(R.id.button);
        P = (ProgressBar) findViewById(R.id.progressBar);
        T = (TextView) findViewById(R.id.textView);
        B.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
// start the Async task
                @SuppressLint("StaticFieldLeak") AsyncTask<Void,Integer,String> A = new AsyncTask<Void, Integer, String>()
                {
                    // runs in the Worker Thread
                    protected String doInBackground(Void... voids)
                    {
                        for(int i=0 ; i<100 ;i++)
                        {
                            try
                            {
                                Thread.sleep(500);
                            }
                            catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                            publishProgress(i); // trigger ’onProgressUpdate(.)’ in UI Thread
                            i++;
                        }
                        return "This is the result"; // trigger ’onPostExecute(.)’ in UI Thread
                    }
                    // runs in the UI Thread
                    protected void onProgressUpdate(Integer... values)
                    {
                        super.onProgressUpdate(values);
                        P.setProgress(values[0]);
                    }
                    // runs in the UI Thread
                    protected void onPostExecute(String s)
                    {
                        super.onPostExecute(s);
                        T.setText(s);
                    }
                };
                A.execute(); // start the Worker Thread and run ’doInBackground(.)’
            }
        });
    }
}

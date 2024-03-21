package com.example
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication2.R
import android.view.View
import android.widget.EditText
import android.os.Parcel
import android.os.Parcelable

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val euros = findViewById<View>(R.id.euros) as EditText
        val bitcoin = findViewById<View>(R.id.bitcoin) as EditText
        euros.setOnEditorActionListener { textView, i, keyEvent ->
            val euros = textView.text.toString().toDouble()
            bitcoin.setText(java.lang.Double.toString(euros * 2))
            true
        }
        bitcoin.setOnEditorActionListener { textView, i, keyEvent ->
            val bitcoin = textView.text.toString().toDouble()
            euros.setText(java.lang.Double.toString(bitcoin / 2))
            true
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}
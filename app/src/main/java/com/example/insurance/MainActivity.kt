package com.example.insurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerAge.setOnItemClickListener(this)
        buttonCalculate.setOnClickListener {
            calculatePremium()
        }
    }

    private fun calculatePremium(){
        val position = spinnerAge.selectedItemPosition
        var premium: Int
        val gender = radioGroupGender.checkedRadioButtonId

        if(position == 1){
            premium = 60
        }

        if(gender == R.id.radioButtonMale){
            //TODO: Calculate premium for male
        }

        if(checkBoxSmoker.isChecked){
            //TODO: calculate premium for smoker
        }
    }
}

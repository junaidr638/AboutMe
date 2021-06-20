package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    data class MyName(var name:String="",var nickname: String="")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myName= MyName("Junaid")

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName = myName
        binding.myName.nickname = "PseudoProgrammer"
        binding.doneButton.setOnClickListener(
            getNickName(it)
        )

//        findViewById<Button>(R.id.done_button).setOnClickListener{
//            getNickName(it)com/example/aboutme/MainActivity.kt:19
//        }



    }

    private fun getNickName(view: View) {
        binding.myName.nickname = 
        nicknameEdit.visibility = View.GONE
        nicknameText.visibility = View.VISIBLE
        view.visibility = View.GONE


        //hiding the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }

}
package com.example.successalertdialog

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.successalertdialog.databinding.ActivityMainBinding
import com.example.successalertdialog.databinding.CustomAlertDialogBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {

            btn.setOnClickListener {

                val builder = AlertDialog.Builder(this@MainActivity)
                val customAlertDialogBinding = CustomAlertDialogBinding.inflate(layoutInflater)

                builder.setView(customAlertDialogBinding.root)

                val alertDialog = builder.create()
                alertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                alertDialog.show()

                customAlertDialogBinding.apply {

                    closeImg.setOnClickListener {

                        alertDialog.dismiss()

                    }
                    okBtn.setOnClickListener {
                        alertDialog.dismiss()
                        Toast.makeText(this@MainActivity, "Ok", Toast.LENGTH_SHORT).show()
                    }

                }

            }

        }

    }
}
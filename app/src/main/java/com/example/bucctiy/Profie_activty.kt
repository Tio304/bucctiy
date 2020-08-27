package com.example.bucctiy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bucctiy.R.layout.activity_profie_activity
import kotlinx.android.synthetic.main.activity_profie_activity.*


class Profie_activty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_profie_activity)
        ambilData()
    }

    private fun ambilData() {
        val bundle = intent.extras
        val nama = bundle!!.getString("Nama")
        val namatoko = bundle.getString("Nama Toko")
        val Jenistoko = bundle.getString("Jenis Toko")
        val waktubuka = bundle.getString("Waktu BUka")
        val gender = bundle.getString("gender")
        val email = bundle.getString("Email")
        val telp = bundle.getString("Telp")
        val alamat = bundle.getString("Alamat")

        txtName.text = nama
        txttoko.text = namatoko
        txtjenis.text = Jenistoko
        txttime.text = waktubuka
        txtGender.text = gender
        txtEmail.text = email
        txtTelp.text = telp
        txtAddress.text = alamat
    }
}

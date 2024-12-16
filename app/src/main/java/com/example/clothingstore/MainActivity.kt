package com.example.clothingstore

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.clothingstore.Data.DataBase.API.GenderApi
import com.example.clothingstore.Domain.Model.Gender
import com.example.clothingstore.databinding.ActivityMainBinding
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.0.156:8080/") // Для локального сервера в эмуляторе 10.0.2.2 //Для другого 192.168.0.156
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(GenderApi::class.java)

        // Получение данных
        api.getAllGenders().enqueue(object: Callback<List<Gender>> {
            override fun onResponse(call: Call<List<Gender>>, response: Response<List<Gender>>) {
                if (response.isSuccessful) {
                    val genders = response.body()
                    binding.testTextView.text = genders?.get(0)?.genderName
                }
                else binding.testTextView.text = "fail"
            }

            override fun onFailure(call: Call<List<Gender>>, t: Throwable) {
                Log.d("DBase", t.message.toString())
            }
        })
    }




}
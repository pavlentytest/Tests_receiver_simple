package ru.myitacademy.samsung.tests

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Empty: AppCompatActivity() {
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           //регистрируем первый приёмник. Сначала создаём фильтр, затем применяем
             val if1 =  IntentFilter("ru.myitacademy.samsung.advertising.POST")
             registerReceiver(MyReceiver(),if1)

        }
    }



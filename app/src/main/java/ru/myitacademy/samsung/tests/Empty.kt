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
            //изменения в упражнении 4.7.2
           if1.priority = -1
            registerReceiver(MyReceiver(),if1)
           //регистрируем второй приёмник. Создаём фильтр при регистрации
            registerReceiver(MyReceiver2(),
                             IntentFilter("ru.myitacademy.samsung.advertising.POST")
                                 // изменение для упражнения 4.7.2
                                   .apply { priority = 1 }
            )
        }
    }



package br.com.danielcastro.componentesaplicacao1

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import br.com.danielcastro.componentesaplicacao1.R

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    btUm.setOnClickListener{
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        val alarmIntent = Intent(this, AlarmReceiver::class.java)
        alarmIntent.putExtra("MSG2", "Metal Gear Solid 2")

        val pendingIntent = PendingIntent.getBroadcast(this, 0 , alarmIntent,
                PendingIntent.FLAG_CANCEL_CURRENT)

        alarmManager.set(AlarmManager.RTC_WAKEUP, Calendar.getInstance().timeInMillis + 5000,
                pendingIntent)

    }

    btDois.setOnClickListener {
        NotificationUtils.showNotification(this,
                1234,
                "CHANNEL_BOTAO_DOIS",
                "CHANNEL_BOTAO_DOIS_NAME",
                "Hello notification",
                "Este é o primeiro exemplo")
    }


    }
}

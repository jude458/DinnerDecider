package com.example.swooh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.swooh.R
import com.example.swooh.Utilities.EXTRA_LEAGUE
import com.example.swooh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)


        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skills = intent.getStringExtra(EXTRA_SKILL)

        searchLeague.text = "Looking for a $league $skills League Near You "


    }

}

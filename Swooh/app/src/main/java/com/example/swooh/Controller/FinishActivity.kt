package com.example.swooh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.swooh.Model.Player
import com.example.swooh.R
import com.example.swooh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)


        var player = intent.getParcelableExtra<Player>( EXTRA_PLAYER)

        searchLeague.text = "Looking for a ${player.league}  ${player.skills} League Near You "


    }

}
 
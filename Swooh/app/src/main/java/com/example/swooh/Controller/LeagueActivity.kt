package com.example.swooh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooh.Model.Player
import com.example.swooh.R
import com.example.swooh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


         fun onMensClicked(view: View){
             womenLeagueBtn.isChecked = false
             coedLeagueBtn.isChecked = false

             player.league = "mens"

         }

         fun  onWomensClicked (view: View){
             mensLeagueBtn.isChecked = false
             coedLeagueBtn.isChecked = false

             player.league = "womens"

         }

        fun onCoedClicked( view: View){
             mensLeagueBtn.isChecked = false
             womenLeagueBtn.isChecked = false

             player.league = "co-ed"

        }

    fun leagueNextClicked(view: View) {
        if (player.league != ""){
            val skillsActivity = Intent(this, SkillsActivity::class.java)
            skillsActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillsActivity)

        }else
            Toast.makeText(this,"Plases Select a league",Toast.LENGTH_SHORT).show()


    }




}
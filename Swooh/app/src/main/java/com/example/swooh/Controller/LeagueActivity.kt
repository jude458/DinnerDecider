package com.example.swooh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooh.Utilities.EXTRA_LEAGUE
import com.example.swooh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


         fun onMensClicked(view: View){
             womenLeagueBtn.isChecked = false
             coedLeagueBtn.isChecked = false

             selectedLeague = "mens"

         }

         fun  onWomensClicked (view: View){
             mensLeagueBtn.isChecked = false
             coedLeagueBtn.isChecked = false

             selectedLeague = "womens"

         }

        fun onCoedClicked( view: View){
             mensLeagueBtn.isChecked = false
             womenLeagueBtn.isChecked = false

             selectedLeague = "co-ed"

        }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != ""){
            val skillsActivity = Intent(this, SkillsActivity::class.java)
            skillsActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillsActivity)

        }else
            Toast.makeText(this,"Plases Select a league",Toast.LENGTH_SHORT).show()


    }




}
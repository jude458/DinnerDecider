package com.example.swooh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooh.Utilities.EXTRA_LEAGUE
import com.example.swooh.Utilities.EXTRA_SKILL
import com.example.swooh.R
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {
    var league = ""
    var skills = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

       fun onBeginnerChecked(view: View){
           ballerSkillBtn.isChecked = false

           skills = "beginner"

       }

         fun  onBallerChecked (view: View){
           beginnerSkillBtn.isChecked = false

             skills = "baller"
         }

     fun onSkillFinishCkecked(view: View){
         if( skills != ""){
             val finshActivity = Intent(this, FinishActivity :: class.java)
             finshActivity.putExtra(EXTRA_LEAGUE, league)
             finshActivity.putExtra(EXTRA_SKILL,skills)
             startActivity(finshActivity)
         }else
             Toast.makeText(this,"Plases Select a Skills",Toast.LENGTH_SHORT).show()

     }
}

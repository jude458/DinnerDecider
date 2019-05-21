package com.example.swooh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooh.Model.Player

import com.example.swooh.R
import com.example.swooh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {
    lateinit var  player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

       fun onBeginnerChecked(view: View){
           ballerSkillBtn.isChecked = false

           player.skills = "beginner"

       }

         fun  onBallerChecked (view: View){
           beginnerSkillBtn.isChecked = false

             player.skills = "baller"
         }

     fun onSkillFinishCkecked(view: View){
         if( player.skills != ""){
             val finshActivity = Intent(this, FinishActivity :: class.java)
             finshActivity.putExtra(EXTRA_PLAYER,player)
             startActivity(finshActivity)
         }else
             Toast.makeText(this,"Plases Select a Skills",Toast.LENGTH_SHORT).show()

     }
}

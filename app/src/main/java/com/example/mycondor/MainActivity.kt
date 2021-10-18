package com.example.mycondor
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Write a message to the database
        val database = Firebase.database
        val myRef = database.getReference("message")
        myRef.setValue("Hello, World CONDOR#10!")


        val cardAdherants = findViewById(R.id.cardAdherants) as CardView

        cardAdherants.setOnClickListener {
            val intent=Intent(this,Adherant::class.java)
            startActivity(intent)
            finish()
        }

        val cardVente = findViewById(R.id.cardVente) as CardView
        cardVente.setOnClickListener {showToast("card Vente selected !!") }

        val cardPaiements = findViewById(R.id.cardPaiements) as CardView
        cardPaiements.setOnClickListener {showToast("card Paiements selected !!") }

        val cardReceptions = findViewById(R.id.cardReceptions) as CardView
        cardReceptions.setOnClickListener {showToast("card Receptions selected !!") }

        val cardStatistiques = findViewById(R.id.cardStatistiques) as CardView
        cardStatistiques.setOnClickListener {showToast("card Statistiques selected !!") }

        val cardSpeculations = findViewById(R.id.cardSpeculations) as CardView
        cardSpeculations.setOnClickListener {showToast("card Speculations selected !!") }

        val cardUtilisateurs = findViewById(R.id.cardUtilisateurs) as CardView
        cardUtilisateurs.setOnClickListener {showToast("card Utilisateurs selected !!") }

        val cardLogout = findViewById(R.id.cardLogout) as CardView
        cardLogout.setOnClickListener {showToast("card Logout selected !!") }

    }

    fun showToast( message:String?){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

}

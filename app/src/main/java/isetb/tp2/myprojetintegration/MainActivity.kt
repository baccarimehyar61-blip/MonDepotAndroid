package isetb.tp2.myprojetintegration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun afficher(v: View){
        Toast.makeText(this@MainActivity, "Connexion réussie", Toast.LENGTH_LONG).show()
        val intent = Intent(this, AccueilActivity::class.java)
        startActivity(intent)
    }
}
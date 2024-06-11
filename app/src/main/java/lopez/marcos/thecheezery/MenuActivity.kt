package lopez.marcos.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import lopez.marcos.thecheezery.ui.theme.TheCheezeryTheme

class MenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.button_cold_drinks)
        var btnHot: Button = findViewById(R.id.button_hot_drinks)
        var btnSweet: Button = findViewById(R.id.button_sweets)
        var btnSalties: Button = findViewById(R.id.button_salties)

        btnCold.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            var intent1: Intent = Intent(this, ProductosActivity2::class.java)
            startActivity(intent1)
        }

        btnSweet.setOnClickListener {
            var intent1: Intent = Intent(this, ProductosActivity3::class.java)
            startActivity(intent1)
        }

        btnSalties.setOnClickListener {
            var intent1: Intent = Intent(this, ProductosActivity2::class.java)
            startActivity(intent1)
        }
    }
}

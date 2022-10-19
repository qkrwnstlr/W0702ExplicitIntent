package kr.ac.kumoh.s20180489.w0702explicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kr.ac.kumoh.s20180489.w0702explicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnExplicitIntent.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
            Toast.makeText(this@MainActivity,"눌렸습니다.",Toast.LENGTH_LONG).show()
        }
        binding.btnImplicitIntent.setOnClickListener {
            val uri = Uri.parse("https://www.youtube.com/results?search_query=${binding.editText.text}")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}
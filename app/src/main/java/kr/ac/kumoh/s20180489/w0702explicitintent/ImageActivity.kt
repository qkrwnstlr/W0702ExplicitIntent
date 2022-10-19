package kr.ac.kumoh.s20180489.w0702explicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kr.ac.kumoh.s20180489.w0702explicitintent.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {
    private val binding by lazy { ActivityImageBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.imageView.setImageResource(R.drawable.cats)
        binding.imageView.scaleType = ImageView.ScaleType.CENTER_CROP
    }
}
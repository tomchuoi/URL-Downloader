package com.luckyshrine.urldownloader
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.luckyshrine.urldownloader.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        binding.buttonInstall.setOnClickListener {
            val downloader = AndroidDownloader(this)
            downloader.downloadFile("https://github.com/tomchuoi/test_apk/blob/main/Fate_Grand%20Order_2.80.5_Apkpure.apk")
        }
        setContentView(view)
    }
}
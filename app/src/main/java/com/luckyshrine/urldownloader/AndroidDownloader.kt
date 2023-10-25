package com.luckyshrine.urldownloader

import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import androidx.core.net.toUri

class AndroidDownloader (
    private val context: Context
): Downloader {
    private val downloadManager = context.getSystemService(DownloadManager::class.java)
    override fun downloadFile(url: String): Long {
        val request = DownloadManager.Request(url.toUri())
            .setMimeType("application/vnd.android.package-archive")
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI and DownloadManager.Request.NETWORK_MOBILE )
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setTitle("Fate_Grand Order_2.80.5_Apkpure.apk")
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "Fate_Grand Order_2.80.5_Apkpure.apk")
        return downloadManager.enqueue(request)
    }
}
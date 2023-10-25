package com.luckyshrine.urldownloader

interface Downloader {
    fun downloadFile(url: String): Long
}
package com.luckyshrine.urldownloader

import android.content.Context
import android.widget.Toast

fun Context.showMessage(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
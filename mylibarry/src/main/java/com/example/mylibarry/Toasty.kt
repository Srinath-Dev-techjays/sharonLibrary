package com.example.mylibarry

import android.content.Context
import android.widget.Toast


 class Toasty {
     companion object {
         fun toaster(context: Context, msg: String) {
             Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
         }
     }
}
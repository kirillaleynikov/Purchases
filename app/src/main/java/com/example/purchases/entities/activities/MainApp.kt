package com.example.purchases.entities.activities

import android.app.Application
import com.example.purchases.entities.db.MainDataBase

class MainApp : Application(){
    val database by lazy {MainDataBase.getDataBase(this)}
}
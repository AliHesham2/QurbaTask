package com.example.qurbatask.navigation


import com.example.qurbatask.R
import com.example.qurbatask.util.Statics

sealed class AppRoute(val route:String){
    object Splash : AppRoute(Statics.resources.getString(R.string.splash))
    object DashBoard : AppRoute(Statics.resources.getString(R.string.dashboard))
    object Home : AppRoute(Statics.resources.getString(R.string.HOME))
    object Menu : AppRoute(Statics.resources.getString(R.string.MENU))
    object Divide : AppRoute(Statics.resources.getString(R.string.DIVIDE))
    object Profile : AppRoute(Statics.resources.getString(R.string.PROFILE))
    object Friend : AppRoute(Statics.resources.getString(R.string.FRIEND))
}
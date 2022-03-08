package com.example.qurbatask.ui.component


import com.example.qurbatask.R
import com.example.qurbatask.util.Statics

sealed class  BottomBarScreen(val route: String, val icon: Int) {
    object Home : BottomBarScreen(
        route = Statics.resources.getString(R.string.HOME),
        icon = R.drawable.n_home
    )
    object Menu : BottomBarScreen(
        route = Statics.resources.getString(R.string.MENU),
        icon = R.drawable.n_eat
    )
    object Divide : BottomBarScreen(
        route = Statics.resources.getString(R.string.DIVIDE),
        icon = R.drawable.n_divide
    )

    object Friends : BottomBarScreen(
        route = Statics.resources.getString(R.string.FRIEND),
        icon = R.drawable.n_two_p
    )

    object Profile : BottomBarScreen(
        route = Statics.resources.getString(R.string.PROFILE),
        icon = R.drawable.n_person
    )


}

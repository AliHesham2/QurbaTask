package com.example.qurbatask.ui.dashboard

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.qurbatask.animation.AnimatedShimmer
import com.example.qurbatask.model.data.AllPosts
import com.example.qurbatask.model.service.GetPostsData
import com.example.qurbatask.ui.component.CustomView
import kotlinx.coroutines.delay


@Composable
fun HomeScreen(){
    //Observer when the data is loaded
    var data :AllPosts?  by remember { mutableStateOf(null) }
    //get the posts data
    data = GetPostsData().getData()
    data?.let { HomeDesign(it) }
}

//Display the posts data
@Composable
fun HomeDesign(data: AllPosts) {
    var disableAnimation  by remember { mutableStateOf(false) }
    LaunchedEffect(key1 = true) {
        // delay 1 sec to load fake data
        delay(1000)
        // change flag to true to show the fake data
        disableAnimation = true
    }
    if (!disableAnimation){ Column { repeat(7) {
        //Show loading animation
        AnimatedShimmer() } }
    }else{
        // Display the data
            LazyColumn(modifier = Modifier.padding(bottom = 60.dp), contentPadding = PaddingValues(top = 5.dp)){
                items(data.data){ postData ->
                    CustomView(posts = postData){ posts, social ->
                        //To check clicks and the returned data
                        Log.i("Aly Trace", social.toString())
                        Log.i("Aly Trace", posts.post.time)
                    }
                }
            }
    }
}


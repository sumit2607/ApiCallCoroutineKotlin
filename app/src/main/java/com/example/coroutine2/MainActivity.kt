package com.example.coroutine2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import retrofit2.create
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private var list= listOf<ResponseCat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiCall2=Netwirk5.getinstance().create(ApiCall::class.java)
        val apiCall=Network6.getinstance().create(ApiCall::class.java)
        runBlocking {
            val job:Job= CoroutineScope(Dispatchers.IO).launch {


                var res1: ApiCall = async {

                    val nalini2=apiCall2
                    return@async nalini2
                }.await()

                CoroutineScope(Dispatchers.Main).launch {
                    Glide.with(imageView1).load(res1.getDog().body()?.message).into(imageView1)
                }
                val res2:ApiCall=async {
                    val nalini=apiCall
                    return@async nalini
                }.await()
                CoroutineScope(Dispatchers.Main).launch {
                    list= res2.getCat().body()!!
                    setRecycle()
                }



            }
        }


    }
    fun setRecycle(){
        val Adapter=Adapter(list)
        val linier=LinearLayoutManager(this)
        recycleView1.adapter=Adapter
        recycleView1.layoutManager=linier
    }


}
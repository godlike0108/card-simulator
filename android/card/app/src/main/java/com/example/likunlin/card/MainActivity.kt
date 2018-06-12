package com.example.likunlin.card

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.view.ViewGroup

import android.view.ViewParent
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.widget.ImageView
import android.support.v4.view.ViewPager
import android.view.animation.AlphaAnimation
import java.util.*
import android.view.animation.Animation
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity() {
    var items_array: ArrayList<card_objects> = ArrayList()
    var num : Int = 0




    private val btn_card_click = View.OnClickListener{
        num = (Math.random()*10).toInt()
        when(num){
            1-> {

                scroll_view.setBackgroundColor(Color.WHITE)
            }
            2-> {
                scroll_view.setBackgroundColor(Color.GRAY)
            }

            3-> {
                scroll_view.setBackgroundColor(Color.GREEN)
            }

            4-> {
                scroll_view.setBackgroundColor(Color.BLUE)
            }

            5-> {
                scroll_view.setBackgroundColor(Color.RED)
            }

            6-> {
                scroll_view.setBackgroundColor(Color.WHITE)
            }

            7-> {
                scroll_view.setBackgroundColor(Color.GRAY)
            }

            8-> {
                scroll_view.setBackgroundColor(Color.GREEN)
            }

            9-> {
                scroll_view.setBackgroundColor(Color.BLUE)
            }


            10-> {
                scroll_view.setBackgroundColor(Color.RED)
            }



        }

        Log.v("test2",num.toString())
        Log.v("test3",items_array[num].card_img.toString())
        card.setImageResource(items_array[num].card_img)



    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        items_array.addAll(card_list().get())

        val animation = AlphaAnimation(0.1f, 1.0f)
        animation.repeatCount=Animation.INFINITE
        animation.duration = 3000

        //动画效果从XMl文件中定义
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        scroll_view.animation = animation
        Log.v("test",items_array[1].card_type)


        btn_card.setOnClickListener(btn_card_click)
    }

}



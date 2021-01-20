package com.example.s1mplify

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter

class ViewPagerAdapter(var mCtx: Context, var images: IntArray ): PagerAdapter(){

    lateinit var layoutInflater: LayoutInflater

    override fun getCount(): Int {
        return images.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view === `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInflater.inflate(R.layout.imageview, container, false)

        val imageView = view.findViewById<View>(R.id.imageView) as ImageView
        imageView.setImageResource(images[position])
        container.addView(view)
        return view
    }

    init{
        layoutInflater= mCtx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}
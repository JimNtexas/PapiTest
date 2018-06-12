package lander.udemy.grayraven.com.landdecider

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import android.graphics.drawable.Drawable
import java.util.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textHeader.setText("Can You Land?")
        papiView.visibility= View.VISIBLE

        val res = resources
        val imageList = arrayListOf<Drawable>(res.getDrawable(R.drawable.tohigh),res.getDrawable(R.drawable.high),
                res.getDrawable(R.drawable.onglidelslope), res.getDrawable(R.drawable.low), res.getDrawable(R.drawable.pullup))
        val random = Random()
        papiView.setImageDrawable(imageList[random.nextInt(imageList.count())])

    }

}


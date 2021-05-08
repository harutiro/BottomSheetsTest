package app.makino.harutiro.bottomsheetstest

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior


class MainActivity : AppCompatActivity(), View.OnClickListener {
    var mBottomSheetBehavior: BottomSheetBehavior<*>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<View>(R.id.bottom_sheet_layout)
        val imageView = findViewById<View>(R.id.imageView1) as ImageView
        imageView.setOnClickListener(this)
        mBottomSheetBehavior = BottomSheetBehavior.from(view)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.imageView1 -> if (mBottomSheetBehavior!!.state == BottomSheetBehavior.STATE_EXPANDED) {
                mBottomSheetBehavior!!.setState(BottomSheetBehavior.STATE_COLLAPSED)
            } else {
                mBottomSheetBehavior!!.setState(BottomSheetBehavior.STATE_EXPANDED)
            }
        }
    }
}
package com.tian.videomergedemo

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class TestKe : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        TextView.btn_click;
        btn_click.setText("bbbbbbb")
        btn_click.setOnClickListener {  }
    }


}

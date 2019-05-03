package com.wangkm.video.tools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wangkm.video.tools.utils.FFmpegUtils
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * @author: created by wangkm
 * @Time: 2019-05-03
 * @Des：MainActivity
 * @Email: kangmao.wang@foxmail.com
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_test.text = FFmpegUtils.stringJni()
    }
}

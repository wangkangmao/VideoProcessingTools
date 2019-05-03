package com.wangkm.video.tools.utils

/**
 * @author: created by wangkm
 * @Time: 2019-05-03 23:19
 * @Des： FFmpegUtils工具类
 * @Email: kangmao.wang@foxmail.com
 */
object FFmpegUtils {

    init {
        System.loadLibrary("avutil")
        System.loadLibrary("avcodec")
        System.loadLibrary("avformat")
        System.loadLibrary("avdevice")
        System.loadLibrary("swresample")
        System.loadLibrary("swscale")
        System.loadLibrary("avfilter")
        System.loadLibrary("ffmpeg")
    }

    external fun stringNative(): String

    external fun stringJni(): String

    external fun decode(filePath: String, outputStr: String): Int

    external fun stream(inputUrl: String, ouputUrl: String): Int
}
package com.shiwenping.jpeglib

import android.graphics.Bitmap

/**
 * Created by shiwenping on 18-1-3 下午3:22.
 *
 *
 */
class JpegUtils {
    init {
        System.loadLibrary("native-lib")
    }

    companion object {
        /**
         * 压缩
         */
        external fun compressBitmap(bitmap: Bitmap, width: Int, height: Int, fileName: String, quality: Int): Boolean
    }
}
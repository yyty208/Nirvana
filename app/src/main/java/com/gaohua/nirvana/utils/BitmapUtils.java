package com.gaohua.nirvana.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/**
 * gaohua 于 15/8/26创建.
 * 邮箱:aksdqezgjj@gmail.com
 * 类描述:bitmap工具类
 */
public class BitmapUtils {
    /**
     *
     * @author 高骅
     * @Description 压缩bitmapz
     * @return Bitmap
     * @date 2014-10-19 上午12:25:02
     */
    public static Bitmap scaleImg(Bitmap bm, int newWidth, int newHeight) {
        // 获得图片的宽高
        int width = bm.getWidth();
        int height = bm.getHeight();
        // 设置想要的大小
        int newWidth1 = newWidth;
        int newHeight1 = newHeight;
        // 计算缩放比例
        float scaleWidth = ((float) newWidth1) / width;
        float scaleHeight = ((float) newHeight1) / height;
        // 取得想要缩放的matrix参数
        Matrix matrix = new Matrix();
        matrix.postScale(scaleWidth, scaleHeight);
        matrix.postRotate(0);

        return Bitmap.createScaledBitmap(bm, newWidth, newHeight, false);
    }


}

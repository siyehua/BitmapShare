package com.siyehua.bitmapshare;

import android.graphics.Bitmap;

public class JniInterface {

    static native long getBitmapPixelDataMemoryPtr(Bitmap bitmap);
}

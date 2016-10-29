package com.zdc;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/**
 * @description 应用程序的工具类,包括获取handler、context、资源文件、像素 </br>加载一个布局、线程相关操作
 * 
 * @author zhaodecang
 * @date 2016-10-4下午2:03:11
 */
public class CommonUtil {

	// -------------------像素和分辨率-------------------
	/** 获取像素比 **/
	public static float getDisplayDensity(Context context) {
		return context.getResources().getDisplayMetrics().density;
	}

	public static int dp2px(float dp, Context context) {
		return (int) (dp * getDisplayDensity(context) + 0.5f);
	}

	public static float px2dp(int px, Context context) {
		return px / getDisplayDensity(context);
	}

	public static int getStatusBarHeight(View v) {
		if (v == null) {
			return 0;
		}
		Rect frame = new Rect();
		v.getWindowVisibleDisplayFrame(frame);
		return frame.top;
	}
}

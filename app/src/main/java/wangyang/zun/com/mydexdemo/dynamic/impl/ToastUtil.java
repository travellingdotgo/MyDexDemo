package wangyang.zun.com.mydexdemo.dynamic.impl;


import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    private Context mContext;

    public ToastUtil(Context mContext){
        this.mContext = mContext;
    }

    private static ToastUtil mInstance;

    public static ToastUtil getInstance(Context context){
        if (mInstance == null) {
            synchronized (ToastUtil.class) {
                if (mInstance == null) {
                    mInstance = new ToastUtil(context);
                }
            }
        }
        return mInstance;
    }

    public void showToast(){
        Toast.makeText(mContext,"动态加载 showToast", Toast.LENGTH_SHORT).show();
    }

}
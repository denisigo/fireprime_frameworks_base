package com.android.systemui.statusbar.policy;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class PowerButtonView extends KeyButtonView
{
	private Context mContext;
	public PowerButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public PowerButtonView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle);
        mContext = mContext;
    }
    
    @Override
    void sendEvent(int action, int flags, long when) {
        if(action==KeyEvent.ACTION_UP){
        	Intent intent = new Intent("com.android.systemui.ACTION_SHOW_GLOBAL");
        	mContext.sendBroadcast(intent);
        }
    }

}

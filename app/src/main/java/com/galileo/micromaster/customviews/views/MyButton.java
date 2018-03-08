package com.galileo.micromaster.customviews.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.galileo.micromaster.customviews.R;


/**
 * Created by EEVGG on 07/03/2018.
 */

public class MyButton extends AppCompatButton {

    private Context context;
    public MyButton(Context context) {
        super(context);
        init(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init (Context context){
        this.context = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(isPressed())
            setBackgroundDrawable(context.getResources().getDrawable(R.drawable.button_pressed));
        else
            setBackgroundDrawable(context.getResources().getDrawable(R.drawable.button_not_pressed));

        setTextColor(Color.parseColor("#eceff1"));
        super.onDraw(canvas);
    }
}

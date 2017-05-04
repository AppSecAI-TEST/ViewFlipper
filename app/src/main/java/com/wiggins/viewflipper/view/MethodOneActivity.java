package com.wiggins.viewflipper.view;

import android.os.Bundle;
import android.widget.ViewFlipper;

import com.wiggins.viewflipper.R;
import com.wiggins.viewflipper.base.BaseActivity;

/**
 * @Description 方法一
 * @Author 一花一世界
 */
public class MethodOneActivity extends BaseActivity {

    private ViewFlipper mVfHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_one);

        mVfHelp = (ViewFlipper) findViewById(R.id.vf_help);
        mVfHelp.startFlipping();
    }
}

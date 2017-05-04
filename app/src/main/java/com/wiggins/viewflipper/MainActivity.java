package com.wiggins.viewflipper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wiggins.viewflipper.base.BaseActivity;
import com.wiggins.viewflipper.utils.UIUtils;
import com.wiggins.viewflipper.view.MethodOneActivity;
import com.wiggins.viewflipper.view.MethodTwoActivity;
import com.wiggins.viewflipper.widget.TitleView;

/**
 * @Description ViewFlipper(翻转视图)使用详解
 * @Author 一花一世界
 */
public class MainActivity extends BaseActivity implements View.OnClickListener {

    private MainActivity mActivity = null;
    private TitleView titleView;
    private Button mBtnMethodOne;
    private Button mBtnMethodTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;

        initView();
        setListener();
    }

    private void initView() {
        titleView = (TitleView) findViewById(R.id.titleView);
        titleView.setAppTitle(UIUtils.getString(R.string.title));
        titleView.setLeftImageVisibility(View.GONE);
        mBtnMethodOne = (Button) findViewById(R.id.btn_method_one);
        mBtnMethodTwo = (Button) findViewById(R.id.btn_method_two);
    }

    private void setListener() {
        mBtnMethodOne.setOnClickListener(this);
        mBtnMethodTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_method_one:
                intent = new Intent(mActivity, MethodOneActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_method_two:
                intent = new Intent(mActivity, MethodTwoActivity.class);
                startActivity(intent);
                break;
        }
    }
}

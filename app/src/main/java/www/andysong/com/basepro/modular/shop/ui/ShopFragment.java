package www.andysong.com.basepro.modular.shop.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.blankj.utilcode.util.LogUtils;
import com.qmuiteam.qmui.widget.QMUITopBar;

import butterknife.BindView;
import www.andysong.com.basepro.R;
import www.andysong.com.basepro.base.BaseFragment;

/**
 * <pre>
 *     author : andysong
 *     e-mail : songzhixiang960425@gmail.com
 *     time   : 2018/02/01
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class ShopFragment extends BaseFragment {
    @BindView(R.id.topbar)
    QMUITopBar mTopBar;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_search;
    }

    public static ShopFragment newInstance() {

        Bundle args = new Bundle();

        ShopFragment fragment = new ShopFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initEventAndData(View mView) {
        super.initEventAndData(mView);
        LogUtils.e("ShopFragment  加载了");
        mTopBar.setTitle("搜索");
        mTopBar.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.colorAccent));
    }
}

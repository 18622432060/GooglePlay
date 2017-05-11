package com.itheima.googleplay.ui.holder;

import java.util.ArrayList;

import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectViews;

import com.itheima.googleplay.R;
import com.itheima.googleplay.domain.AppInfo;
import com.itheima.googleplay.http.HttpHelper;
import com.itheima.googleplay.utils.BitmapHelper;
import com.itheima.googleplay.utils.UIUtils;
import com.lidroid.xutils.BitmapUtils;

/**
 * 首页详情页-截图
 * 
 * @author liupeng
 * @date 2016-11-3
 */
public class DetailPicsHolder extends BaseHolder<AppInfo> {

	@InjectViews({ R.id.iv_pic1, R.id.iv_pic2, R.id.iv_pic3, R.id.iv_pic4, R.id.iv_pic5 })
	ImageView[] ivPics;
	private BitmapUtils mBitmapUtils;

	@Override
	public View initView() {
		View view = UIUtils.inflate(R.layout.layout_detail_picinfo);
		ButterKnife.inject(this, view);
		mBitmapUtils = BitmapHelper.getBitmapUtils();
		return view;
	}

	@Override
	public void refreshView(AppInfo data) {
		final ArrayList<String> screen = data.screen;
		for (int i = 0; i < 5; i++) {
			if (i < screen.size()) {
				mBitmapUtils.display(ivPics[i], HttpHelper.URL + "image?name=" + screen.get(i));
			} else {
				ivPics[i].setVisibility(View.GONE);
			}
		}
	}

}
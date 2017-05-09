package com.itheima.googleplay.ui.holder;

import android.text.format.Formatter;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;

import com.itheima.googleplay.R;
import com.itheima.googleplay.domain.AppInfo;
import com.itheima.googleplay.http.HttpHelper;
import com.itheima.googleplay.utils.BitmapHelper;
import com.itheima.googleplay.utils.UIUtils;
import com.lidroid.xutils.BitmapUtils;

/**
 * 应用holder
 * 
 * @author liupeng
 * @date 2015-10-28
 */
public class AppHolder extends BaseHolder<AppInfo> {

	@InjectView(R.id.tv_name)
	TextView tvName;
	@InjectView(R.id.tv_size)
	TextView tvSize;
	@InjectView(R.id.tv_des)
	TextView tvDes;
	@InjectView(R.id.iv_icon)
	ImageView ivIcon;
	@InjectView(R.id.rb_star)
	RatingBar rbStar;

	private BitmapUtils mBitmapUtils;

	@Override
	public View initView() {
		View view = UIUtils.inflate(R.layout.list_item_home);
		ButterKnife.inject(this, view);
		mBitmapUtils = BitmapHelper.getBitmapUtils();
		return view;
	}

	@Override
	public void refreshView(AppInfo data) {
		tvName.setText(data.name);
		tvSize.setText(Formatter.formatFileSize(UIUtils.getContext(), data.size));
		tvDes.setText(data.des);
		rbStar.setRating(data.stars);
		mBitmapUtils.display(ivIcon, HttpHelper.URL + "image?name=" + data.iconUrl);
	}

}
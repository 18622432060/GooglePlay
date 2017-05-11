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
 * 详情页-应用信息
 * 
 * @author liupeng
 * @date 2016-11-1
 */
public class DetailAppInfoHolder extends BaseHolder<AppInfo> {

	@InjectView(R.id.iv_icon)
	ImageView ivIcon;
	@InjectView(R.id.tv_name)
	TextView tvName;
	@InjectView(R.id.tv_download_num)
	TextView tvDownloadNum;
	@InjectView(R.id.tv_version)
	TextView tvVersion;
	@InjectView(R.id.tv_date)
	TextView tvDate;
	@InjectView(R.id.tv_size)
	TextView tvSize;
	@InjectView(R.id.rb_star)
	RatingBar rbStar;
	BitmapUtils mBitmapUtils;

	@Override
	public View initView() {
		View view = UIUtils.inflate(R.layout.layout_detail_appinfo);
		ButterKnife.inject(this, view);
		mBitmapUtils = BitmapHelper.getBitmapUtils();
		return view;
	}

	@Override
	public void refreshView(AppInfo data) {
		mBitmapUtils.display(ivIcon, HttpHelper.URL + "image?name=" + data.iconUrl);
		tvName.setText(data.name);
		tvDownloadNum.setText("下载量:" + data.downloadNum);
		tvVersion.setText("版本号:" + data.version);
		tvDate.setText(data.date);
		tvSize.setText(Formatter.formatFileSize(UIUtils.getContext(), data.size));
		rbStar.setRating(data.stars);
	}

}
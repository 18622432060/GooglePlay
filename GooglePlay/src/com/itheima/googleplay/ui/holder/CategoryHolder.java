package com.itheima.googleplay.ui.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

import com.itheima.googleplay.R;
import com.itheima.googleplay.domain.CategoryInfo;
import com.itheima.googleplay.http.HttpHelper;
import com.itheima.googleplay.utils.BitmapHelper;
import com.itheima.googleplay.utils.StringUtils;
import com.itheima.googleplay.utils.UIUtils;
import com.lidroid.xutils.BitmapUtils;

public class CategoryHolder extends BaseHolder<CategoryInfo> {
	
	@InjectView(R.id.tv_name1)
	TextView tvName1;
	@InjectView(R.id.tv_name2)
	TextView tvName2;
	@InjectView(R.id.tv_name3)
	TextView tvName3;
	@InjectView(R.id.iv_icon1)
	ImageView ivIcon1;
	@InjectView(R.id.iv_icon2)
	ImageView ivIcon2;
	@InjectView(R.id.iv_icon3)
	ImageView ivIcon3;
	@InjectView(R.id.ll_grid1)
	LinearLayout llGrid1;
	@InjectView(R.id.ll_grid2)
	LinearLayout llGrid2;
	@InjectView(R.id.ll_grid3)
	LinearLayout llGrid3;

	private BitmapUtils mBitmapUtils;

	@Override
	public View initView() {
		View view = UIUtils.inflate(R.layout.list_item_category);
		ButterKnife.inject(this, view);
		mBitmapUtils = BitmapHelper.getBitmapUtils();
		return view;
	}

	@Override
	public void refreshView(CategoryInfo data) {
		tvName1.setText(data.name1);
		tvName2.setText(data.name2);
		tvName3.setText(data.name3);
		mBitmapUtils.display(ivIcon1, HttpHelper.URL + "image?name=" + data.url1);
		mBitmapUtils.display(ivIcon2, HttpHelper.URL + "image?name=" + data.url2);
		mBitmapUtils.display(ivIcon3, HttpHelper.URL + "image?name=" + data.url3);
		llGrid1.setVisibility(StringUtils.isEmpty(data.name1)?View.GONE:View.VISIBLE);
		llGrid2.setVisibility(StringUtils.isEmpty(data.name2)?View.GONE:View.VISIBLE);
		llGrid3.setVisibility(StringUtils.isEmpty(data.name3)?View.GONE:View.VISIBLE);
	}

	@OnClick({R.id.ll_grid1, R.id.ll_grid2, R.id.ll_grid3})
	public void onClick(View v) {
		CategoryInfo info = getData();
		switch (v.getId()) {
			case R.id.ll_grid1:
				Toast.makeText(UIUtils.getContext(), info.name1, Toast.LENGTH_SHORT).show();
				break;
			case R.id.ll_grid2:
				Toast.makeText(UIUtils.getContext(), info.name2, Toast.LENGTH_SHORT).show();
				break;
			case R.id.ll_grid3:
				Toast.makeText(UIUtils.getContext(), info.name3, Toast.LENGTH_SHORT).show();
				break;
			default:
				break;
		}
	}

}
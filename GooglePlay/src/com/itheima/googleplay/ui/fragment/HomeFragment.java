package com.itheima.googleplay.ui.fragment;

import java.util.ArrayList;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.itheima.googleplay.domain.AppInfo;
import com.itheima.googleplay.http.protocol.HomeProtocol;
import com.itheima.googleplay.ui.activity.HomeDetailActivity;
import com.itheima.googleplay.ui.adapter.MyBaseAdapter;
import com.itheima.googleplay.ui.holder.BaseHolder;
import com.itheima.googleplay.ui.holder.HomeHeaderHolder;
import com.itheima.googleplay.ui.holder.HomeHolder;
import com.itheima.googleplay.ui.view.LoadingPage.ResultState;
import com.itheima.googleplay.ui.view.MyListView;
import com.itheima.googleplay.utils.UIUtils;

/**
 * 首页
 * 
 * @author liupeng
 * @date 2016-10-27
 */
public class HomeFragment extends BaseFragment {

	private ArrayList<AppInfo> data;

	// 轮播条数据
	private ArrayList<String> mPictureList;

	// 如果加载数据成功, 就回调此方法, 在主线程运行  (加载页面 先执行onLoad() 再执行onCreateSuccessView())
	@Override
	public View onCreateSuccessView() {
		MyListView view = new MyListView(UIUtils.getContext());
		// 给listview增加头布局展示轮播条
		HomeHeaderHolder header = new HomeHeaderHolder();
		view.addHeaderView(header.getRootView());// 先添加头布局,再setAdapter
		view.setAdapter(new HomeAdapter(data));
		if (mPictureList != null) {
			// 设置轮播条数据
			header.setData(mPictureList);
		}
		view.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				AppInfo appInfo = data.get(position - 1);// 去掉头布局
				if (appInfo != null) {
					Intent intent = new Intent(UIUtils.getContext(),HomeDetailActivity.class);
					intent.putExtra("packageName", appInfo.packageName);
					startActivity(intent);
				}
			}
		});
		return view;
	}

	// 运行在子线程,可以直接执行耗时网络操作
	@Override
	public ResultState onLoad() {
		// 请求网络, HttpClient, HttpUrlConnection, XUtils
		HomeProtocol protocol = new HomeProtocol();
		data = protocol.getData(0);// 加载第一页数据
		mPictureList = protocol.getPictureList();
		return check(data);// 校验数据并返回
	}

	class HomeAdapter extends MyBaseAdapter<AppInfo> {

		public HomeAdapter(ArrayList<AppInfo> data) {
			super(data);
		}

		@Override
		public BaseHolder<AppInfo> getHolder(int position) {
			return new HomeHolder();
		}

		// 此方法在子线程调用
		@Override
		public ArrayList<AppInfo> onLoadMore() {
			HomeProtocol protocol = new HomeProtocol();
			// 20, 40, 60....  下一页数据的位置 等于 当前集合大小
			ArrayList<AppInfo> moreData = protocol.getData(getListSize());
			return moreData;
		}

	}

}
package com.itheima.googleplay.ui.fragment;

import java.util.ArrayList;

import android.view.View;

import com.itheima.googleplay.domain.SubjectInfo;
import com.itheima.googleplay.http.protocol.SubjectProtocol;
import com.itheima.googleplay.ui.adapter.MyBaseAdapter;
import com.itheima.googleplay.ui.holder.BaseHolder;
import com.itheima.googleplay.ui.holder.SubjectHolder;
import com.itheima.googleplay.ui.view.LoadingPage.ResultState;
import com.itheima.googleplay.ui.view.MyListView;
import com.itheima.googleplay.utils.UIUtils;

/**
 * 专题
 * 
 * @author liupeng
 * @date 2015-10-27
 */
public class SubjectFragment extends BaseFragment {

	private ArrayList<SubjectInfo> data;

	@Override
	public View onCreateSuccessView() {
		MyListView view = new MyListView(UIUtils.getContext());
		view.setAdapter(new SubjectAdapter(data));
		return view;
	}

	@Override
	public ResultState onLoad() {
		SubjectProtocol protocol = new SubjectProtocol();
		data = protocol.getData(0);
		return check(data);
	}

	class SubjectAdapter extends MyBaseAdapter<SubjectInfo> {

		public SubjectAdapter(ArrayList<SubjectInfo> data) {
			super(data);
		}

		@Override
		public BaseHolder<SubjectInfo> getHolder(int position) {
			return new SubjectHolder();
		}

		@Override
		public ArrayList<SubjectInfo> onLoadMore() {
			SubjectProtocol protocol = new SubjectProtocol();
			ArrayList<SubjectInfo> moreData = protocol.getData(getListSize());
			return moreData;
		}

	}
} 	
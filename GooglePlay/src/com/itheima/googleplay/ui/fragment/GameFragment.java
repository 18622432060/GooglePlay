package com.itheima.googleplay.ui.fragment;

import android.view.View;
import android.widget.TextView;

import com.itheima.googleplay.ui.view.LoadingPage.ResultState;
import com.itheima.googleplay.utils.UIUtils;

/**
 * 游戏
 * @author liupeng
 * @date 2015-10-27
 */
public class GameFragment extends BaseFragment {

	@Override
	public View onCreateSuccessView() {
		TextView view = new TextView(UIUtils.getContext());
		view.setText("GameFragment");
		return view;
	}

	@Override
	public ResultState onLoad() {
		return ResultState.STATE_SUCCESS;
	}

}
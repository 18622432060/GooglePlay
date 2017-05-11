// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.activity.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034174, "field 'mViewPager'");
    target.mViewPager = (android.support.v4.view.ViewPager) view;
    view = finder.findRequiredView(source, 2131034173, "field 'mPagerTab'");
    target.mPagerTab = (com.itheima.googleplay.ui.view.PagerTab) view;
  }

  public static void reset(com.itheima.googleplay.ui.activity.MainActivity target) {
    target.mViewPager = null;
    target.mPagerTab = null;
  }
}

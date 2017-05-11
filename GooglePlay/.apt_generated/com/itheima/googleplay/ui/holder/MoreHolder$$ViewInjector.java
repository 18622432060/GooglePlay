// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.holder;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MoreHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.holder.MoreHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034224, "field 'llLoadMore'");
    target.llLoadMore = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131034226, "field 'tvLoadError'");
    target.tvLoadError = (android.widget.TextView) view;
  }

  public static void reset(com.itheima.googleplay.ui.holder.MoreHolder target) {
    target.llLoadMore = null;
    target.tvLoadError = null;
  }
}

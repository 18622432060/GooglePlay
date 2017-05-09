// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.holder;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SubjectHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.holder.SubjectHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034228, "field 'tvTitle'");
    target.tvTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034227, "field 'ivPic'");
    target.ivPic = (android.widget.ImageView) view;
  }

  public static void reset(com.itheima.googleplay.ui.holder.SubjectHolder target) {
    target.tvTitle = null;
    target.ivPic = null;
  }
}

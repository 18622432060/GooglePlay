// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.holder;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DetailDesHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.holder.DetailDesHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034182, "field 'tvDes'");
    target.tvDes = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034185, "field 'ivArrow'");
    target.ivArrow = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034184, "field 'tvAuthor'");
    target.tvAuthor = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034183, "field 'rlToggle'");
    target.rlToggle = (android.widget.RelativeLayout) view;
  }

  public static void reset(com.itheima.googleplay.ui.holder.DetailDesHolder target) {
    target.tvDes = null;
    target.ivArrow = null;
    target.tvAuthor = null;
    target.rlToggle = null;
  }
}

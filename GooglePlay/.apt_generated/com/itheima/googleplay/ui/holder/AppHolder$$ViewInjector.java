// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.holder;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class AppHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.holder.AppHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034181, "field 'tvSize'");
    target.tvSize = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034176, "field 'tvName'");
    target.tvName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034223, "field 'tvDes'");
    target.tvDes = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034175, "field 'ivIcon'");
    target.ivIcon = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034177, "field 'rbStar'");
    target.rbStar = (android.widget.RatingBar) view;
  }

  public static void reset(com.itheima.googleplay.ui.holder.AppHolder target) {
    target.tvSize = null;
    target.tvName = null;
    target.tvDes = null;
    target.ivIcon = null;
    target.rbStar = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.holder;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class HomeHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.holder.HomeHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034176, "field 'tvName'");
    target.tvName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034175, "field 'ivIcon'");
    target.ivIcon = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034177, "field 'rbStar'");
    target.rbStar = (android.widget.RatingBar) view;
    view = finder.findRequiredView(source, 2131034181, "field 'tvSize'");
    target.tvSize = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034189, "field 'flProgress'");
    target.flProgress = (android.widget.FrameLayout) view;
    view = finder.findRequiredView(source, 2131034223, "field 'tvDes'");
    target.tvDes = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034222, "field 'tvDownload'");
    target.tvDownload = (android.widget.TextView) view;
  }

  public static void reset(com.itheima.googleplay.ui.holder.HomeHolder target) {
    target.tvName = null;
    target.ivIcon = null;
    target.rbStar = null;
    target.tvSize = null;
    target.flProgress = null;
    target.tvDes = null;
    target.tvDownload = null;
  }
}

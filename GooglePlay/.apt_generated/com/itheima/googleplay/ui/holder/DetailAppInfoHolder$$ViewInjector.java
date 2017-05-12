// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.holder;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DetailAppInfoHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.holder.DetailAppInfoHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034177, "field 'rbStar'");
    target.rbStar = (android.widget.RatingBar) view;
    view = finder.findRequiredView(source, 2131034179, "field 'tvVersion'");
    target.tvVersion = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034181, "field 'tvSize'");
    target.tvSize = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034176, "field 'tvName'");
    target.tvName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034175, "field 'ivIcon'");
    target.ivIcon = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034180, "field 'tvDate'");
    target.tvDate = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034178, "field 'tvDownloadNum'");
    target.tvDownloadNum = (android.widget.TextView) view;
  }

  public static void reset(com.itheima.googleplay.ui.holder.DetailAppInfoHolder target) {
    target.rbStar = null;
    target.tvVersion = null;
    target.tvSize = null;
    target.tvName = null;
    target.ivIcon = null;
    target.tvDate = null;
    target.tvDownloadNum = null;
  }
}

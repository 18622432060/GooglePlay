// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.holder;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DetailDownloadHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.holder.DetailDownloadHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034188, "field 'btnDownload' and method 'onClick'");
    target.btnDownload = (android.widget.Button) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131034189, "field 'flProgress' and method 'onClick'");
    target.flProgress = (android.widget.FrameLayout) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  public static void reset(com.itheima.googleplay.ui.holder.DetailDownloadHolder target) {
    target.btnDownload = null;
    target.flProgress = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.holder;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class CategoryHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.holder.CategoryHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034219, "field 'llGrid3' and method 'onClick'");
    target.llGrid3 = (android.widget.LinearLayout) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131034214, "field 'ivIcon1'");
    target.ivIcon1 = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034215, "field 'tvName1'");
    target.tvName1 = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034220, "field 'ivIcon3'");
    target.ivIcon3 = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034217, "field 'ivIcon2'");
    target.ivIcon2 = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034213, "field 'llGrid1' and method 'onClick'");
    target.llGrid1 = (android.widget.LinearLayout) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131034216, "field 'llGrid2' and method 'onClick'");
    target.llGrid2 = (android.widget.LinearLayout) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131034221, "field 'tvName3'");
    target.tvName3 = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034218, "field 'tvName2'");
    target.tvName2 = (android.widget.TextView) view;
  }

  public static void reset(com.itheima.googleplay.ui.holder.CategoryHolder target) {
    target.llGrid3 = null;
    target.ivIcon1 = null;
    target.tvName1 = null;
    target.ivIcon3 = null;
    target.ivIcon2 = null;
    target.llGrid1 = null;
    target.llGrid2 = null;
    target.tvName3 = null;
    target.tvName2 = null;
  }
}

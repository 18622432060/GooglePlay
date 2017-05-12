// Generated code from Butter Knife. Do not modify!
package com.itheima.googleplay.ui.holder;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DetailSafeHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.googleplay.ui.holder.DetailSafeHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034185, "field 'ivArrow'");
    target.ivArrow = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034200, "field 'llDesRoot'");
    target.llDesRoot = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131034195, "field 'rlDesRoot'");
    target.rlDesRoot = (android.widget.RelativeLayout) view;
    target.mSafeIcons = Finder.arrayOf(
        (android.widget.ImageView) finder.findRequiredView(source, 2131034196, "mSafeIcons"),
        (android.widget.ImageView) finder.findRequiredView(source, 2131034197, "mSafeIcons"),
        (android.widget.ImageView) finder.findRequiredView(source, 2131034198, "mSafeIcons"),
        (android.widget.ImageView) finder.findRequiredView(source, 2131034199, "mSafeIcons")
    );    target.mSafeDesBar = Finder.arrayOf(
        (android.widget.LinearLayout) finder.findRequiredView(source, 2131034201, "mSafeDesBar"),
        (android.widget.LinearLayout) finder.findRequiredView(source, 2131034204, "mSafeDesBar"),
        (android.widget.LinearLayout) finder.findRequiredView(source, 2131034207, "mSafeDesBar"),
        (android.widget.LinearLayout) finder.findRequiredView(source, 2131034210, "mSafeDesBar")
    );    target.mSafeDes = Finder.arrayOf(
        (android.widget.TextView) finder.findRequiredView(source, 2131034203, "mSafeDes"),
        (android.widget.TextView) finder.findRequiredView(source, 2131034206, "mSafeDes"),
        (android.widget.TextView) finder.findRequiredView(source, 2131034209, "mSafeDes"),
        (android.widget.TextView) finder.findRequiredView(source, 2131034212, "mSafeDes")
    );    target.mDesIcons = Finder.arrayOf(
        (android.widget.ImageView) finder.findRequiredView(source, 2131034202, "mDesIcons"),
        (android.widget.ImageView) finder.findRequiredView(source, 2131034205, "mDesIcons"),
        (android.widget.ImageView) finder.findRequiredView(source, 2131034208, "mDesIcons"),
        (android.widget.ImageView) finder.findRequiredView(source, 2131034211, "mDesIcons")
    );  }

  public static void reset(com.itheima.googleplay.ui.holder.DetailSafeHolder target) {
    target.ivArrow = null;
    target.llDesRoot = null;
    target.rlDesRoot = null;
    target.mSafeIcons = null;
    target.mSafeDesBar = null;
    target.mSafeDes = null;
    target.mDesIcons = null;
  }
}

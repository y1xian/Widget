package com.yyxnb.skinloader.skinDeployer;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

import com.yyxnb.skinloader.bean.SkinAttr;
import com.yyxnb.skinloader.bean.SkinConfig;
import com.yyxnb.skinloader.skinInterface.ISkinResDeployer;
import com.yyxnb.skinloader.skinInterface.ISkinResourceManager;

/**
 * 文字提示颜色属性的换肤支持（android:textColorHint）
 */
public class TextColorHintResDeployer implements ISkinResDeployer {
    @Override
    public void deploy(View view, SkinAttr skinAttr, ISkinResourceManager resource) {
        if (!(view instanceof TextView)) {
            return;
        }

        TextView tv = (TextView) view;
        if (SkinConfig.RES_TYPE_NAME_COLOR.equals(skinAttr.attrValueTypeName)) {
            ColorStateList textHintColor = resource.getColorStateList(skinAttr.attrValueRefId);
            tv.setHintTextColor(textHintColor);
        }
    }
}

package com.yyxnb.skinloader.skinDeployer;

import android.graphics.drawable.Drawable;
import android.view.View;

import com.yyxnb.skinloader.bean.SkinAttr;
import com.yyxnb.skinloader.bean.SkinConfig;
import com.yyxnb.skinloader.skinInterface.ISkinResDeployer;
import com.yyxnb.skinloader.skinInterface.ISkinResourceManager;

public class BackgroundResDeployer implements ISkinResDeployer {
    @Override
    public void deploy(View view, SkinAttr skinAttr, ISkinResourceManager resource) {
        if(SkinConfig.RES_TYPE_NAME_COLOR.equals(skinAttr.attrValueTypeName)){
            view.setBackgroundColor(resource.getColor(skinAttr.attrValueRefId));
        }else if(SkinConfig.RES_TYPE_NAME_DRAWABLE.equals(skinAttr.attrValueTypeName)){
            Drawable bg = resource.getDrawable(skinAttr.attrValueRefId);
            view.setBackground(bg);
        }
    }
}

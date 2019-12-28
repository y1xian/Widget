package com.yyxnb.view.rv

interface ItemDelegate<T> {

    /**
     * 布局文件
     */
    val layoutId: Int

    /**
     * 类型区分
     */
    fun isThisType(item: T, position: Int): Boolean

    /**
     * 数据处理
     */
    fun bind(holder: ViewHolder, t: T, position: Int)

}
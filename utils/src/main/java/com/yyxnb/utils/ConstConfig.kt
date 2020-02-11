package com.yyxnb.utils

import java.io.Serializable
import java.text.DecimalFormat

/**
 * 常量工具类
 */
object ConstConfig : Serializable {
    /******************** 存储相关常量  */
    /**
     * Byte与Byte的倍数
     */
    const val BYTE = 1
    /**
     * KB与Byte的倍数
     */
    const val KB = 1024
    /**
     * MB与Byte的倍数
     */
    const val MB = 1048576
    /**
     * GB与Byte的倍数
     */
    const val GB = 1073741824
    /**
     * 毫秒与毫秒的倍数
     */
    const val MSEC = 1
    /******************** 时间相关常量  */
    /**
     * 秒与毫秒的倍数
     */
    const val SEC = 1000
    /**
     * 分与毫秒的倍数
     */
    const val MIN = 60000
    /**
     * 时与毫秒的倍数
     */
    const val HOUR = 3600000
    /**
     * 天与毫秒的倍数
     */
    const val DAY = 86400000
    /**
     * 正则：手机号（简单）
     */
    const val REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$"
    /**
     * 正则：手机号（精确）
     * 移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188
     * 联通：130、131、132、145、155、156、175、176、185、186
     * 电信：133、153、173、177、180、181、189
     * 全球星：1349
     * 虚拟运营商：170
     */
    const val REGEX_MOBILE_EXACT = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$"

    /******************** 正则相关常量  */ //--------------------------------------------正则表达式-----------------------------------------
    /**
     * 原文链接：http://caibaojian.com/regexp-example.html
     * 提取信息中的网络链接:(h|H)(r|R)(e|E)(f|F) *= *('|")?(\w|\\|\/|\.)+('|"| *|>)?
     * 提取信息中的邮件地址:\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*
     * 提取信息中的图片链接:(s|S)(r|R)(c|C) *= *('|")?(\w|\\|\/|\.)+('|"| *|>)?
     * 提取信息中的IP地址:(\d+)\.(\d+)\.(\d+)\.(\d+)
     * 提取信息中的中国电话号码（包括移动和固定电话）:(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}
     * 提取信息中的中国邮政编码:[1-9]{1}(\d+){5}
     * 提取信息中的中国身份证号码:\d{18}|\d{15}
     * 提取信息中的整数：\d+
     * 提取信息中的浮点数（即小数）：(-?\d*)\.?\d+
     * 提取信息中的任何数字 ：(-?\d*)(\.\d+)?
     * 提取信息中的中文字符串：[\u4e00-\u9fa5]*
     * 提取信息中的双字节字符串 (汉字)：[^\x00-\xff]*
     */
    /**
     * 正则：电话号码
     */
    const val REGEX_TEL = "^0\\d{2,3}[- ]?\\d{7,8}"
    /**
     * 正则：身份证号码15位
     */
    const val REGEX_IDCARD15 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$"
    /**
     * 正则：身份证号码18位
     */
    const val REGEX_IDCARD18 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$"
    /**
     * 正则：身份证号码15或18位 包含以x结尾
     */
    const val REGEX_IDCARD = "(^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$|^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|x|X)$)"
    /**
     * 正则：邮箱
     */
    const val REGEX_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"
    /**
     * 正则：URL
     */
    const val REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?"
    /**
     * 正则：汉字
     */
    const val REGEX_CHZ = "^[\\u4e00-\\u9fa5]+$"
    /**
     * 正则：用户名，取值范围为a-z,A-Z,0-9,"_",汉字，不能以"_"结尾,用户名必须是6-20位
     */
    const val REGEX_USERNAME = "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$"
    /**
     * 正则：yyyy-MM-dd格式的日期校验，已考虑平闰年
     */
    const val REGEX_DATE = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$"
    /**
     * 速度格式化
     */
    @JvmField
    val FORMAT_ONE = DecimalFormat("#.#")
    /**
     * 距离格式化
     */
    @JvmField
    val FORMAT_TWO = DecimalFormat("#.##")
    /**
     * 速度格式化
     */
    @JvmField
    val FORMAT_THREE = DecimalFormat("#.###")
    /**
     * 正则：IP地址
     */
    const val REGEX_IP = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"
    //Date格式
    const val DATE_FORMAT_LINK = "yyyyMMddHHmmssSSS"
    //Date格式 常用
    const val DATE_FORMAT_DETACH = "yyyy-MM-dd HH:mm:ss"
    //Date格式 带毫秒
    const val DATE_FORMAT_DETACH_SSS = "yyyy-MM-dd HH:mm:ss SSS"
    //时间格式 分钟：秒钟 一般用于视频时间显示
    const val DATE_FORMAT_MM_SS = "mm:ss"

    enum class MemoryUnit {
        BYTE, KB, MB, GB
    }

    enum class TimeUnit {
        MSEC, SEC, MIN, HOUR, DAY
    }
}
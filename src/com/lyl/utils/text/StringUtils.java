package com.lyl.utils.text;

/**
 * 字符串工具类<br><br/>
 * 字符转相关功能<br/>
 * 字符串非空判断<br/>
 *
 * @author liyaling
 * @email ts_liyaling@qq.com
 * @date 2019/10/8 12:57
 */

public class StringUtils {

    private StringUtils() {
    }

    /**
     * 判断字符串是否为空<br><br/>
     * s=null 返回true<br/>
     * s="abc" 返回false<br/>
     * s="\n" 返回true<br/>
     * s="" 返回true<br/>
     * s=" " 返回true<br/>
     * s="  " 返回true<br/>
     *
     * @param s 要判断的字符串
     * @return true：字符串是空<br/>
     * false：字符串不是空
     */
    public static boolean isEmpty(String s) {
        return s == null || s.trim().length() == 0;
    }

    /**
     * 判断字符串是否不为空<br><br/>
     * s=null 返回false<br/>
     * s="abc" 返回true<br/>
     * s="\n" 返回false<br/>
     * s="" 返回false<br/>
     * s=" " 返回false<br/>
     * s="  " 返回false<br/>
     *
     * @param s 要判断的字符串
     * @return true：字符串不是空<br/>
     * false：字符串是空
     */
    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }

    /**
     * 判断对象是否为空<br><br/>
     * s=null 返回true<br/>
     * s="abc" 返回false<br/>
     * s="\n" 返回true<br/>
     * s="" 返回true<br/>
     * s=" " 返回true<br/>
     * s="  " 返回true<br/>
     *
     * @param o 要判断的对象
     * @return true：对象是空<br/>
     * false：对象不是空
     */
    public static boolean isEmpty(Object o) {
        if (o == null)
            return true;
        String s = o.toString();
        return s == null || s.trim().length() == 0;
    }

    /**
     * 判断对象是否不为空<br><br/>
     * s=null 返回false<br/>
     * s="abc" 返回true<br/>
     * s="\n" 返回false<br/>
     * s="" 返回false<br/>
     * s=" " 返回false<br/>
     * s="  " 返回false<br/>
     *
     * @param o 要判断的对象
     * @return true：对象不是空<br/>
     * false：对象是空
     */
    public static boolean isNotEmpty(Object o) {
        return !isEmpty(o);
    }


    /**
     * 判断字符串是否为空<br><br/>
     * s=null 返回true<br/>
     * s="abc" 返回false<br/>
     * s="\n" 返回false<br/>
     * s="" 返回true<br/>
     * s=" " 返回false<br/>
     * s="  " 返回false<br/>
     *
     * @param s 要判断的字符串
     * @return true：字符串是空<br/>
     * false：字符串不是空
     */
    public static boolean isBlank(String s) {
        return s == null || s.length() == 0;
    }

    /**
     * 判断字符串是否不为空<br><br/>
     * s=null 返回false<br/>
     * s="abc" 返回true<br/>
     * s="\n" 返回true<br/>
     * s="" 返回false<br/>
     * s=" " 返回true<br/>
     * s="  " 返回true<br/>
     *
     * @param s 要判断的字符串
     * @return true：字符串不是空<br/>
     * false：字符串是空
     */
    public static boolean isNotBlank(String s) {
        return !isBlank(s);
    }

    /**
     * 判断对象是否为空<br><br/>
     * s=null 返回true<br/>
     * s="abc" 返回false<br/>
     * s="\n" 返回false<br/>
     * s="" 返回true<br/>
     * s=" " 返回false<br/>
     * s="  " 返回false<br/>
     *
     * @param o 要判断的对象
     * @return true：对象是空<br/>
     * false：对象不是空
     */
    public static boolean isBlank(Object o) {
        if (o == null)
            return true;
        String s = o.toString();
        return s == null || s.length() == 0;
    }

    /**
     * 判断对象是否不为空<br><br/>
     * s=null 返回false<br/>
     * s="abc" 返回true<br/>
     * s="\n" 返回true<br/>
     * s="" 返回false<br/>
     * s=" " 返回true<br/>
     * s="  " 返回true<br/>
     *
     * @param s 要判断的对象
     * @return true：对象不是空<br/>
     * false：对象是空
     */
    public static boolean isNotBlank(Object s) {
        return !isBlank(s);
    }
}

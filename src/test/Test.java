package test;

import com.lyl.utils.format.FormatUtils;

import java.util.Arrays;

/**
 * @author liyaling
 * @email ts_liyaling@qq.com
 * @date 2019/9/27 13:09
 */

public class Test {

    public static void main(String[] args) {
        fileFormatTest();
    }
    public static void fileFormatTest(){
        System.out.println(Arrays.toString(FormatUtils.fileFormat("C:\\Program Files (x86)\\Adobe\\Adobe Creative Cloud Experience\\Resources\\panels\\com.adobe.ccx.fnft-2.5.1\\Contents\\images\\indicators\\dots.gif")));
    }
}

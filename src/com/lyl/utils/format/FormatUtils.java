package com.lyl.utils.format;

import java.io.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 用于识别文件格式的工具类
 *
 * @author liyaling
 * @email ts_liyaling@qq.com
 * @date 2019/9/27 12:51
 */

public final class FormatUtils {

    private FormatUtils() {
    }

    /**
     * 判断文件格式
     *
     * @param filePath 被判断的文件绝对路径
     * @return 结果集
     */
    public static String[] fileFormat(String filePath) {
        return fileFormat(filePath, null);
    }

    /**
     * 判断文件格式，可以选择判断类型
     *
     * @param filePath 被判断的文件绝对路径
     * @param filter   选择判断的类型，null代表所有类型都判断
     *                 可选值： {@link FileFormat#WINDOWSFORMAT}<BR><BR/>
     *                 可选值： {@link FileFormat#AUDIOFORMAT}<BR><BR/>
     *                 可选值： {@link FileFormat#VIDEOFORMAT}<BR><BR/>
     *                 可选值： {@link FileFormat#PICTUREFORMAT}<BR><BR/>
     * @return 结果集
     */
    public static String[] fileFormat(String filePath, Integer... filter) {
        Set<String> set = new HashSet<>();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
            if (filter == null) {
                set.addAll(inputStreamHandler(bufferedInputStream, FileFormat.windowsFormatMap));
                set.addAll(inputStreamHandler(bufferedInputStream, FileFormat.audioFormatMap));
                set.addAll(inputStreamHandler(bufferedInputStream, FileFormat.videoFormatMap));
                set.addAll(inputStreamHandler(bufferedInputStream, FileFormat.pictureFormatMap));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] s = new String[set.size()];
        int i = 0;
        for (String s1 : set) {
            s[i++] = s1;
        }
        return s;
    }

    private static Set<String> inputStreamHandler(InputStream inputStream, Map<String, String> map) {
        return inputStreamHandler(inputStream, map, true);
    }

    private static Set<String> inputStreamHandler(InputStream inputStream, Map<String, String> map, boolean isHeader) {
        Set<String> set = new HashSet<>();
        if (isHeader) {
            try {
                byte[] bytes = new byte[1024];
                inputStream.mark(inputStream.available());
                int length = inputStream.read(bytes);
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < length; i++)
                    stringBuilder.append(String.format("%02x", bytes[i]).toUpperCase());
                for (String s : map.keySet()) {
                    String regex = "^" + s.replaceAll("X", ".") + ".+";
                    if (stringBuilder.toString().matches(regex))
                        set.add(map.get(s));
                }
                inputStream.reset();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return set;
    }
}

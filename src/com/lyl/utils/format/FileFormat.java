package com.lyl.utils.format;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author liyaling
 * @email ts_liyaling@qq.com
 * @date 2019/9/27 12:56
 */

public class FileFormat {

    public static final int WINDOWSFORMAT = 0x555;
    public static final int AUDIOFORMAT = 0x556;
    public static final int VIDEOFORMAT = 0x557;
    public static final int PICTUREFORMAT = 0x558;


    static final Map<String, String> windowsFormatMap = new LinkedHashMap<>();

    static final Map<String, String> audioFormatMap = new LinkedHashMap<>();

    static final Map<String, String> videoFormatMap = new LinkedHashMap<>();

    static final Map<String, String> pictureFormatMap = new LinkedHashMap<>();

    static {
        windowsFormatMap.put("4D444D5093A7", "dmp");
        windowsFormatMap.put("3F5F0300", "hlp");
        windowsFormatMap.put("4C4E0200", "hlp");
        windowsFormatMap.put("3F5F03", "hlp");
        windowsFormatMap.put("4D5A90", "dll,exe,ocx,olb,imm,ime");
        windowsFormatMap.put("4D5A", "com,dll,drv,exe,pif,qts,qtx,sys,fon,acm,386,scr,lrc,vxd,cpl,x32");
    }

    static {
        audioFormatMap.put("FFF1XXXXXXXXFCDE02004C6176633538", "aac");
        audioFormatMap.put("00000020667479704D34412000000000", "m4a,m4r");
        audioFormatMap.put("4D414320960F003400000018000000", "ape");
        audioFormatMap.put("4F67675300020000000000000000", "ogg,oga,ogv.ogx");
        audioFormatMap.put("664C614300000022", "flac");
        audioFormatMap.put("4D4D4D440000", "mmf");
        audioFormatMap.put("2321414D52", "amr");
        audioFormatMap.put("57415645666D74", "wav");
        audioFormatMap.put("57415645", "wav");
        audioFormatMap.put("7776706B", "wv");
        audioFormatMap.put("4D546864", "mid,midi");
        audioFormatMap.put("2E7261FD", "ra");
        audioFormatMap.put("574946", "wav");
        audioFormatMap.put("3026B2", "wma");
        audioFormatMap.put("2E524D", "rm");
        audioFormatMap.put("494433", "mp3");
        audioFormatMap.put("FFFB50", "mp3");
        audioFormatMap.put("FFFD", "mp2");
        audioFormatMap.put("0B77", "ac3");
    }

    static {
        videoFormatMap.put("52494646XXXXXXXX415649204C495354", "avi");
        videoFormatMap.put("3026B2758E66CF11A6D900AA0062CE6C", "wmv");
        videoFormatMap.put("667479704D534E56", "mp4");
        videoFormatMap.put("6674797069736F6D", "mp4");
        videoFormatMap.put("66747970336770", "3gp,3gp,3g2");
        videoFormatMap.put("1A45DFA3", "mkv");
        videoFormatMap.put("464C5601", "flv");
        videoFormatMap.put("6D6F6F76", "mov");
        videoFormatMap.put("000001BX", "mpg,vob");
        videoFormatMap.put("5A5753", "swf");
    }

    static {
        pictureFormatMap.put("52494646XXXX00005745425056503820","webp");
        pictureFormatMap.put("89504E470D0A1A0A","png");
        pictureFormatMap.put("474946383761","gif");
        pictureFormatMap.put("474946383961","gif");
        pictureFormatMap.put("0000100000","tga");
        pictureFormatMap.put("0000200000","tga");
        pictureFormatMap.put("00000100","ico");
        pictureFormatMap.put("4D4D002B","tif,tiff");
        pictureFormatMap.put("4D4D002A","tif,tiff");
        pictureFormatMap.put("49492A00","tif,tiff");
        pictureFormatMap.put("492049","tif,tiff");
        pictureFormatMap.put("000002","tga");
        pictureFormatMap.put("FFD8","jpg,jpeg,jpe");
        pictureFormatMap.put("424D","bmp,dib");
        pictureFormatMap.put("0CED","tif");
    }

    private FileFormat() {
    }

    /**
     * 添加新的window文件格式
     *
     * @param fileHeader 文件头规则，任意用X代替
     * @param format     要添加的文件格式
     */
    public static void addWindowsFormat(String fileHeader, String format) {
        windowsFormatMap.put(fileHeader.toUpperCase(), format);
    }

    /**
     * 添加新的音频文件格式
     *
     * @param fileHeader 文件头规则，任意用X代替
     * @param format     要添加的文件格式
     */
    public static void addAudioFormat(String fileHeader, String format) {
        audioFormatMap.put(fileHeader.toUpperCase(), format);
    }

    /**
     * 添加新的视频文件格式
     *
     * @param fileHeader 文件头规则，任意用X代替
     * @param format     要添加的文件格式
     */
    public static void addVideoFormat(String fileHeader, String format) {
        videoFormatMap.put(fileHeader.toUpperCase(), format);
    }

    /**
     * 添加新的图片文件格式
     *
     * @param fileHeader 文件头规则，任意用X代替
     * @param format     要添加的文件格式
     */
    public static void addPictureFormat(String fileHeader, String format) {
        pictureFormatMap.put(fileHeader.toUpperCase(), format);
    }

}

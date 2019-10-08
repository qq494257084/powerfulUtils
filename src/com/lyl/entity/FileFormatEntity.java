package com.lyl.entity;

import com.lyl.utils.format.FileFormat;

/**
 * @author liyaling
 * @email ts_liyaling@qq.com
 * @date 2019/10/8 11:27
 */

public class FileFormatEntity {

    private String format;

    private String hex;

    private String detail;

    private int type;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type == FileFormat.WINDOWSFORMAT || type == FileFormat.AUDIOFORMAT || type == FileFormat.VIDEOFORMAT || type == FileFormat.PICTUREFORMAT || type == FileFormat.ALLFORMAT)
            this.type = type;
        else type = -1;
    }
}

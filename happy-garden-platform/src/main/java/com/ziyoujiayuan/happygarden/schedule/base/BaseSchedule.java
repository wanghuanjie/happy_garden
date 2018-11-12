package com.ziyoujiayuan.happygarden.schedule.base;

import com.hbxhx.runtime.base.exception.InternalException;

/**
 * @author wanghjbuf
 * @date 2018/11/12
 */
public abstract class BaseSchedule {

    public BaseSchedule() {

    }

    public byte tinyIntToByte(int i) {
        if(i <= 127 && i >= -128) {
            return (byte)i;
        } else {
            throw new InternalException("num out of range");
        }
    }

}

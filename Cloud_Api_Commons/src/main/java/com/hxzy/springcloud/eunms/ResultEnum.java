package com.hxzy.springcloud.eunms;

import lombok.Getter;

/**
 * @author Yang.hu
 * @date 2020/6/5 下午8:55
 */
@Getter
public enum ResultEnum {

    SUCCESSFUL_OPERATION(200,"操作成功！"),
    FAILED_OPERATION(444,"操作失败！"),
    ;
    Integer code;
    String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}

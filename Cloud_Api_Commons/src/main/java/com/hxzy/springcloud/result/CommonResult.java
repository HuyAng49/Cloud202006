package com.hxzy.springcloud.result;

import com.hxzy.springcloud.eunms.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yang.hu
 * @date 2020/6/5 下午8:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(ResultEnum resultEnum,String serverPort, T data){
        this(resultEnum.getCode(),resultEnum.getMessage()+"serverPort: "+serverPort,data);
    }

    public CommonResult(ResultEnum resultEnum, T data){
        this(resultEnum.getCode(),resultEnum.getMessage(),data);
    }
}

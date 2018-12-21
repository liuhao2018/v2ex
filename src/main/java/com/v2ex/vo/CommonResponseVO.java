package com.v2ex.vo;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 15:48
 * @Description:
 */
public class CommonResponseVO<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResponseVO() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResponseVO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

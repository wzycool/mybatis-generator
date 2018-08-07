package com.qikenet.build;

/**
 * @Author: zhengyi.wang
 * @Date: 2018/8/6/006 15:20
 */
public class Response {
    private String resultCode;
    private String message;
    private Object data;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

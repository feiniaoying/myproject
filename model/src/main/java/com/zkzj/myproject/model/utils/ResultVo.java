package com.zkzj.myproject.model.utils;
/**
 * @description: 响应结果类
 * @author: chenwt
 * @create: 2018-03-25 23:59
 **/
public class ResultVo<T> {
    private boolean success = false;
    private String message = null;
    private T result = null;

    public void isSuccess(boolean b) {
        this.success=b;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setResult(T result) {
        this.result = result;
    }
    public boolean getSuccess(){
        return success;
    }
    public String getMessage() {
        return message;
    }
    public T getResult() {
        return result;
    }

}

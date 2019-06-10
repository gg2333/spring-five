package me.master.springfive.resp;

import org.springframework.data.domain.Page;

public class PageResp<T> {

    private int code;
    private String message;
    private Page<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Page<T> getData() {
        return data;
    }

    public void setData(Page<T> data) {
        this.data = data;
    }

    public PageResp() {
    }

    public PageResp(int code, String message) {
        this(code, message, null);
    }

    public PageResp(int code, String message, Page<T> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> PageResp<T> success() {

        return new PageResp<>(0, "ok");
    }

    public static <T> PageResp<T> success(Page<T> data) {
        return new PageResp<>(0, "ok", data);
    }

    public static <T> PageResp<T> error() {
        return new PageResp<>(-1, "error");
    }


}

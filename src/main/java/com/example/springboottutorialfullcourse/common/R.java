package com.example.springboottutorialfullcourse.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Universal return result  通用返回结果类，服务端返回的数据都会封装成此对象
 * @param <T>
 */
@Data
public class R<T> {
    private Integer code;//1->success 0orOther->failed
    private String msg;//error message
    private T data;
    private Map<String,Object> map = new HashMap<>();

    public static <T> R<T> success(T object) {
        R<T> r = new R<>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R<T> r = new R<>();
        r.code = 0;
        r.msg = msg;
        return r;
    }

    public R<T> add(String key, Object value){
        this.map.put(key, value);
        return this;
    }
}

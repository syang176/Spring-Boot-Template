package com.syang176.common.entity;

/**
 * @author Syang176
 **/
public class R {
    private final Long code;
    private final String msg;
    private final Object data;

    public R(long code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public R(long code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 创建一个表示成功响应的对象，状态码为200，消息为"success"。
     *
     * @return R对象，包含默认的成功状态码和消息。
     */
    public static R ok() {
        return new R(200, "success");
    }

    /**
     * 创建一个表示成功响应的对象，状态码为200，消息为"success"，并包含指定的数据。
     *
     * @param data 要包含在响应中的数据。
     * @return R对象，包含成功状态码、消息和提供的数据。
     */
    public static R ok(Object data) {
        return new R(200, "success", data);
    }

    /**
     * 创建一个表示失败响应的对象，状态码为500，消息为"fail"。
     *
     * @return R对象，包含默认的失败状态码和消息。
     */
    public static R fail() {
        return new R(500, "fail");
    }

    /**
     * 创建一个表示失败响应的对象，状态码为500，消息为指定的错误信息。
     *
     * @param msg 错误信息，描述失败的原因。
     * @return R对象，包含失败状态码和提供的错误信息。
     */
    public static R fail(String msg) {
        return new R(500, msg);
    }

    /**
     * 创建一个表示失败响应的对象，状态码为500，消息为指定的错误信息，并包含指定的数据。
     *
     * @param msg  错误信息，描述失败的原因。
     * @param data 要包含在响应中的数据。
     * @return R对象，包含失败状态码、错误信息和提供的数据。
     */
    public static R fail(String msg, Object data) {
        return new R(500, msg, data);
    }

    /**
     * 创建一个表示失败响应的对象，状态码和消息由参数指定。
     *
     * @param code 响应的状态码。
     * @param msg  错误信息，描述失败的原因。
     * @return R对象，包含指定的状态码和错误信息。
     */
    public static R fail(long code, String msg) {
        return new R(code, msg);
    }

    public Long getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}

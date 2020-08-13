package com.yingpu;

import java.util.List;
import java.util.Map;

public class SmsResult {
    private String requestId;  // 请求id
    private String code; // 1000成功
    private String message;   //响应消息

    private List<Map<String, String>> data;

    public SmsResult() {}

    public SmsResult(String requestId, String code, String message, List<Map<String, String>> data) {
        this.requestId = requestId;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Map<String, String>> getData() {
        return data;
    }

    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }
}

package com.example.demo.response;

import com.example.demo.constant.ErrorCode;
import lombok.Data;

import java.io.Serializable;

@Data
public class MessageResp implements Serializable {
    private static final long serialVersionUID = -5335530073638425347L;

    private String respCode;
    private String respDesc;
    private Object data;

    public MessageResp(Object data) {
        this.respCode = ErrorCode.SUCCESS.code;
        this.respDesc = ErrorCode.SUCCESS.desc;
        this.data = data;
    }
}

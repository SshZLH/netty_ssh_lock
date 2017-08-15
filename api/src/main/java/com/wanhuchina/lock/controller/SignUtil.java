package com.wanhuchina.lock.controller;

import com.google.common.base.Strings;
import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2017/5/7.
 */
public class SignUtil {
    private static final String signKey = "18BC0362B6F7A0EA28C0F363F91522ED";

    /**
     * @param content
     * @param key
     * @param combineString
     * @return
     * @throws Exception
     */
    public static boolean getSign(String content, String key, String combineString) throws CommonException {
        if(Strings.isNullOrEmpty(key)){
            key = signKey;
        }
        String signData = content + key;

        try {
            String sign = DigestUtils.md5Hex(signData.getBytes("UTF-8"));
            if(combineString.equals(sign)){
                return true;
            }
            return false;
        } catch (UnsupportedEncodingException e) {
            throw new CommonException(CommonCode.SOCKET_ONLINE_ERROR.getCode(),"接口秘钥比对错误");
        }
    }
}

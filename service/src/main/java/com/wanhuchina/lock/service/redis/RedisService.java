package com.wanhuchina.lock.service.redis;

import java.util.concurrent.TimeUnit;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author shenguanhao
 * redis重新封装
 * @Date 2016/7/29
 */
public interface RedisService {

    /**
     * 设置key和value值，都是str形式
     *
     * @param key
     * @param value
     * @return
     */
    void set(String key, String value);

    /**
     * 设置key和value值，都是str形式
     *
     * @param key
     * @param value
     * @param timeOut
     * @param timeUnit
     * @return
     */
    void set(String key, String value, long timeOut, TimeUnit timeUnit);

    /**
     * 根据key获取value
     *
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 根据key获取value
     *
     * @param key
     * @return
     */
    Long getLong(String key);

    /**
     * 保存某个key的value+1
     *
     * @param key
     */
    Long increment(String key);

    /**
     * 保存某个key的value+1，如果key不存在设置这个key并设置超时时间
     *
     * @param key
     * @param timeOut
     * @param timeUnit
     */
    Long increment(String key, long timeOut, TimeUnit timeUnit);

    /**
     * 保存某个key的value+1
     * @param key
     * @param incrementBy 步长
     */
    Long increment(String key, long incrementBy);

    /**
     * 删除
     * @param key
     */
    public void delete(String key);


    public void setObject(final String key, Object value);

    public <T> T getObject(final String key, Class<T> elementType);
}

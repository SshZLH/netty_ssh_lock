package com.wanhuchina.lock.service.impl.redis;

import com.google.common.base.Strings;
import com.wanhuchina.common.util.serialize.SerializeUtil;
import com.wanhuchina.lock.service.redis.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

//import com.kaiyuan.platform.transaction.service.RedisService;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author shenguanhao
 * redis实现类
 * @Date 2017/04/19
 */
@Service("redisService")
public class RedisServiceImpl implements RedisService {

    private static final Logger LOG = LoggerFactory.getLogger(RedisServiceImpl.class);

    public static final DateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy年MM月dd日");

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public void set(String key, String value, long timeOut, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value, timeOut, timeUnit);
    }

    @Override
    public String get(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }

    @Override
    public Long getLong(String key) {
        redisTemplate.setValueSerializer(new GenericToStringSerializer<Long>(Long.class));
        Long value = (Long) redisTemplate.opsForValue().get(key);
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        return value;
    }

    @Override
    public Long increment(String key) {
        return redisTemplate.opsForValue().increment(key, 1);
    }

    @Override
    public Long increment(String key, long timeOut, TimeUnit timeUnit) {
        String sValue = (String) redisTemplate.opsForValue().get(key);
        if (Strings.isNullOrEmpty(sValue)) {
            redisTemplate.opsForValue().set(key, "0", timeOut, timeUnit);
        }
        return redisTemplate.opsForValue().increment(key, 1);
    }

    @Override
    public Long increment(String key, long incrementBy) {
        redisTemplate.setValueSerializer(new GenericToStringSerializer<Long>(Long.class));
        Long value = redisTemplate.opsForValue().increment(key, incrementBy);
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        return value;
    }

    @Override
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    @Override
    public void setObject(final String key, Object value) {

        final byte[] vbytes = SerializeUtil.serialize(value);
        redisTemplate.execute(new RedisCallback<Object>() {
            @Override
            public Object doInRedis(RedisConnection connection)
                    throws DataAccessException {
                connection.set(redisTemplate.getStringSerializer().serialize(key), vbytes);
                return null;
            }
        });
    }

    @Override
    public <T> T getObject(final String key, Class<T> elementType) {
        return (T) redisTemplate.execute(new RedisCallback<T>() {
            @Override
            public T doInRedis(RedisConnection connection)
                    throws DataAccessException {
                byte[] keyBytes = redisTemplate.getStringSerializer().serialize(key);
                if (connection.exists(keyBytes)) {
                    byte[] valueBytes = connection.get(keyBytes);
                    @SuppressWarnings("unchecked")
                    T value = (T) SerializeUtil.unserialize(valueBytes);
                    return value;
                }
                return null;
            }
        });
    }
}

package com.sampleservice.amazonservice.utils;

import com.septemberhx.common.base.MResponse;
import org.joda.time.DateTime;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/12/3
 */
public class MBaseUtils {

    public static String generateStringInKBSize(int kbSize, MResponse response, int prevInterval) {
        DateTime before = DateTime.now();
        // 1 kb is 1024 characters
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1024 * kbSize; ++i) {
            stringBuffer.append('+');
        }
        String str = stringBuffer.toString();
        long interval = DateTime.now().getMillis() - before.getMillis() + prevInterval;
        response.set("data", str);
        response.set("interval", interval);

        return str;
    }
}

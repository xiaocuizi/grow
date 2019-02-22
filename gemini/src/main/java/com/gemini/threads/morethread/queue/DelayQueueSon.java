package com.gemini.threads.morethread.queue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.queue
 * @classname: DelayQueueSon
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/1/2 17:15
 */
public class DelayQueueSon implements Delayed {
    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}

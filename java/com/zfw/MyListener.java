package com.zfw;

import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;

/**
 * @author phil
 * @date 2022/1/9 10:53
 */
public class MyListener implements LifecycleListener {

    @Override
    public void lifecycleEvent(LifecycleEvent event) {
        Object data = event.getData();
        System.out.println(data);
    }
}

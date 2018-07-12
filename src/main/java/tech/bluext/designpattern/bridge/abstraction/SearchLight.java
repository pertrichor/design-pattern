package tech.bluext.designpattern.bridge.abstraction;

import tech.bluext.designpattern.bridge.implementor.Light;

/**
 * Description: 探照灯
 *
 * @author blue
 * @create 2018-07-12 16:51
 */
public abstract class SearchLight {

    // 持有Light接口引用
    protected Light light;

    // 创建SearchLight实例时传递Light实例作为入参
    public SearchLight(Light light) {
        this.light = light;
    }

    /**
     * 打开探照灯
     */
    public void switchOn() {
        light.shine();
    }
}

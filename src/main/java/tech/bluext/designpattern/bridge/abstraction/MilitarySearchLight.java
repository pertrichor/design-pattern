package tech.bluext.designpattern.bridge.abstraction;

import tech.bluext.designpattern.bridge.implementor.Light;

/**
 * Description: 军用探照灯
 *
 * @author blue
 * @create 2018-07-12 16:59
 */
public class MilitarySearchLight extends SearchLight {

    public MilitarySearchLight(Light light) {
        super(light);
    }

    /**
     * 打开探照灯 , 重写父类方法
     * 军用探照灯使用特制电路 , 确保防水性能
     */
    @Override
    public void switchOn() {
        System.out.println("设置使用军用特制防水电路..");
        light.shine();
    }

    // 其他特性
}

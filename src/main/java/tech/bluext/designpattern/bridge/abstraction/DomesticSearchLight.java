package tech.bluext.designpattern.bridge.abstraction;

import tech.bluext.designpattern.bridge.implementor.Light;

/**
 * Description: 民用探照灯
 *
 * @author blue
 * @create 2018-07-12 17:10
 */
public class DomesticSearchLight extends SearchLight {

    public DomesticSearchLight(Light light) {
        super(light);
    }

    /**
     * 打开探照灯 , 重写父类方法
     * 民用探照灯使用节能电路 , 确保经济省电
     */
    @Override
    public void switchOn() {
        System.out.println("设置使用民用节能电路工作..");
        light.shine();
    }

    // 其他特性
}

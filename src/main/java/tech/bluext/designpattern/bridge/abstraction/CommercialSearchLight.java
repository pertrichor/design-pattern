package tech.bluext.designpattern.bridge.abstraction;

import tech.bluext.designpattern.bridge.implementor.Light;

/**
 * Description: 商用探照灯
 *
 * @author blue
 * @create 2018-07-12 17:07
 */
public class CommercialSearchLight extends SearchLight {

    public CommercialSearchLight(Light light) {
        super(light);
    }

    /**
     * 打开探照灯 , 重写父类方法
     * 商用探照灯使用高压电路 , 确保高功率工作
     */
    @Override
    public void switchOn() {
        System.out.println("设置使用商用高压电路工作..");
        light.shine();
    }

    // 其他特性
}

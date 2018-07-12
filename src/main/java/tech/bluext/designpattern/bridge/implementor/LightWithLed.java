package tech.bluext.designpattern.bridge.implementor;

/**
 * Description: 使用led的发光元件
 *
 * @author blue
 * @create 2018-07-12 16:58
 */
public class LightWithLed implements Light {

    /**
     * 发光
     */
    public void shine() {
        System.out.println("发出led清冷的灯光");
    }
}

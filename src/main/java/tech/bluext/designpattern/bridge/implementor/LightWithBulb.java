package tech.bluext.designpattern.bridge.implementor;

/**
 * Description: 使用白炽灯泡的发光元件
 *
 * @author blue
 * @create 2018-07-12 16:56
 */
public class LightWithBulb implements Light {

    /**
     * 发光
     */
    public void shine() {
        System.out.println("发出白炽灯温暖的灯光");
    }
}

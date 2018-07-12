package tech.bluext.designpattern.bridge;

import tech.bluext.designpattern.bridge.abstraction.DomesticSearchLight;
import tech.bluext.designpattern.bridge.abstraction.MilitarySearchLight;
import tech.bluext.designpattern.bridge.abstraction.SearchLight;
import tech.bluext.designpattern.bridge.implementor.LightWithBulb;
import tech.bluext.designpattern.bridge.implementor.LightWithLed;

/**
 * Description: 人类使用者
 *
 * @author blue
 * @create 2018-07-12 17:13
 */
public class HumanClient {

    public static void main(String[] args) {
        // 某人使用军用led探照灯
        SearchLight searchLight1 = new MilitarySearchLight(new LightWithLed());
        searchLight1.switchOn();

        // 某人使用民用白炽探照灯
        SearchLight searchLight2 = new DomesticSearchLight(new LightWithBulb());
        searchLight2.switchOn();

        // 此处关键在于 , 人类持有的都是SearchLight的引用 , 而不用关心抽象部分和实现部分使用了哪个子类.
    }

}

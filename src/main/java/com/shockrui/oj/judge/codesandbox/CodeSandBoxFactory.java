package com.shockrui.oj.judge.codesandbox;

import com.shockrui.oj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.shockrui.oj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.shockrui.oj.judge.codesandbox.impl.ThirdPartyCodeSandbox;


/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 */
public class CodeSandBoxFactory {

    /**
     * 创建代码沙箱实例工厂类
     *
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandbox getCodeSandBox(String type) {
        switch (type) {
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }

}

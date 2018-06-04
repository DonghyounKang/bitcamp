package step12_spring;

import java.util.Map;

import bitcamp.mylib.MessageInitializer;

public class MessageInitializerB implements MessageInitializer{

    @Override
    public void onStartup(Map<String, String> msgMap) {
        System.out.println("===> MessageInitializerB.onStartup()");
        msgMap.put("password", "1111");
    }
}

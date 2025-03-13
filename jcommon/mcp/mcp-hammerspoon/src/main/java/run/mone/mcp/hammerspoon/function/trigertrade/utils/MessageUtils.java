package run.mone.mcp.hammerspoon.function.trigertrade.utils;

import reactor.core.publisher.FluxSink;

/**
 * @author goodjava@qq.com
 * @date 2025/3/13 08:56
 */
public class MessageUtils {

    public static void sendMessage(FluxSink<String> sink, String message) {
        sink.next("\n" + message + "\n");
    }

}

package com.gemini.socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.socket
 * @classname: WebSocketDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/9 14:58
 */
public class WebSocketDemo {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();
              new InputStreamReader(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

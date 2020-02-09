package cn.wmxyyy.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author wmxyyy
 * @date 2019/12/15 21:21
 * @state TCP通信的客户端:向服务器返送连接请求;给服务器发送数据;读取服务器回写的数据
 * java.net.Socket:此类实现客户端套接字(套接字是两台机器间通信的端点)
 *
 * 构造方法:
 *  Socket(String host, int port)；创建一个流套接字并连接扫i指定的主机和其端口号
 *  参数:
 *    - String host:服务器的主机名称/IP地址
 *    - int port:服务器的端口号
 * 成员方法:
 *    - OutputStream getOutputSteam(); 返回此套接字的输出流
 *    - InputStream getInputStream(); 返回此套接字的输入流
 *    void close(); 关闭此套接字
 *
 * 步骤:
 * 1.创建客户端Socket,构造方法绑定服务器的IP地址和端口
 * 2.使用Socket对象的getOutputStream()获取网络的字节输出流对象
 * 3.使用字节输出流对象的write();给服务器返送数据
 *
 * 4.使用Socket对象的getInputStream()获取网络的字节输入流对象
 * 5.使用字节输入流对象的read();读取服务器回写的数据
 * 6.释放资源(Socket)
 *
 * 注意:
 *  - 客户端和服务端通信必须使用Socket提供的网络流,不能自己创建的流对象
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8899);
        //获取网络字节输出流对象，给服务器发送数据
        OutputStream os = client.getOutputStream();
        os.write("我是客户端".getBytes());

        //获取网络字节输入流对象，读取服务器回写数据
        InputStream is = client.getInputStream();
        byte[] bytes = new byte[1024];
        int len ;
        while ((len=is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        //释放资源(socket)
        client.close();
    }
}

package cn.wmxyyy.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wmxyyy
 * @date 2019/12/15 21:35
 * @state TCP通信的服务器端:接收客户端的请求;读取客户端发送的数据;给客户端回写数据
 * java.net.ServerSocket:此类实现服务器套接字
 *
 * 构造方法:
 *   - ServerSocket(int port) 创建绑定到特定端口的服务器套接字
 *
 * 成员方法:
 *   - Socket accept(); 侦听并接收此套接字的连接
 *
 * 步骤:
 * 1.创建服务端ServerSocket对象和系统要指定的端口
 * 2.使用ServerSocket对象的accept()；获取到请求的客户端对象Socket
 * 3.使用Socket对象的getInputStream()获取网络的字节输入流对象
 * 4.使用字节输入流对象的read();读取客户端发送的数据
 * 5.使用Socket对象的getOutputStream()获取网络的字节输出流对象
 * 6.使用字节输入流对象的write();给客户端回写数据
 * 7.释放资源(Socket、ServerSocket)
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8899);
        //获取到请求的客户端对象Socket
        Socket socket = server.accept();
        //获取网络字节输入流对象,读取客户端发送的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len ;
        while ((len=is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        //获取网络字节输出流，向客户端回写数据
        OutputStream os = socket.getOutputStream();
        os.write("服务器方收到啦".getBytes());

        //释放资源(socket、serverSocket)
        socket.close();
        server.close();
    }
}

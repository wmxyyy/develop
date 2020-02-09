package cn.wmxyyy.fileUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wmxyyy
 * @date 2019/12/16 16:04
 * @state
 */
public class FileUploadServerDemo01 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8899);
        Socket socket = server.accept();

        //存储的位置
        FileOutputStream fos = new FileOutputStream("serverfile\\server.txt");

        //获取网络输入流对象，读取上传文件再存储
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=is.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        //给客户端回写数据
        socket.getOutputStream().write("上传成功".getBytes());

        //释放资源
        fos.close();
        socket.close();
        server.close();
    }
}

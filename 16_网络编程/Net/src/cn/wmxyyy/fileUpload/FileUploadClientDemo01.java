package cn.wmxyyy.fileUpload;

import java.io.*;
import java.net.Socket;

/**
 * @author wmxyyy
 * @date 2019/12/16 15:53
 * @state 文件上传案例的客户端:读取本地文件，上传到服务器，读取服务器回写的数据
 *
 */
public class FileUploadClientDemo01 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8899);
        //获取网络字节输出流对象，向服务器写数据
        OutputStream os = client.getOutputStream();

        //读取本地文件
        FileInputStream fis = new FileInputStream("file\\abc.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=fis.read(bytes))!= -1){
            //文件上传
            os.write(bytes,0,len);
        }

        //void shutdownOutput() 禁用此套接字的输出流。
        client.shutdownOutput();

        //读取服务器的回写数据
        InputStream is = client.getInputStream();
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        //释放资源
        fis.close();
        client.close();
    }
}

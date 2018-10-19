

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;    
public class mian {

        /*BASE64Encoder和BASE64Decoder这两个方法是sun公司的内部方法，并没有在java api中公开过，所以使用这些方法是不安全的，
         * 将来随时可能会从中去除，所以相应的应该使用替代的对象及方法，建议使用apache公司的API*/
        static BASE64Encoder encoder = new sun.misc.BASE64Encoder();    
        static BASE64Decoder decoder = new sun.misc.BASE64Decoder();    
            
        public static void main(String[] args) {    
             //将PDF格式文件转成base64编码 
            // String base64String = getPDFBinary(new File("/home/amarsoft/AFm.pdf"));
            // System.out.println(base64String);
            //将base64的编码转成PDF格式文件
            base64StringToPDF("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");
        }  
        /**
         *  将PDF转换成base64编码
         *  1.使用BufferedInputStream和FileInputStream从File指定的文件中读取内容；
         *  2.然后建立写入到ByteArrayOutputStream底层输出流对象的缓冲输出流BufferedOutputStream
         *  3.底层输出流转换成字节数组，然后由BASE64Encoder的对象对流进行编码
         * */
        static String getPDFBinary(File file) {
            FileInputStream fin =null;
            BufferedInputStream bin =null;
            ByteArrayOutputStream baos = null;
            BufferedOutputStream bout =null;
            try {
                //建立读取文件的文件输出流
                fin = new FileInputStream(file);
                //在文件输出流上安装节点流（更大效率读取）
                bin = new BufferedInputStream(fin);
                // 创建一个新的 byte 数组输出流，它具有指定大小的缓冲区容量
                baos = new ByteArrayOutputStream();
                //创建一个新的缓冲输出流，以将数据写入指定的底层输出流
                bout = new BufferedOutputStream(baos);
                byte[] buffer = new byte[1024];
                int len = bin.read(buffer);
                while(len != -1){
                    bout.write(buffer, 0, len);
                    len = bin.read(buffer);
                }
                //刷新此输出流并强制写出所有缓冲的输出字节，必须这行代码，否则有可能有问题
                bout.flush();
                 byte[] bytes = baos.toByteArray();
                 //sun公司的API
                 return encoder.encodeBuffer(bytes).trim();  
                 //apache公司的API
                 //return Base64.encodeBase64String(bytes);
                
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    fin.close();
                    bin.close();
                    //关闭 ByteArrayOutputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException
                    //baos.close();
                    bout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
            
        /**
         * 将base64编码转换成PDF
         * @param base64sString
         * 1.使用BASE64Decoder对编码的字符串解码成字节数组
         *  2.使用底层输入流ByteArrayInputStream对象从字节数组中获取数据；
         *  3.建立从底层输入流中读取数据的BufferedInputStream缓冲输出流对象；
         *  4.使用BufferedOutputStream和FileOutputSteam输出数据到指定的文件中
         */
        static void base64StringToPDF(String base64sString){
            BufferedInputStream bin = null;
            FileOutputStream fout = null;
            BufferedOutputStream bout = null;
            try {
                 //将base64编码的字符串解码成字节数组
                byte[] bytes = decoder.decodeBuffer(base64sString);
                //apache公司的API
                //byte[] bytes = Base64.decodeBase64(base64sString);
                //创建一个将bytes作为其缓冲区的ByteArrayInputStream对象
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                //创建从底层输入流中读取数据的缓冲输入流对象
                bin = new BufferedInputStream(bais);
                //指定输出的文件
                File file = new File("d:\\test.jpg");
                //创建到指定文件的输出流
                fout  = new FileOutputStream(file);
                //为文件输出流对接缓冲输出流对象
                bout = new BufferedOutputStream(fout);
                
                byte[] buffers = new byte[1024];
                int len = bin.read(buffers);
                while(len != -1){
                    bout.write(buffers, 0, len);
                    len = bin.read(buffers);
                }
                //刷新此输出流并强制写出所有缓冲的输出字节，必须这行代码，否则有可能有问题
                bout.flush();
                
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    bin.close();
                    fout.close();
                    bout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    } 

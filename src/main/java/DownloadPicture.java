import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;  
  
public class DownloadPicture {  
  
    public static void main(String[] args) {  
        DownloadPicture downloadPicture = new DownloadPicture();  
        ArrayList<String> urlList = downloadPicture.readUrlList();  
        downloadPicture.downloadPicture(urlList);  
    }  
  
    /** 
     * 传入要下载的图片的url列表，将url所对应的图片下载到本地 
     * @param urlList 
     */  
    private void downloadPicture(ArrayList<String> urlList) {  
        URL url = null;  
        int imageNumber = 0;  
          
        for (String urlString : urlList) {  
            try {  
                url = new URL(urlString);  
                DataInputStream dataInputStream = new DataInputStream(url.openStream());  
                String imageName = imageNumber + ".jpg";  
                FileOutputStream fileOutputStream = new FileOutputStream(new File("d:\\"+imageName));  
  
                byte[] buffer = new byte[1024];  
                int length;  
  
                while ((length = dataInputStream.read(buffer)) > 0) {  
                    fileOutputStream.write(buffer, 0, length);  
                }  
  
                dataInputStream.close();  
                fileOutputStream.close();  
                imageNumber++;  
            } catch (MalformedURLException e) {  
                e.printStackTrace();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
  
    /** 
     * 连接mysql数据库，通过查询数据库读取要下载的图片的url列表 
     * @return 
     */  
    private ArrayList<String> readUrlList() {  
        ArrayList<String> urlList = new ArrayList<String>();  
        urlList.add("http://a.kcway.net/assess/upload/2017/11/27/b1d49f4a6500fa319ee540c0534d37f2.jpg")  ;
        return urlList;  
    }  
  
}  
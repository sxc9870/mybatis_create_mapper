

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;

public class Base {

    public static String getJson(String str) {

        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(str)));

            String data = null;
            while ((data = br.readLine()) != null) {
                sb.append(data);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
        
        
        
        
        
        
        
        
        return sb.toString();
    }

    /**
     * 以post方式访问
     * 
     * @param url
     *            接口url地址
     * @param xmlBody
     *            xml格式的字符串
     * @return
     */
    public static String post(String url, String xmlBody) {
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "stdout");
        java.util.logging.Logger.getLogger("org.apache.http.wire").setLevel(java.util.logging.Level.FINEST);
        java.util.logging.Logger.getLogger("org.apache.http.headers").setLevel(java.util.logging.Level.FINEST);
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
        System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", "ERROR");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", "ERROR");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http.headers", "ERROR");
        // xmlBody="{\"ver\":\"1.0\",\"curTime\":\"20171117165216\",\"data\":{\"personalList\":[{\"bank\":[{\"bankBranchName\":\"中国人民银行\",\"accountNo\":\"6217856400008090632\",\"bankName\":\"中国工商银行\",\"remark\":\"\"}],\"attachment\":[{\"fileName\":\"行驶证\",\"fileUrl\":\"upload/2017/05/31/1496214939.jpg\",\"remark\":\"\",\"fileType\":\"2\",\"fileString\":\"\"},{\"fileName\":\"身份证正面\",\"fileUrl\":\"upload/2017/05/31/1496214950.jpg\",\"remark\":\"\",\"fileType\":\"6\",\"fileString\":\"\"},{\"fileName\":\"身份证反面\",\"fileUrl\":\"upload/2017/05/31/1496214960.jpg\",\"remark\":\"\",\"fileType\":\"6\",\"fileString\":\"\"},{\"fileName\":\"征信报告\",\"fileUrl\":\"upload/2017/05/31/1496214998.jpg\",\"remark\":\"\",\"fileType\":\"9\",\"fileString\":\"\"},{\"fileName\":\"新增行驶证背面\",\"fileUrl\":\"upload/2017/05/31/1496215043.jpg\",\"remark\":\"\",\"fileType\":\"2\",\"fileString\":\"\"}],\"base\":{\"zipCode\":\"\",\"cityCode\":\"\",\"remark\":\"\",\"educationLevel\":\"\",\"arrivalTime\":\"\",\"assetsStatisticsDate\":\"20170531151425\",\"driverLicense\":\"\",\"formerName\":\"\",\"email\":\"\",\"householdDegisterType\":\"\",\"borrowerId\":\"4413026199010101111\",\"supportCount\":\"\",\"sex\":\"\",\"certificateValidityDate\":\"\",\"telephone\":\"\",\"managerId\":\"\",\"birthDate\":\"\",\"certificateNo\":\"413026199010101111\",\"currentAddress\":\"\",\"mobilePhone\":\"15565500000\",\"instantMessaging\":\"\",\"name\":\"张小北\",\"shippingAddress\":\"\",\"familyCount\":\"\",\"riskAssessment\":\"\",\"categoryId\":4,\"maritalStatus\":\"\",\"certificateType\":\"1\"}}]},\"sign\":\"45391100FE84FC867979CBAF2BF07E85\",\"signType\":\"MD5\",\"appKey\":\"KCD\",\"nonce\":30}";
        HttpClient httpClient = new DefaultHttpClient();
        try {
            HttpPost httpPost = new HttpPost(url);
       //     System.out.println(xmlBody);
            StringEntity input = new StringEntity(xmlBody, "UTF-8");
            input.setContentType("application/json");
            httpPost.setEntity(input);

            HttpResponse httpResponse = httpClient.execute(httpPost);
            int statusCode = httpResponse.getStatusLine().getStatusCode();

            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity httpEntity = httpResponse.getEntity();
                String result = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
                EntityUtils.consume(httpEntity);
                JSONObject j = JSONObject.parseObject(result);
                    System.out.println(result);
                return result;
            } else {
                HttpEntity httpEntity = httpResponse.getEntity();
                String result = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
                EntityUtils.consume(httpEntity);
                JSONObject j = JSONObject.parseObject(result);
                    System.out.println(result);
                return result;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                httpClient.getConnectionManager().shutdown();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return "";
    }

    public static String privatekey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJTjUZ/CBrE3hvkeMvkFxtM9uQFOOGpqWjjnJdJRrPWMjb1aDWS8btISwEm80Zs8msPk7/Qb2dh11qpSjvaNwXKIK0zJwi9Z0V6zrZNz+6V7NgPpbKjmWxU+QaY2D9CK3BWlysoVqb8YSISt25p72nB8HzOHJ+sIDeKJI9UIY/vLAgMBAAECgYEAim5IyCdYnZEpN5qyfgK2+FVdHC+kGJ1Fwb541fIGxE+owbNm3JCu4Td5/ZVHtfRFWXoU+HyksbPuoXIdZnQqtWuInNhdPVpiir6/yXSvP5LLfQN6lqkCzapgtuhuz3Cayp58qb0k4ujZ2l5pegNN7a8plqHUSZNoE3VFHMNNTZECQQDYyRm7U+gliPlnO8bpnnU6ciFbiAeXbWS4z+HY2hLHWqFO7U2grBKueJ1yMYDNL8PCGbbyO0bUxDIu07t5KYg1AkEAr9IEzgIYwbCBujRgJ3rj7r5bXsggzTiHLypj+Uvsq0niI2TvHmiYczP0m9lSHmuvZwhcdhd0bufA81Zigi/z/wJBAIcVAGC3Dw/cgzQtjmviXj/WAC0t3TUhaEK03pEmic8JDTzGJ7n3nwhyhgEzEYRJwByBs3rLLv7DZlXBf68nDwUCQHe4mND2mIj7ebqjg34eriqZsHn/6GYVweeaA+1zh7qzWqsjRbf9HSIFFOEywDo6tXuBNAStv/jtEnQgNH/Vy10CQBzWF7XlU9oXiLwoVoe+7JAe7cnfAfG+2nwiuzc0x9oHB1p7rET3u0AMIR6LfC0K2FWheQRYcqsAWyQviIjWa8I=";

}

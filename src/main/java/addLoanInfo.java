
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.alibaba.fastjson.JSONObject;

public class addLoanInfo extends Base {

    public static void main(String[] args) throws Exception {

        String c = getJson("d:\\abs.txt");//原生的

   
        String xml="{\"a\":\"b\",}";
        JSONObject o=JSONObject.parseObject(xml);
        System.out.println(o);
      
        
////        //
//        JSONObject o=new JSONObject();
//        
//        o.put("abc", "def");
//        
//        Map<String, String> failRet = new HashMap<>();
//        failRet.put("o", o.toString());
//        System.out.println(failRet);
//        
//      
//        Unirest.post("http://localhost:8080/services/rest/loan/queryApprovalResult") 
//     
//      .header("Content-Type","application/json")
//     //  .header("ckey",cKey)
//      .body(c)
//     .asJson();
//        JSONObject params = JSON.parseObject(d, Feature.OrderedField);
//        String e=params.toJSONString();
//      
//        String sign = params.getString("sign");
//        String nonce = params.getString("nonce");
//        String curTime = params.getString("curTime");
//        String signParam = privatekey + nonce + curTime
//                +params.getJSONObject("data");
//        System.out.println(sign);
//        System.out.println(getMd5(signParam));
// post("http://abs.51duoying.com/ws/services/rest/loan/addLoanInfo",c);
     // post("http://localhost:8080/services/rest/loan/doDisbursement",c);
    }

    /**
     * Ascii转换为字符串
     * 
     * @param value
     * @return
     */
    public static String asciiToString(String value) {
        StringBuffer sbu = new StringBuffer();
        String[] chars = value.split(",");
        for (int i = 0; i < chars.length; i++) {
            sbu.append((char) Integer.parseInt(chars[i]));
        }
        return sbu.toString();
    }

    private static void show(String c, String d) {
        char ss[] = c.trim().toCharArray();

        char dd[] = d.toCharArray();
        for (int i = 0; i < dd.length; i++) {
            if (dd[i] != ss[i]) {
                // System.out.println(ss[i]);
            }

        }

    }

    // 静态方法，便于作为工具类
    public static String getMd5(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            // 32位加密
            return buf.toString();
            // 16位的加密
            // return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }
}

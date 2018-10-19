import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Test {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
       
        System.out.println( createMac());
    }

    public static String createMac() {
        return MD5Util.getMD5String("测试三方|310101198802101032|111111|wCTlpYJTtSnwTr8UVtGssPnH6kurbhLi");
    }

private static class MD5Util {

    private static char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
            'f' };

    public static String getMD5String(String s) {
        try {
            return getMD5String(s.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getMD5String(byte[] bytes) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        md.update(bytes);
        return bufferToHex(md.digest());
    }

    public static String bufferToHex(byte bytes[]) {
        return bufferToHex(bytes, 0, bytes.length);
    }

    private static String bufferToHex(byte bytes[], int m, int n) {
        StringBuffer stringbuffer = new StringBuffer(2 * n);
        int k = m + n;
        for (int l = m; l < k; l++) {
            appendHexPair(bytes[l], stringbuffer);
        }
        return stringbuffer.toString();
    }

    private static void appendHexPair(byte bt, StringBuffer stringbuffer) {
        char c0 = hexDigits[(bt & 0xf0) >> 4];
        char c1 = hexDigits[bt & 0xf];
        stringbuffer.append(c0);
        stringbuffer.append(c1);
    }

    // HMAC-MD5
    public static byte[] HMAC_MD5(byte[] key, byte[] data) {
        Mac mac = null;
        try {
            mac = Mac.getInstance("HmacMD5");
        } catch (NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        }
        SecretKeySpec sk = new SecretKeySpec(key, "HmacMD5");
        if (null == mac) {
            return null;
        }
        try {
            mac.init(sk);
            return mac.doFinal(data);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return null;
        }
    }
}

}

package api;

import java.util.Properties;

/**
 * Created by jiacheo on 15/5/18.
 */
public class ApiConfig {

    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("yunpian.api.config.properties"));
        } catch (Exception e) {
            //ignore
        }
    }


    public static final String getUserId() {
        return properties.getProperty("sms.userId");
    }

    public static final String getPassword() {
        return properties.getProperty("sms.password");
    }

    public static final String getUrl() {
        return properties.getProperty("sms.url");
    }

    public static final String getReport() {
        return properties.getProperty("sms.send.report");
    }

    public static final String getEncoding() {
        return properties.getProperty("sms.encoding");
    }




    /*public static final String getEncode() {
        return properties.getProperty("api.encoding");
    }

    public static final String getApiKey() {
        return properties.getProperty("APIKEY");
    }

    public static final String getUserInfoApi() {
        return properties.getProperty("userinfo.api");
    }

    public static final String getSendSmsApi() {
        return properties.getProperty("send.sms.api");
    }

    public static final String getTplSendSmsApi() {
        return properties.getProperty("send.tpl.api");
    }

    public static final String getVoiceSendApi() {
        return properties.getProperty("send.voice.api");
    }

    public static final String getEncoding() {
        return properties.getProperty("api.encoding");
    }*/

    public static void main(String[] args) {
        System.out.println(properties);
    }

}

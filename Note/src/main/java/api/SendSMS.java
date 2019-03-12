package api;

import exception.ApiException;
import result.SendSmsResult;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Author: CuiCan
 * Date: 2017-9-18
 * Time: 18:51
 * Description:
 */
public class SendSMS {

    public static void main(String[] args) {
        String text = "测试短信";
        try {
            File file = new File("E:\\Workspace\\IDEA\\sms-master\\java\\yunpian-sms-java\\src\\main\\resources\\tel.txt");

            InputStreamReader read = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = "";
//            StringBuffer sb = new StringBuffer();
            String str = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                str += lineTxt + ",";
            }
            String mobiles = str.substring(0, str.length() - 1);
            System.out.println("mobiles = " + mobiles);
            SendSmsResult result = YunpianSmsApi.sendSms(text, mobiles);
        } catch (ApiException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

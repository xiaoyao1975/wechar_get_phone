package weChare_util;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.IOException;

public class get_wechare_sessionKey {

    public get_wechare_sessionKey() {

    }

    public String getdata(String url) {
        String data = null;
        org.apache.commons.httpclient.HttpClient client = new org.apache.commons.httpclient.HttpClient();
        GetMethod getMethod = new GetMethod(url);
        getMethod.setRequestHeader("User_Agent", "Mozilla/5.0(Windows NT 6.1;Win64;x64;rv:39.0) Gecko/20100101 Firefox/39.0");
        getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
        //系统默认的恢复策略
        try {
            int statusCode = client.executeMethod(getMethod);
            if (statusCode != HttpStatus.SC_OK) {
                System.out.println("Method failed:" + getMethod.getStatusLine());
            }
            byte[] responseBody = getMethod.getResponseBody();
            data = new String(responseBody);
            //System.out.println(data);
        } catch (HttpException e) {
            System.out.println("Please check your provided http address!");
            data = "";
            e.printStackTrace();

        } catch (IOException e) {
            data = "";
            e.printStackTrace();
        } finally {

            getMethod.releaseConnection();

        }
        return data;
    }

}

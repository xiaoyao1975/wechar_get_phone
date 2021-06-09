
<%@page import="weChare_util.AESForWeixinGetPhoneNumber"%>
<%@page language="java" import="weChare_util.WeixinPhoneDecryptInfo" pageEncoding="UTF-8"%>

<%
    /* 得到手机号码 */

    String encryptedData = "932RjlXlAKX7Ex3uLQW/2f9Omdgf2lpIquIxn2uJLg+uK7Sq14FJNwFtB8Z4T3qRYyX0iyRiQUz/nJ1pgAVo7x7X04hE63EFtflR4tKnd3PWOO6nF39L+kH7hPEAYL/GXHI7qt7dKSdYt3biYkMjN9mm3Z5/H6GeR5Q0QPmXptA2qFnmUNPe0b9U7JDUmzB4W9lI0fngVqXW+OmMqU4N+Q==";
    String iv = "+Gy+cxsW13fKHx1ax4QJHA==";
    String sessionKey = "QJIdX6Selm2hKc+C+COOYQ==";
    String appId = "wx5693c9954980a68e";
    
    encryptedData = request.getParameter("encryptedData");
    iv = request.getParameter("iv");
    sessionKey = request.getParameter("sessionKey"); 
    
    
    AESForWeixinGetPhoneNumber aes = new AESForWeixinGetPhoneNumber(encryptedData, sessionKey, iv);
    WeixinPhoneDecryptInfo info = aes.decrypt();
    if (null == info) {
        out.println("{\"phoneNumber\":\"error\"}");
    } else {
        if (!info.getWeixinWaterMark().getAppid().equals(appId)) {
            out.println("{\"phoneNumber\":\"wrong_appId\"}");
        }
        out.println(info.toString());
    }

%>

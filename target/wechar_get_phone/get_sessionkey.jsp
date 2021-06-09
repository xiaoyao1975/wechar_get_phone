
<%@page import="weChare_util.*"%> 
<%@page language="java" import="java.util.*"  pageEncoding="UTF-8"%>

<%
    /* 计算出sessionkey用于获得手机号码于get_phone_number.jsp提供key数据 */
    String code = request.getParameter("code"); //wx.login返回code
    get_wechare_sessionKey almanacUtil = new get_wechare_sessionKey();
    String appid="wx5693c9954980a68e"; //小程序id
    String secret="92ec0bea985172215b8c08f492edbaef"; //小程序秘钥
    /*
    * js_code 为 小程序 wx.login 返回的code 例如返回{errMsg: "login:ok", code: "0113TwFa1w2F3B0nl0Ga1lLuEi13TwFu"}
    */
    String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret +"&js_code=";
    url += code + "&grant_type=authorization_code";
    String dat = almanacUtil.getdata(url);
    out.print(dat);
%>

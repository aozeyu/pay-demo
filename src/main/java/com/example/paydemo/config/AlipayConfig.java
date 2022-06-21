package com.example.paydemo.config;

import org.springframework.context.annotation.Configuration;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: pay-demo
 * @description: 44
 * @packagename: com.example.paydemo.config
 * @author: 姚泽宇
 * @date: 2022-06-21 16:35
 **/
@Configuration
public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2021000120608581";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCXH7P+N7DTN0BPQBpygg6aO7ygOt9DPyOct8rZQ0oMAa4BlLcVSkyHw3Kiz+6JwWsLzOBe+QmVN/aMUu1LK8mI9eT+npqFqhtj8xKtLR0Nwde4WpUo5mtGyYYblXctta+bP1vGbNPOwpp4b6wXunZT1MjaiAQxre4NYIdoKHlLShuWlhyzHdjA0r7nJCJH+9J/5nx6ptEeUWu91gFWuisrxJSv8ljCRyBXihAqhG/Nfs218prgzzHRzu/2ZX8MX2vcz1zpb3wWX1Vn34KDENGt/pCxJgz0sEYe8sePopcHaITLLn1Iuy07OdepnTI3qznP+zxP6UEsg8CkYQXradWjAgMBAAECggEAdPDSXmCH0xmJCQpIrN0ZIZ4iGzcTNr0v+IB8Vlzsepf+JzkF51KkH9ZM6dHO+wgRpoL2CGfbU32HqhQtjSKoA/SLK8BdQBtesJwSkrE7Lz8Vh5GIpKqQzqj4vnWNUHCsH40KnmPuDqulzpZTa9Uc5Ufd2MSxwiOd9voALchL+8Z3wLJNpJ0GUAccrv54oADcIZ01fKIi7ncXDfzL5keBCln/BuanO1/RKGwX4ap9QEUlOT5AeiMgU/4d0nKofxRCOjA+Z1zV1Vt2YSSIXDj+NOObr2kpvzhHi365uY8tDxeKiM/3fE5wl6TW0fzjEV7qXtgSTQbiW7GPUvv9xChJUQKBgQD19+Grh30o38sqUf7UCt5++t9txyyzXHtCjGYmOyw76usR+YKVZtKdQIvvAQ9orM1xHULYDU5hLeI/lXxEPA4E5Te3c6VtwHKZdmpYMYXPUA95hR3qJUFze88OUfL4Oxm4b5MQKFTj7R/Q9lABsviytdoZ6lLUXv7hwG3SC5xICwKBgQCdSZCS/2IthhuP2Na9f+hOZ1LFqDd/8W3cemBfy1l6ooIkhvyh4jtZx9vWOvyttA1vXOz+sEpMlB89oRgZ0PH2gAr6+wPqVQzJC3cqtV2gG5/IhhlniX4Viiz9mtPTm+tnnOFnyM09usSi+5cwJ1G7vSsB7rssMLpjvxPlFDnvyQKBgDwwVTupIvpukQOhHu96XWnLMANn+stFNTBatOBkGHXtDWrPmKHAkIdEdTmeE8w0hO1KEMJXtzdWiAexJ8B2xaNzB8hPd0q9Dg35iRpdu/W4DKFa7rAOP87nnApQCVmu9KNKQj1w8Rz5OJDkxT01M2Bf2af/zBcFy+8oLHd6udpzAoGANtFh0umxFP6tcnf3d7oxg8nc/kh/d1b0nCgGmLxtpiEnTIXDXMRVPRg71TFfyUZ8fDid3LIiYwgozzjrBmxdODUuHoUHu08DErqtQLRPOjMGgEPEbOJtkCJFReoFM7Ye2FDD+oDwjzgdulQHQGAjy1PFvnmuwFsHSyZYT7m564kCgYEAl6TCNd60fL7xHteExjb8u6gWk+6J/r9/vPakNvWuSZOSJfdpIN4iQwYSLIqRiIMbXfCMkeXRvSPbWTtfVzE4oggY0H56oqjSfL/wnBAh0ojcYkQ2r+BSl0cHG/01jPMl8ceGq07ukwdf3NqRfFCNmHVT42n6POQ+YWzJhqMmJ6c=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvCl+GGqCIRVfvDS/db2nJG8mkZCVICJB12xwQfDOWzs84UXo0qcFB79Xgm7qBGLtds+6sYcZLbY6sNWBsoIR+zEjboPgaX+9TiDlh69HYxIAFt5s0YNdFlFTs5iiM54xVWCgPzZcdxKZtIP1wLyJuFxQmyBMg2vuR8Gm6sJWuwhF3cDnYA/8APi5LKTSK08hgln+Zawsu0VWYlOne0gNBEf4/iVAVm282LvaQev8N3KbLznhtLAoIaeFPjeCQSxpucoHirJmmynHPsj6GOf0nkrl9CXhihPxeAZWnJaBRzVDpoQBu/YC+H7FM8A1pcHgjAaWMqSd4z+InnMg23DxBQIDAQAB";

    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package com.qingao.app190806.springmvc190806;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.annotation.Configuration;

@Configuration
public class App_Cfg_Alipay {
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016081900289943";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCpxnWHOwfK/iP+7Y/gLGG9zNho5JbxQxS3USr5I0IL88Fslhp7bAYLqIgic/bOYI8kEOOyqDQ8kkyzL+clNheaiTzwEfnCmaYN4et0qmpqpc5Mkjop7auzGheMWyUEswNT+yOe78mfHDrCVyRATnbaxdeLO5gTi0KMTfSchWpnjyTMO/b/kNEDRHsXrAzQ7/wni1HM3rbq/9QbyY0Jy2o5JP3Qpx0HEQzTIY6NuxEE6nos4oPogGiIb4qsMhOAlmd49N0Z158qjYPQP62UdWbxVH+TKWsy9R4PnIFfhC9e0JTP9LUHpUYtjQ3Zkon33bnEToTfPEYZ+GxdyjYp6xqPAgMBAAECggEAHZN2PAW7mNBnQuztyJbSvDboaHWSGhuei0T3oIlU4zImuxz3JhMuhm9or9/V2iQWK6lJkYEeAINYG0s4EFJ5EDHiTMxE33LW68o0s5FQkp2p78r1mQJPjBb6jTf/ne71oHa6wOBzFmXbkqmNpipFKF2Y7CeImbcD899Mwsu3Oqz7QO88qEngZeqAq7Q6UuthkEnhEdzjGg2Iw2rIDNvBG4s0OLKWqcfqKRIrZ4VwCrVemwm2A6VDf3j9H5o6HhUbV23vB4VeQGxa4C4W9VYJfguCi87O2xMEywCXZtYrCdfL1RNagGLeIlTAAJejghj18c8LD5aRnW8LfWzw9WuyKQKBgQDkmz5yaBF0bl7N68zI0zBlmrUiV6/P85hT0MqDeByTk0LvZJ4FEVvWqOI7NMwLIFRvkb8SZAPumq4EDacJg4HDoMwQXQ0tG0JJLaQ4p/tTHyIzeiXMSaPC6P3mEUl3aa6GJ1M1eSefBRFuf1GQnKWB2GBRX0B9H1FPNaJ1086ClQKBgQC+HoDEZR/H20MIC8PdSrtt1oH655tziSM6ZwjqUeUOrPYsvV3u2cdUl8wbaOE4bi9cX1o4jk0YCYEdTx0yTDSPePgFJI3dT+zHJXHK0MjxIZ4dYlQUuREj8hjS4cIK2qITZI0l3yMTdJDTrfGBd9IJiMFQWAMc3MVdJAUTw1zjkwKBgQCSj3TZpB6MprXhDuubVMoSWb0G53CvwVxHX/R1lOu9MQwYrkkgtqBKXrureY3XFEMNxELbZ4Od1Uz7DEWqs8TdxpkNZJqt8GvuvnQqXoeiIrOqjQTuk8eJjhY5CZwwEnDxUQTno2TjbjxeuwFv1P3G4RHfGVIe5ZUbUyd0ovYigQKBgFciudfJlVBPQSCt674/4zmLSBWME2ZXo0rAMIjcsgQQ599Hh4bST5aI4CZr4lWvwosutLYZGmJ68K9TNEl6PdjIE7yfrVmSqS35DndrS72gr8w95dV9oMp9yjzU9c9ttzz2J+8Enxnqofoyze6N0TlHcXp2bC7NTLPMr3sIXkl7AoGAStLDd/UjR4QhPI5aXGLc7vhW/E8FuHnHOdzcz8kuO9Hvp40ngxMFlsDVxSZKAihurZm/Oi21B/LBBxtrszZIa2LhIzOwufj6BqSIXn8ktH4h6Tb0TNb7jZsFPL9qT3IBfOsfNBfoDTmT7T7Ehs8CmNEHw7vxJm78CNXWJ6NKbcc=";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
	// 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1pk7l9YAXVkbKUQF1yi5thNa3p1OAUVgLqGRjvkgJyM5MkPRWqBTp+oap2yPqasJtIU95qde6U7v+PctRmr3WZKaAhRN3LQe3LmjfdcQ9YX66wA5IumuTYw173FZjExESti2dR/Bh2vRoqS8bHyy5a15Uk6EGWgN07VRnmsz1UXxl7bfQNpupDTrUzYRPOH1ca8VE50h/Ogm9NrdcTnuYNSaUa56qUf+Fg2XN7SSli5VpGuhU1qdYJxtPjtR2Fb/qjTivCg5cfWBtzKXavZ00w/V1zoLIHUUOf+vCojTJH3dGCkLVfQf7MpzJxEb0mKedCzA+9W94fci3jFE7XJHaQIDAQAB";
	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://192.168.1.42:8088/springmvc190806/ali/pieddone";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";

	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord
	 *            要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
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
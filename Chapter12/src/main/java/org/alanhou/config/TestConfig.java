package org.alanhou.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestConfig {
    public static String loginUrl;
    public static String updateUserInfoUrl;
    public static String getUserListUrl;
    public static String getUserInfoUrl;
    public static String addUserUrl;

    // DefaultHttpClient deprecated 替换
    public static DefaultHttpClient defaultHttpClient;
//    public static HttpClient defaultHttpClient;
//    public static HttpClientBuilder httpClientBuilder;
    public static CookieStore store;
}

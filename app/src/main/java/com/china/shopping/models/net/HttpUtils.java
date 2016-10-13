package com.china.shopping.models.net;

import com.china.shopping.ChinaApplication;

import org.senydevpkg.net.HttpLoader;
import org.senydevpkg.net.HttpParams;

/**
 * Created by kunwe on 2016/10/13.
 * 这个一个请求网络的工具类
 */

public class HttpUtils {

    /**
     *httpParams.addHeader(map); 这个是添加头文件
     *
     * @param httpParams   HttpParams httpParams = new HttpParams(); //示例代码
     *                     httpParams.put("page","1");
     *                     httpParams.put("pageNum", "10");
     *
     * @param url          请求网络的Url
     * @param clazz        这个是Javabean类 json的实例
     * @param resquestCode 这个是标记码
     * @param listener     这个是网络返回数据的监听
     */
    public void get(HttpParams httpParams, String url, Class clazz, int resquestCode, HttpLoader.HttpListener listener) {
        HttpLoader.getInstance(ChinaApplication.context).get(
                url,
                httpParams,
                clazz,
                resquestCode,
                listener
        );
    }

    /**
     * @param httpParams   HttpParams httpParams = new HttpParams(); //示例代码
     *                     httpParams.put("page","1");
     *                     httpParams.put("pageNum", "10");
     *
     * @param url          请求网络的Url
     * @param clazz        这个是Javabean类 json的实例
     * @param resquestCode 这个是标记码
     * @param listener     这个是网络返回数据的监听
     */
    public void post(HttpParams httpParams, String url, Class clazz, int resquestCode, HttpLoader.HttpListener listener) {
        HttpLoader.getInstance(ChinaApplication.context).post(
                url,
                httpParams,
                clazz,
                resquestCode,
                listener
        );
    }
}

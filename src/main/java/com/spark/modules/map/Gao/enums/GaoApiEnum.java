package com.spark.modules.map.Gao.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author LYCHEE
 * 高德地图请求API枚举类
 */
@Getter
@AllArgsConstructor
public enum GaoApiEnum {

    /**
     * 高德请求路径
     */
    API_PREFIX("https://restapi.amap.com/v3","高德请求路径"),

    /**
     * 地理编码 API 服务地址
     */
    GEO_API("/geocode/geo","地理编码 API 服务地址"),

    /**
     * 逆地理编码 API 服务地址
     */
    REGEO_API("/geocode/regeo","逆地理编码 API 服务地址");


    /**
     * URL
     */
    private final String url;

    /**
     * 描述
     */
    private final String description;
}

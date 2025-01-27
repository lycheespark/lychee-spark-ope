package com.spark.modules.wechat.smallProgram.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author LYCHEE
 * 微信小程序请求API枚举类
 */
@Getter
@AllArgsConstructor
public enum WechatApiEnum {

    /**
     * 微信请求路径
     */
    API_PREFIX("https://api.weixin.qq.com","微信请求路径前缀"),

    /**
     * 获取接口调用凭据
     * <p>
     *     <a href="https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/mp-access-token/getAccessToken.html">...</a>
     * </p>
     */
    GET_ACCESS_TOKEN_API("/cgi-bin/token", "获取Access Token"),

    /**
     * 小程序登录
     * <p>
     *     <a href="https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/user-login/code2Session.html">...</a>
     * </p>
     */
    LOGIN_API("/sns/jscode2session","根据code获取小程序openID和UnionID"),

    /**
     * 获取手机号
     * <p>
     *     <a href="https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/user-info/phone-number/getPhoneNumber.html">...</a>
     * </p>
     */
    GET_USER_PHONE_API("/wxa/business/getuserphonenumber","根据code获取手机号"),

    /**
     * 获取小程序码
     * 该接口用于获取小程序码，适用于需要的码数量较少的业务场景。通过该接口生成的小程序码，永久有效，有数量限制，详见获取小程序码。
     * <p>
     *     <a href="https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/qrcode-link/qr-code/getQRCode.html">...</a>
     * </p>
     */
    GET_QR_CODE_API("/wxa/getwxacode","该接口用于获取小程序码，适用于需要的码数量较少的业务场景"),

    /**
     * 获取不限制的小程序码
     * 该接口用于获取小程序码，适用于需要的码数量极多的业务场景。通过该接口生成的小程序码，永久有效，数量暂无限制。 更多用法详见 获取小程序码。
     * <p>
     *     <a href="https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/qrcode-link/qr-code/getUnlimitedQRCode.html">...</a>
     * </p>
     */
    GET_UNLIMITED_QR_CODE_API("/wxa/getwxacodeunlimit","该接口用于获取小程序码，适用于需要的码数量极多的业务场景");




    /**
     * URL
     */
    private final String url;

    /**
     * 描述
     */
    private final String description;

}

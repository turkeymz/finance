package com.chaimao.finance.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by turkeymz on 2017/8/6.
 */
@Controller
@RequestMapping("/service")
@Slf4j
public class ServiceController {

    @Autowired
    ServiceControllerImpl serviceController;


    @RequestMapping("/interface.do")
    @ResponseBody
    public String getInterface(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Access-Token");
        // 防止中文乱码
        request.setCharacterEncoding("utf-8");
        // 定义变量  sReturn:返回数据,sJson:收到数据,sDevice:,sToken:秘钥,sUser:用户id.
        String sReturn = "", sJson = "", sDevice = "", sToken = "", sUser = "";
        //接收请求参数
        sJson = request.getParameter("a").trim();
        sDevice = request.getParameter("b");
        sToken = request.getParameter("c");
        if (com.pengcheng.commonmanage.util.CommonUtil.isNull(sToken)) {
            sToken = "";
        }
        sReturn = serviceController.taskDistribution(sToken, sJson);
        log.info("sJson:={} ", sJson);
        log.info("sToken:={} ", sToken);
        // sJson = decrypt(sJson, sToken);
        log.info("hello={}", sJson);

/*        JsonNode node = JsonUtil.getJson(sJson);
        sUser = JsonUtil.getJsonStringValue(node, "_userid");
        String sClass = JsonUtil.getJsonStringValue(node, "a");
        String sFunction = JsonUtil.getJsonStringValue(node, "c");*/
        return sReturn;
    }




}

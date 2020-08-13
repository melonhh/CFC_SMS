package com.yingpu;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baidubce.cfc.core.http.CfcContext;
import com.baidubce.cfc.core.http.HttpRequestHandler;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public class Handler implements HttpRequestHandler {
    Logger logger = Logger.getLogger(Handler.class);

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response, CfcContext context) throws ServletException, IOException {
        logger.info("BEGIN=====================================================");

        BufferedReader reader = request.getReader();
        StringBuilder builder = new StringBuilder();
        String string;
        while ((string = reader.readLine()) != null) {
            builder.append(string);
        }

        logger.info(builder.toString());


        logger.info("END=======================================================");
    }
}

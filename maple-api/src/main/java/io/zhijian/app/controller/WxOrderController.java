package io.zhijian.app.controller;

import com.riversoft.weixin.pay.payment.Payments;
import com.riversoft.weixin.pay.payment.bean.OrderQueryRequest;
import com.riversoft.weixin.pay.payment.bean.OrderQueryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Function:测试微信支付控制器.
 */
@Controller
@RequestMapping(value = "/wx/order")
public class WxOrderController {

    private static Logger logger = LoggerFactory.getLogger(WxOrderController.class);

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public OrderQueryResponse query(@RequestParam(value = "orderNo") String orderNo) throws Exception {
        OrderQueryRequest orderQueryRequest = new OrderQueryRequest();
        orderQueryRequest.setTradeNumber(orderNo);

        OrderQueryResponse response = Payments.defaultPayments().query(orderQueryRequest);

        return response;
    }
}

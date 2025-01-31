package com.dmall.service;

import com.dmall.domain.dto.PayApplyDTO;
import com.dmall.domain.dto.PayOrderFormDTO;
import com.dmall.domain.po.PayOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 支付订单 服务类
 * </p>
 *
 * @author zhang
 *
 */
public interface IPayOrderService extends IService<PayOrder> {

    String applyPayOrder(PayApplyDTO applyDTO);

    void tryPayOrderByBalance(PayOrderFormDTO payOrderFormDTO);
}

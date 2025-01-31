package com.dmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dmall.domain.dto.CartFormDTO;
import com.dmall.domain.po.Cart;
import com.dmall.domain.vo.CartVO;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 订单详情表 服务类
 * </p>
 *
 * @author zhang
 *
 */
public interface ICartService extends IService<Cart> {

    void addItem2Cart(CartFormDTO cartFormDTO);

    List<CartVO> queryMyCarts();

    void removeByItemIds(Collection<Long> itemIds);
}

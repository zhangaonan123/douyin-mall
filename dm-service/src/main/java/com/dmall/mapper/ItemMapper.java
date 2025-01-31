package com.dmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dmall.domain.dto.OrderDetailDTO;
import com.dmall.domain.po.Item;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author zhang
 *
 */
public interface ItemMapper extends BaseMapper<Item> {

    @Update("UPDATE item SET stock = stock - #{num} WHERE id = #{itemId}")
    void updateStock(OrderDetailDTO orderDetail);
}

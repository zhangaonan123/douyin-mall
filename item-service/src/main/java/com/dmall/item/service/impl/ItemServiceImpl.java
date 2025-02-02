package com.dmall.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dmall.common.exception.BizIllegalException;
import com.dmall.common.utils.BeanUtils;

import com.dmall.item.domain.dto.ItemDTO;
import com.dmall.item.domain.dto.OrderDetailDTO;
import com.dmall.item.domain.po.Item;
import com.dmall.item.mapper.ItemMapper;
import com.dmall.item.service.IItemService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author zhang
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {

    @Override
    public void deductStock(List<OrderDetailDTO> items) {
        String sqlStatement = "com.dmall.item.mapper.ItemMapper.updateStock";
        boolean r = false;
        try {
            r = executeBatch(items, (sqlSession, entity) -> sqlSession.update(sqlStatement, entity));
        } catch (Exception e) {
            throw new BizIllegalException("更新库存异常，可能是库存不足!", e);
        }
        if (!r) {
            throw new BizIllegalException("库存不足！");
        }
    }

    @Override
    public List<ItemDTO> queryItemByIds(Collection<Long> ids) {
        return BeanUtils.copyList(listByIds(ids), ItemDTO.class);
    }
}

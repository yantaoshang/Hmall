package com.hamll.cart.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hamll.cart.domain.dto.CartFormDTO;
import com.hamll.cart.domain.po.Cart;
import com.hamll.cart.domain.vo.CartVO;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 订单详情表 服务类
 * </p>
 *
 * @author 尚衍涛
 * @since 2023-05-05
 */
public interface ICartService extends IService<Cart> {

    void addItem2Cart(CartFormDTO cartFormDTO);

    List<CartVO> queryMyCarts();

    void removeByItemIds(Collection<Long> itemIds);
}

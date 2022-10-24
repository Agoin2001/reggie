package com.wpx.renggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wpx.renggie.entity.OrderDetail;
import com.wpx.renggie.mapper.OrderDetailMapper;
import com.wpx.renggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单明细表 服务实现类
 * </p>
 *
 * @author cc
 * @since 2022-05-30
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}

package com.sangui.sanguimall.order.mapper;

import com.sangui.sanguimall.order.model.OmsRefundInfo;

public interface OmsRefundInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsRefundInfo record);

    int insertSelective(OmsRefundInfo record);

    OmsRefundInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsRefundInfo record);

    int updateByPrimaryKey(OmsRefundInfo record);
}
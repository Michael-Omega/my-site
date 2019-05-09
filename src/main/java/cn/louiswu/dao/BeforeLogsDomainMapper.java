package cn.louiswu.dao;

import cn.louiswu.model.BeforeLogsDomain;

import java.util.List;

public interface BeforeLogsDomainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeforeLogsDomain record);

    int insertSelective(BeforeLogsDomain record);

    BeforeLogsDomain selectByPrimaryKey(Integer id);

    List<BeforeLogsDomain> selectBeforeLogsList();

    int updateByPrimaryKeySelective(BeforeLogsDomain record);

    int updateByPrimaryKey(BeforeLogsDomain record);
}
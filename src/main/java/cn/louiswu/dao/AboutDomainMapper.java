package cn.louiswu.dao;

import cn.louiswu.model.AboutDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AboutDomainMapper {
    int deleteByPrimaryKey(Integer sort);

    int insert(AboutDomain record);

    int insertSelective(AboutDomain record);

    AboutDomain selectByPrimaryKey();

    List<AboutDomain> selectList();

    int updateByPrimaryKeySelective (AboutDomain record);

    int updateByPrimaryKey(AboutDomain record);
}
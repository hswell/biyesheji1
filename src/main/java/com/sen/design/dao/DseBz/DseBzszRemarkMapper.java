package com.sen.design.dao.DseBz;

import com.sen.design.entity.DseBz.DseBzszRemark;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DseBzszRemarkMapper {
    int deleteByPrimaryKey(String BZSTCD);

    int insert(DseBzszRemark record);

    int insertSelective(DseBzszRemark record);

    DseBzszRemark selectByPrimaryKey(String BZSTCD);

    int updateByPrimaryKeySelective(DseBzszRemark record);

    int updateByPrimaryKey(DseBzszRemark record);
}
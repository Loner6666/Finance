package com.atguigu.finance.dao;

import com.atguigu.finance.bean.NplmBorrowerInfo;
import com.atguigu.finance.bean.NplmBorrowerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmBorrowerInfoMapper {

    int countByExample(NplmBorrowerInfoExample example);


    int deleteByExample(NplmBorrowerInfoExample example);


    int deleteByPrimaryKey(Integer id);


    int insert(NplmBorrowerInfo record);


    int insertSelective(NplmBorrowerInfo record);


    List<NplmBorrowerInfo> selectByExample(NplmBorrowerInfoExample example);


    NplmBorrowerInfo selectByPrimaryKey(Integer id);


    int updateByExampleSelective(@Param("record") NplmBorrowerInfo record, @Param("example") NplmBorrowerInfoExample example);


    int updateByExample(@Param("record") NplmBorrowerInfo record, @Param("example") NplmBorrowerInfoExample example);


    int updateByPrimaryKeySelective(NplmBorrowerInfo record);


    int updateByPrimaryKey(NplmBorrowerInfo record);

    List<NplmBorrowerInfo> getById(Integer id);
}
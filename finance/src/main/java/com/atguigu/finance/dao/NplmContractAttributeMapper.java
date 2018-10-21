package com.atguigu.finance.dao;

import com.atguigu.finance.bean.ContractList;
import com.atguigu.finance.bean.NplmContractAttribute;
import com.atguigu.finance.bean.NplmContractAttributeExample;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmContractAttributeMapper {

    int countByExample(NplmContractAttributeExample example);


    int deleteByExample(NplmContractAttributeExample example);


    int deleteByPrimaryKey(Integer id);


    int insert(NplmContractAttribute record);


    int insertSelective(NplmContractAttribute record);


    List<NplmContractAttribute> selectByExample(NplmContractAttributeExample example);


    NplmContractAttribute selectByPrimaryKey(Integer id);


    ArrayList<ContractList> contractList(ContractList contractList);


    int updateByExampleSelective(@Param("record") NplmContractAttribute record, @Param("example") NplmContractAttributeExample example);


    int updateByExample(@Param("record") NplmContractAttribute record, @Param("example") NplmContractAttributeExample example);


    int updateByPrimaryKeySelective(NplmContractAttribute record);


    int updateByPrimaryKey(NplmContractAttribute record);
}
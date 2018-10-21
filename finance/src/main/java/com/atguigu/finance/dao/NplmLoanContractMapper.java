package com.atguigu.finance.dao;

import com.atguigu.finance.bean.NplmLoanContract;
import com.atguigu.finance.bean.NplmLoanContractExample;
import java.util.List;

import com.atguigu.finance.bean.NplmRepaymentPlan;
import org.apache.ibatis.annotations.Param;

public interface NplmLoanContractMapper {

    int countByExample(NplmLoanContractExample example);

    int deleteByExample(NplmLoanContractExample example);

    int deleteByPrimaryKey(String id);

    int insert(NplmLoanContract record);

    int insertSelective(NplmLoanContract record);

    List<NplmLoanContract> selectByExample(NplmLoanContractExample example);

    NplmLoanContract selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") NplmLoanContract record, @Param("example") NplmLoanContractExample example);

    int updateByExample(@Param("record") NplmLoanContract record, @Param("example") NplmLoanContractExample example);

    int updateByPrimaryKeySelective(NplmLoanContract record);

    int updateByPrimaryKey(NplmLoanContract record);
}
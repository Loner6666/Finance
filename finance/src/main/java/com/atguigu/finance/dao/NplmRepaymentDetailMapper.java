package com.atguigu.finance.dao;

import com.atguigu.finance.bean.NplmRepaymentDetail;
import com.atguigu.finance.bean.NplmRepaymentDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmRepaymentDetailMapper {
    int countByExample(NplmRepaymentDetailExample example);

    int deleteByExample(NplmRepaymentDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NplmRepaymentDetail record);

    int insertSelective(NplmRepaymentDetail record);

    NplmRepaymentDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NplmRepaymentDetail record, @Param("example") NplmRepaymentDetailExample example);

    int updateByExample(@Param("record") NplmRepaymentDetail record, @Param("example") NplmRepaymentDetailExample example);

    int updateByPrimaryKeySelective(NplmRepaymentDetail record);

    int updateByPrimaryKey(NplmRepaymentDetail record);

    List<NplmRepaymentDetail> getByContractNum(String loanContractNum);
}
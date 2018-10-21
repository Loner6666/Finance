package com.atguigu.finance.controller;

import com.atguigu.finance.bean.*;
import com.atguigu.finance.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContractController {

    @Autowired
    private NplmContractAttributeMapper nplmContractAttributeMapper;

    @Autowired
    private NplmRepaymentPlanMapper nplmRepaymentPlanMapper;

    @Autowired
    private NplmRepaymentRecordMapper nplmRepaymentRecordMapper;

    @Autowired
    private NplmRepaymentDetailMapper nplmRepaymentDetailMapper;

    @Autowired
    private NplmBorrowerInfoMapper nplmBorrowerInfoMapper;

    // 根据 合同编号 查询 合同信息列表
    @RequestMapping("ContractList")
    @ResponseBody
    public ArrayList<ContractList> ContractList(ContractList contractList) {
        ArrayList<ContractList> contractLists = nplmContractAttributeMapper.contractList(contractList);
        return contractLists;
    }


    @RequestMapping("nplmRepaymentPlanList")
    @ResponseBody
    public ContractList nplmRepaymentPlanList(ContractList contractList) {
        ArrayList<ContractList> contractLists = nplmContractAttributeMapper.contractList(contractList);
        contractList = contractLists.get(0);

        // 现行还款方案情况
        List<NplmRepaymentPlan> nplmRepaymentPlan = nplmRepaymentPlanMapper.getByContractNum(contractList.getLoanContractNum());
        contractList.setNplmRepaymentPlanList(nplmRepaymentPlan);

        // 还款明细
        List<NplmRepaymentRecord> nplmRepaymentRecord = nplmRepaymentRecordMapper.getByContractNum(contractList.getLoanContractNum());
        contractList.setNplmRepaymentRecordList(nplmRepaymentRecord);

        // 分配明细
        List<NplmRepaymentDetail> nplmRepaymentDetail = nplmRepaymentDetailMapper.getByContractNum(contractList.getLoanContractNum());
        contractList.setNplmRepaymentDetailList(nplmRepaymentDetail);

        // 客户基本信息---------------------------------------------
        List<NplmBorrowerInfo> borrowerInfo = nplmBorrowerInfoMapper.getById(contractList.getId());
        contractList.setBorrowerInfoList(borrowerInfo);

        return contractList;
    }


}

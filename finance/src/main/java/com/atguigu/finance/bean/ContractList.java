package com.atguigu.finance.bean;

import java.io.Serializable;
import java.util.List;

public class ContractList implements Serializable {

    private List<NplmRepaymentPlan> nplmRepaymentPlanList;
    private List<NplmRepaymentRecord> nplmRepaymentRecordList;
    private List<NplmRepaymentDetail> nplmRepaymentDetailList;
    private List<NplmBorrowerInfo> borrowerInfoList;

    private Integer id;
    private String clientName;
    private String identityType;
    private String identityNum;
    private String proCategoryName;
    private String businessType;
    private String loanContractNum;
    private String contractType;
    private String city;
    private String deptName;
    private String isExpedited;
    private String signType;
    private String signDate;
    private String loanInstalments;
    private String startDate;
    private String endDate;
    private String settleDate;
    private String loanAmount;
    private String repayAccountBankName;
    private String repayAccount;
    private String preFee;
    private String loanType;
    private String putAmount;

    private String sex;
    private String birthday;
    private String identityValidDate;
    private String hDress;
    private String marital;
    private Integer haveChildren;
    private String houseExplain;
    private String mobile1;
    private String fZipcode;
    private String fStreet;

    public List<NplmRepaymentPlan> getNplmRepaymentPlanList() {
        return nplmRepaymentPlanList;
    }

    public void setNplmRepaymentPlanList(List<NplmRepaymentPlan> nplmRepaymentPlanList) {
        this.nplmRepaymentPlanList = nplmRepaymentPlanList;
    }

    public List<NplmRepaymentRecord> getNplmRepaymentRecordList() {
        return nplmRepaymentRecordList;
    }

    public void setNplmRepaymentRecordList(List<NplmRepaymentRecord> nplmRepaymentRecordList) {
        this.nplmRepaymentRecordList = nplmRepaymentRecordList;
    }

    public List<NplmRepaymentDetail> getNplmRepaymentDetailList() {
        return nplmRepaymentDetailList;
    }

    public void setNplmRepaymentDetailList(List<NplmRepaymentDetail> nplmRepaymentDetailList) {
        this.nplmRepaymentDetailList = nplmRepaymentDetailList;
    }

    public List<NplmBorrowerInfo> getBorrowerInfoList() {
        return borrowerInfoList;
    }

    public void setBorrowerInfoList(List<NplmBorrowerInfo> borrowerInfoList) {
        this.borrowerInfoList = borrowerInfoList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    public String getProCategoryName() {
        return proCategoryName;
    }

    public void setProCategoryName(String proCategoryName) {
        this.proCategoryName = proCategoryName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(String loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getIsExpedited() {
        return isExpedited;
    }

    public void setIsExpedited(String isExpedited) {
        this.isExpedited = isExpedited;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public String getLoanInstalments() {
        return loanInstalments;
    }

    public void setLoanInstalments(String loanInstalments) {
        this.loanInstalments = loanInstalments;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getRepayAccountBankName() {
        return repayAccountBankName;
    }

    public void setRepayAccountBankName(String repayAccountBankName) {
        this.repayAccountBankName = repayAccountBankName;
    }

    public String getRepayAccount() {
        return repayAccount;
    }

    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
    }

    public String getPreFee() {
        return preFee;
    }

    public void setPreFee(String preFee) {
        this.preFee = preFee;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getPutAmount() {
        return putAmount;
    }

    public void setPutAmount(String putAmount) {
        this.putAmount = putAmount;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdentityValidDate() {
        return identityValidDate;
    }

    public void setIdentityValidDate(String identityValidDate) {
        this.identityValidDate = identityValidDate;
    }

    public String gethDress() {
        return hDress;
    }

    public void sethDress(String hDress) {
        this.hDress = hDress;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public Integer getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(Integer haveChildren) {
        this.haveChildren = haveChildren;
    }

    public String getHouseExplain() {
        return houseExplain;
    }

    public void setHouseExplain(String houseExplain) {
        this.houseExplain = houseExplain;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getfZipcode() {
        return fZipcode;
    }

    public void setfZipcode(String fZipcode) {
        this.fZipcode = fZipcode;
    }

    public String getfStreet() {
        return fStreet;
    }

    public void setfStreet(String fStreet) {
        this.fStreet = fStreet;
    }
}

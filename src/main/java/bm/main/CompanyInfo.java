package bm.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import bm.Bank;
import bm.Bankflow;
import bm.CommonAttachment;
import bm.CompanyAssets;
import bm.CompanyBadDebt;
import bm.CompanyBase;
import bm.CompanyChannel;
import bm.CompanyCredit;
import bm.CompanyExecutive;
import bm.CompanyGuarantee;
import bm.CompanyIndicator;
import bm.CompanyLiability;
import bm.CompanyOther;
import bm.CompanyShareholder;
import bm.CompanyTax;

public class CompanyInfo {
    private CompanyBase base = new CompanyBase();
    private CompanyCredit credit=new CompanyCredit();
    private CompanyOther other=new CompanyOther();
    private Bankflow bankflow=new Bankflow();
    private List<CompanyAssets> assets = new ArrayList<>();
    private List<CompanyBadDebt> badDebt = new ArrayList<>();
    private List<CompanyChannel> channel = new ArrayList<>();
    private List<CompanyExecutive> executive = new ArrayList<>();
    private List<CompanyGuarantee> guarantee = new ArrayList<>();
    private List<CompanyIndicator> indicator = new ArrayList<>();
    private List<CompanyLiability> liability = new ArrayList<>();
    private List<CompanyShareholder> shareholder = new ArrayList<>();
    private List<CompanyTax> tax = new ArrayList<>();
    private List<Bank> bank = new ArrayList<>();

    private List<CommonAttachment> commonAttachment = new ArrayList<>();

    {
        assets.add(new CompanyAssets());
        badDebt.add(new CompanyBadDebt());
        channel.add(new CompanyChannel());
        executive.add(new CompanyExecutive());
        guarantee.add(new CompanyGuarantee());
        indicator.add(new CompanyIndicator());
        liability.add(new CompanyLiability());
        shareholder.add(new CompanyShareholder());
        tax.add(new CompanyTax());
        bank.add(new Bank());
        commonAttachment.add(new CommonAttachment());
    }

    /**
     * 以post方式访问
     * 
     * @param url
     *            接口url地址
     * @param xmlBody
     *            xml格式的字符串
     * @return
     */
    public static String post(String url, String xmlBody) {
        HttpClient httpClient = new DefaultHttpClient();
        try {
            HttpPost httpPost = new HttpPost(url);

            StringEntity input = new StringEntity(xmlBody, "UTF-8");
            input.setContentType("application/json");

            httpPost.setEntity(input);

            HttpResponse httpResponse = httpClient.execute(httpPost);
            int statusCode = httpResponse.getStatusLine().getStatusCode();

            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity httpEntity = httpResponse.getEntity();
                String result = EntityUtils.toString(httpEntity);
                EntityUtils.consume(httpEntity);
                return result;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                httpClient.getConnectionManager().shutdown();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return "";
    }

    private static void $(JSONObject jsonObject, String key) {
        jsonObject.get(key).toString();

    }

    public static void main(String[] args) {

        List<CompanyInfo> list = new ArrayList<>();

        CompanyInfo info = new CompanyInfo();
        list.add(info);
        Object o = JSON.toJSON(list);
        System.out.println(o);
        // String url =
        // "http://localhost:8080/duoying-abs-ws/ws/rest/borrower/addPersonal";
        //
        // String result = post(url, o.toString());

        JSONObject ii = (JSONObject) JSON.parseArray(o.toString()).get(0);

        testBase(ii.getJSONObject("base"));

        testAsset(ii.getJSONArray("assets").getJSONObject(0));
        testbadDebt(ii.getJSONArray("badDebt").getJSONObject(0));
        testchannel(ii.getJSONArray("channel").getJSONObject(0));
        testCredit(ii.getJSONObject("credit"));
        testexecutive(ii.getJSONArray("executive").getJSONObject(0));
        testguarantee(ii.getJSONArray("guarantee").getJSONObject(0));
        testindicator(ii.getJSONArray("indicator").getJSONObject(0));
        testliability(ii.getJSONArray("liability").getJSONObject(0));
        testOther(ii.getJSONObject("other"));
        testshareholder(ii.getJSONArray("shareholder").getJSONObject(0));
        testtax(ii.getJSONArray("tax").getJSONObject(0));
        testbank(ii.getJSONArray("bank").getJSONObject(0));
        testbankflow(ii.getJSONObject("bankflow"));
        testcommonAttachment(ii.getJSONArray("commonAttachment").getJSONObject(0));

    }

    private static void testcommonAttachment(JSONObject jsonObject) {
        // TODO Auto-generated method stub
        
    }

    private static void testbankflow(JSONObject jsonObject) {
        // TODO Auto-generated method stub
        
    }

    private static void testbank(JSONObject jsonObject) {
        // TODO Auto-generated method stub
        
    }

    private static void testtax(JSONObject jsonObject) {
        $(jsonObject, "taxType");
        $(jsonObject, "balance");
        $(jsonObject, "taxDate");
        $(jsonObject, "remark");

        
    }

    private static void testshareholder(JSONObject jsonObject) {
        $(jsonObject, "shareholderName");
        $(jsonObject, "shareholderType");
        $(jsonObject, "certificateType");
        $(jsonObject, "certificateNo");
        $(jsonObject, "shareholdRatio");
        $(jsonObject, "shareholdAmount");
        $(jsonObject, "remark");

        
    }

    private static void testliability(JSONObject jsonObject) {
        $(jsonObject, "borrowerName");
        $(jsonObject, "bankName");
        $(jsonObject, "amount");
        $(jsonObject, "balance");
        $(jsonObject, "startDate");
        $(jsonObject, "endDate");
        $(jsonObject, "repaymentType");
        $(jsonObject, "guaranteeType");
        $(jsonObject, "remark");

        
    }

    private static void testindicator(JSONObject jsonObject) {
        $(jsonObject, "businessIndicator");
        $(jsonObject, "businessAccountType");
        $(jsonObject, "annualSales");
        $(jsonObject, "monthlySales");
        $(jsonObject, "annualSalesAvg");
        $(jsonObject, "remark");

        
    }

    private static void testguarantee(JSONObject jsonObject) {
        $(jsonObject, "guaranteeCategory");
        $(jsonObject, "amount");
        $(jsonObject, "guaranteeStatus");
        $(jsonObject, "contractNo");
        $(jsonObject, "institution");
        $(jsonObject, "remark");

        
    }

    private static void testexecutive(JSONObject jsonObject) {
        $(jsonObject, "name");
        $(jsonObject, "sex");
        $(jsonObject, "certificateType");
        $(jsonObject, "certificateNo");
        $(jsonObject, "officePhone");
        $(jsonObject, "homePhone");
        $(jsonObject, "mobilePhone");
        $(jsonObject, "leaderType");
        $(jsonObject, "position");
        $(jsonObject, "remark");

        
    }

    private static void testchannel(JSONObject jsonObject) {
        $(jsonObject, "channelType");
        $(jsonObject, "cooperativeCompany");
        $(jsonObject, "cooperativeType");
        $(jsonObject, "cooperativeAgeLimit");
        $(jsonObject, "settlementType");
        $(jsonObject, "payableAccount");
        $(jsonObject, "remark");

        
    }

    private static void testbadDebt(JSONObject jsonObject) {
        $(jsonObject, "businessType");
        $(jsonObject, "contractNo");
        $(jsonObject, "amount");
        $(jsonObject, "balance");
        $(jsonObject, "remark");

        
    }

    private static void testAsset(JSONObject jsonObject) {
        $(jsonObject, "assetsType");
        $(jsonObject, "name");
        $(jsonObject, "value");
        $(jsonObject, "remark");

        
    }

    private static int testCredit(JSONObject jsonObject) {
        $(jsonObject, "chinacourtLitigationCount");
        $(jsonObject, "courtExcuteCount");
        $(jsonObject, "netInfoCount");
        $(jsonObject, "netInfoSummary");
        $(jsonObject, "reputationSocialPosition");
        $(jsonObject, "otherCreditDescribe");
        $(jsonObject, "remark");

        return 0;
    }

    private static void testBase(JSONObject jsonObject) {
       $(jsonObject, "borrowerId");
       $(jsonObject, "name");
       $(jsonObject, "shortName");
       $(jsonObject, "registerCapital");
       $(jsonObject, "nationalTaxNo");
       $(jsonObject, "institutionCode");
       $(jsonObject, "localTaxNo");
       $(jsonObject, "businessLicense");
       $(jsonObject, "businessLicenseStartDate");
       $(jsonObject, "businessLicenseEndDate");
       $(jsonObject, "corporation");
       $(jsonObject, "registerAddress");
       $(jsonObject, "addressDetail");
       $(jsonObject, "businessScope");
       $(jsonObject, "mainProductsDescribe");
       $(jsonObject, "staffSize");
       $(jsonObject, "officeAddress");
       $(jsonObject, "zipAddress");
       $(jsonObject, "companyAreaSize");
       $(jsonObject, "companyAreaOwner");
       $(jsonObject, "companyAreaRent");
       $(jsonObject, "loanCardNo");
       $(jsonObject, "companyPhone");
       $(jsonObject, "cityCode");
       $(jsonObject, "riskAssessment");
       $(jsonObject, "remark");


    }

    private static int testOther(JSONObject jsonObject) {
        $(jsonObject, "industry");
        $(jsonObject, "brand");
        $(jsonObject, "isQuotedCompany");
        $(jsonObject, "isNewCompany");
        $(jsonObject, "isCollectiveCompany");
        $(jsonObject, "isImportLicense");
        $(jsonObject, "remark");

        return 0;
    }

    public CompanyBase getBase() {
        return base;
    }

    public void setBase(CompanyBase base) {
        this.base = base;
    }

    public CompanyCredit getCredit() {
        return credit;
    }

    public void setCredit(CompanyCredit credit) {
        this.credit = credit;
    }

    public CompanyOther getOther() {
        return other;
    }

    public void setOther(CompanyOther other) {
        this.other = other;
    }

    public Bankflow getBankflow() {
        return bankflow;
    }

    public void setBankflow(Bankflow bankflow) {
        this.bankflow = bankflow;
    }

    public List<CompanyAssets> getAssets() {
        return assets;
    }

    public void setAssets(List<CompanyAssets> assets) {
        this.assets = assets;
    }

    public List<CompanyBadDebt> getBadDebt() {
        return badDebt;
    }

    public void setBadDebt(List<CompanyBadDebt> badDebt) {
        this.badDebt = badDebt;
    }

    public List<CompanyChannel> getChannel() {
        return channel;
    }

    public void setChannel(List<CompanyChannel> channel) {
        this.channel = channel;
    }

    public List<CompanyExecutive> getExecutive() {
        return executive;
    }

    public void setExecutive(List<CompanyExecutive> executive) {
        this.executive = executive;
    }

    public List<CompanyGuarantee> getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(List<CompanyGuarantee> guarantee) {
        this.guarantee = guarantee;
    }

    public List<CompanyIndicator> getIndicator() {
        return indicator;
    }

    public void setIndicator(List<CompanyIndicator> indicator) {
        this.indicator = indicator;
    }

    public List<CompanyLiability> getLiability() {
        return liability;
    }

    public void setLiability(List<CompanyLiability> liability) {
        this.liability = liability;
    }

    public List<CompanyShareholder> getShareholder() {
        return shareholder;
    }

    public void setShareholder(List<CompanyShareholder> shareholder) {
        this.shareholder = shareholder;
    }

    public List<CompanyTax> getTax() {
        return tax;
    }

    public void setTax(List<CompanyTax> tax) {
        this.tax = tax;
    }

    public List<Bank> getBank() {
        return bank;
    }

    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }

    public List<CommonAttachment> getCommonAttachment() {
        return commonAttachment;
    }

    public void setCommonAttachment(List<CommonAttachment> commonAttachment) {
        this.commonAttachment = commonAttachment;
    }

}

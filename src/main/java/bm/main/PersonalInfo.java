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
import bm.PersonalAdditional;
import bm.PersonalAssets;
import bm.PersonalBase;
import bm.PersonalCar;
import bm.PersonalCommunicationData;
import bm.PersonalCompany;
import bm.PersonalContacts;
import bm.PersonalCredit;
import bm.PersonalHouse;
import bm.PersonalIncome;
import bm.PersonalOther;
import bm.PersonalSshf;
import bm.PersonalWork;

public class PersonalInfo {

    private PersonalBase base = new PersonalBase();

    private PersonalCredit credit = new PersonalCredit();
    private PersonalWork work = new PersonalWork();
    private Bankflow bankflow = new Bankflow();

  
    private PersonalSshf sshf = new PersonalSshf();
 
    private PersonalOther other = new PersonalOther();
    private PersonalAdditional additional = new PersonalAdditional();
    private PersonalIncome income = new PersonalIncome();;
    private List<PersonalCar> car = new ArrayList<>();;
    private List<PersonalAssets> assets = new ArrayList<>();;
    private List<PersonalContacts> contacts = new ArrayList<>();
    private List<PersonalCommunicationData> communicationData = new ArrayList<>();
    private List<CommonAttachment> attachment = new ArrayList<>();;
    private List<PersonalHouse> house = new ArrayList<>();
    private List<PersonalCompany> company = new ArrayList<>();
    private List<Bank> bank = new ArrayList<>();;
    
    {
        car.add(new PersonalCar());
        assets.add(new PersonalAssets());
        contacts.add(new PersonalContacts());
        communicationData.add(new PersonalCommunicationData());
        attachment.add(new CommonAttachment());
        house.add(new PersonalHouse());
        bank.add(new Bank());
        
        company.add(new PersonalCompany());
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
    public static void main(String[] args) {
        
        List<PersonalInfo> list = new ArrayList<>();

        PersonalInfo info = new PersonalInfo();
        list.add(info);
        Object o = JSON.toJSON(list);
        System.out.println(o);
        String url = "http://localhost:8080/duoying-abs-ws/ws/rest/borrower/addPersonal";
       
        String result = post(url,o.toString());
        
        JSONObject ii = (JSONObject) JSON.parseArray(result).get(0);
        
        
        testBase(ii.getJSONObject("base"));
        tastHouse(ii.getJSONArray("house").getJSONObject(0));
        testCredit(ii.getJSONObject("credit"));
        testWork(ii.getJSONObject("work"));
        testBankflow(ii.getJSONObject("bankflow"));
        
        
        
        
        testHHSF(ii.getJSONObject("sshf"));
        testContact(ii.getJSONArray("contacts").getJSONObject(0));
        
        testOther(ii.getJSONObject("other"));
        
        testCommit(ii.getJSONArray("communicationData").getJSONObject(0));
        
        testPersonCompany(ii.getJSONArray("company").getJSONObject(0));
        
        testIncome(ii.getJSONObject("income"));
        testCar(ii.getJSONArray("car").getJSONObject(0));
        testAsset(ii.getJSONArray("assets").getJSONObject(0));
        testAttech(ii.getJSONObject("additional"));
    }
    
    private static void testAttech(JSONObject a) {
        $(a,"phoneServiceProviders") ;
        $(a,"phoneAttribution") ;
        $(a,"phoneAccountPwd") ;
        $(a,"jiebeiLimit") ;
        $(a,"huabeiLimit") ;
        $(a,"jiedaibaoAccount") ;
        $(a,"zhifubaoAccount") ;
        $(a,"zhimaCredit") ;
        $(a,"remark") ;

        
    }

    private static void testAsset(JSONObject a) {
        $(a,"securitiesDescribe") ;
        $(a,"securitiesValue") ;
        $(a,"otherAssets") ;
        $(a,"otherAssetsValue") ;
        $(a,"bankLoanDescribe") ;
        $(a,"bankLoanAmount") ;
        $(a,"personalLoanDescribe") ;
        $(a,"personalLoanAmount") ;
        $(a,"otherLiabilitiesDescribe")  ;
        $(a,"otherLiabilitiesAmount") ;
        $(a,"remark") ;

    }

    private static void testCar(JSONObject a) {
        $(a,"plateNumber") ;
        $(a,"mileage") ;
        $(a,"valuation") ;
        $(a,"brand") ;
        $(a,"vehicleModel") ;
        $(a,"vinNo") ;
        $(a,"serviceLife") ;
        $(a,"remark") ;

        
    }

    private static void testIncome(JSONObject a) {
        $(a,"personalIncomeSource") ;
        $(a,"personalMonthlyIncome") ;
        $(a,"personalAnnualIncome") ;
        $(a,"familyIncomeSource") ;
        $(a,"familyMonthlyIncome") ;
        $(a,"familyAnnualIncome") ;
        $(a,"remark") ;

        
    }

    private static void testPersonCompany(JSONObject a) {
        $(a,"name") ;
        $(a,"companyType") ;
        $(a,"businessLicense") ;
        $(a,"registerCapital") ;
        $(a,"institutionCode") ;
        $(a,"corporation") ;
        $(a,"address") ;
        $(a,"telephone") ;
        $(a,"remark") ;

        
    }

    private static void testCommit(JSONObject a) {
        $(a,"orderId") ;
        $(a,"communicationStatus") ;
        $(a,"orderType") ;
        $(a,"checkedPhone") ;
        $(a,"phoneServiceProviders") ;
        $(a,"accessDate") ;
        $(a,"isRealNameAuth") ;
        $(a,"authIdcardNo") ;
        $(a,"mobilePhone") ;
        $(a,"email") ;
        $(a,"balance") ;
        $(a,"level") ;
        $(a,"integral") ;
        $(a,"netAge") ;
        $(a,"address") ;
        $(a,"latelyUseDate") ;
        $(a,"earliestUseDate") ;
        $(a,"remark") ;
        $(a.getJSONArray("callLog").getJSONObject(0),"phoneNo") ;
        $(a.getJSONArray("callLog").getJSONObject(0),"duration") ;
        $(a.getJSONArray("callLog").getJSONObject(0),"activeCount") ;
        $(a.getJSONArray("callLog").getJSONObject(0),"calledCount") ;
        $(a.getJSONArray("callLog").getJSONObject(0),"phoneAttribution") ;
        $(a.getJSONArray("callLog").getJSONObject(0),"remark") ;

    }

    private static void testOther(JSONObject a) {
        $(a,"isProvidePayBill") ;
        $(a,"isProvideAddressBill") ;
        $(a,"isProvideAccumulationFundBill") ;
        $(a,"isProvideIncumbencyCertificate") ;
        $(a,"isHaveLawsuit") ;
        $(a,"isHaveCriminalRecord") ;
        $(a,"creditInformation") ;
        $(a,"loanOverdueCount") ;
        $(a,"tabooItems") ;
        $(a,"faith") ;
        $(a,"hobby") ;
        $(a,"character") ;
        $(a,"health") ;
        $(a,"remark") ;

        
    }

    private static void testContact(JSONObject a) {
        $(a,"name") ;
        $(a,"mobilePhone") ;
        $(a,"contactsPriority") ;
        $(a,"relationship") ;
        $(a,"remark") ;

    }

    private static void testHHSF(JSONObject a) {
        // TODO Auto-generated method stub
        $(a,"ssCompany") ;
        $(a,"ssPayBase") ;
        $(a,"ssPayStopDate") ;
        $(a,"hfCompany") ;
        $(a,"hfOpenDate") ;
        $(a,"hfPayStopDate") ;
        $(a,"hfMonthPay") ;
        $(a,"hfQueryDate") ;
        $(a,"hrQueryBalance") ;
        $(a,"remark") ;

    }

    private static void testBankflow(JSONObject a) {
        $(a,"bankName") ;
        $(a,"bankAccount") ;
        $(a,"startDate") ;
        $(a,"endDate") ;
        $(a,"balance") ;
        $(a,"isConfirm") ;
        $(a,"assetsStatisticsDate") ;
        $(a,"remark") ;
        $(a.getJSONArray("bankFlowDetail").getJSONObject(0),("recordDate")) ;
        $(a.getJSONArray("bankFlowDetail").getJSONObject(0),("amount")) ;
        $(a.getJSONArray("bankFlowDetail").getJSONObject(0),("balance")) ;
        $(a.getJSONArray("bankFlowDetail").getJSONObject(0),("remark")) ;

    }

    private static void testWork(JSONObject a) {
        $(a,"workCompanyType") ;
        $(a,"position") ;
        $(a,"titleLevel") ;
        $(a,"department") ;
        $(a,"inductionTime") ;
        $(a,"ssType") ;
        $(a,"occupation") ;
        $(a,"industry") ;
        $(a,"monthlyIncome") ;
        $(a,"payDate") ;
        $(a,"otherMonthlyIncome") ;
        $(a,"companyName") ;
        $(a,"companyAddress") ;
        $(a,"companyPhone") ;
        $(a,"companyLevel") ;
        $(a,"companyQualified") ;
        $(a,"companyZipCode") ;
        $(a,"remark") ;

        
    }

    private static void testCredit(JSONObject a) {
        $(a,"creditCardCount") ;
        $(a,"creditCardTotalAmount") ;
        $(a,"creditCardUseRatio") ;
        $(a,"creditCardMonthlyPayment") ;
        $(a,"creditCardUncleareUncancelAccountCount") ;
        $(a,"creditCardOverdueAccountCount") ;
        $(a,"creditCardOverdue90AccountCount") ;
        $(a,"creditCardOtherGuaranteeCount") ;
        $(a,"loanCount") ;
        $(a,"loanTotalAmount") ;
        $(a,"loanBalance") ;
        $(a,"loanMonthlyPayment") ;
        $(a,"loadOverdueInfo") ;
        $(a,"homeLoanUncleareUncancelAccountCount") ;
        $(a,"homeLoanOverdueAccountCount") ;
        $(a,"homeLoanOverdue90AccountCount") ;
        $(a,"homeLoanOtherGuaranteeCount") ;
        $(a,"otherLoanUncleareUncancelAccountCount") ;
        $(a,"otherLoanOverdueAccountCount") ;
        $(a,"otherLoanOverdue90AccountCount") ;
        $(a,"otherLoanOtherGuaranteeCount") ;
        $(a,"guaranteeCount") ;
        $(a,"guaranteeTotalAmount") ;
        $(a,"guaranteeBalance") ;
        $(a,"guaranteeOverdueStatus") ;
        $(a,"creditQueryCount") ;
        $(a,"oneYearQueryCount") ;
        $(a,"chinacourtLitigationCount") ;
        $(a,"personalReputationSocialPosition") ;
        $(a,"otherCreditDescribe") ;
        $(a,"remark") ;

        
    }

    private static void tastHouse(JSONObject a) {
        $(a,"owner") ;
        $(a,"houseType") ;
        $(a,"acreage") ;
        $(a,"valuation") ;
        $(a,"address") ;
        $(a,"remark") ;

        
    }

    private static void $(JSONObject jsonObject,String key) {
        jsonObject.get(key).toString();
        
    }
    private static void testBase(JSONObject a) {
      $(a,"borrowerId") ;
      $(a,"name") ; 
      $(a,"formerName") ;
      $(a,"sex") ;
      $(a,"birthDate") ;
      $(a,"maritalStatus") ;
      $(a,"supportCount") ;
      $(a,"familyCount") ;
      $(a,"educationLevel") ;
      $(a,"mobilePhone") ;
      $(a,"telphone") ;
      $(a,"cityCode") ;
      $(a,"instantMessaging") ;
      $(a,"currentAddress") ;
      $(a,"shippingAddress") ;
      $(a,"zipCode") ;
      $(a,"email") ;
      $(a,"arrivalTime") ;
      $(a,"householdDegisterType") ;
      $(a,"certificateType") ;
      $(a,"certificateNo") ;
      $(a,"certificateValidityDate") ;
      $(a,"driverLicense") ;
      $(a,"riskAssessment") ;
      $(a,"remark") ;

        
    }


    public PersonalBase getBase() {
        return base;
    }

    public void setBase(PersonalBase base) {
        this.base = base;
    }

    public List<PersonalHouse> getHouse() {
        return house;
    }

    public void setHouse(List<PersonalHouse> house) {
        this.house = house;
    }

    public PersonalCredit getCredit() {
        return credit;
    }

    public void setCredit(PersonalCredit credit) {
        this.credit = credit;
    }

    public PersonalWork getWork() {
        return work;
    }

    public void setWork(PersonalWork work) {
        this.work = work;
    }

    public Bankflow getBankflow() {
        return bankflow;
    }

    public void setBankflow(Bankflow bankflow) {
        this.bankflow = bankflow;
    }

    public List<CommonAttachment> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<CommonAttachment> attachment) {
        this.attachment = attachment;
    }

    public List<Bank> getBank() {
        return bank;
    }

    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }

    public PersonalSshf getSshf() {
        return sshf;
    }

    public void setSshf(PersonalSshf sshf) {
        this.sshf = sshf;
    }

    public List<PersonalContacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<PersonalContacts> contacts) {
        this.contacts = contacts;
    }

    public PersonalOther getOther() {
        return other;
    }

    public void setOther(PersonalOther other) {
        this.other = other;
    }

    public List<PersonalCommunicationData> getCommunicationData() {
        return communicationData;
    }

    public void setCommunicationData(List<PersonalCommunicationData> communicationData) {
        this.communicationData = communicationData;
    }

    public List<PersonalCompany> getCompany() {
        return company;
    }

    public void setCompany(List<PersonalCompany> company) {
        this.company = company;
    }

    public PersonalIncome getIncome() {
        return income;
    }

    public void setIncome(PersonalIncome income) {
        this.income = income;
    }

    public List<PersonalCar> getCar() {
        return car;
    }

    public void setCar(List<PersonalCar> car) {
        this.car = car;
    }

    public List<PersonalAssets> getAssets() {
        return assets;
    }

    public void setAssets(List<PersonalAssets> assets) {
        this.assets = assets;
    }

    public PersonalAdditional getAdditional() {
        return additional;
    }

    public void setAdditional(PersonalAdditional additional) {
        this.additional = additional;
    }

}

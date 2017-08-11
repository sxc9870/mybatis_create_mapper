package lm;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class main {

    public static void main(String[] args) {
        // String url =
        // "http://localhost:8080/duoying-abs-ws/ws/rest/borrower/addPersonal";
        // String result = post(url,"{'name':'sxc'}");
        // System.out.println( (result));
        List<LoanInfo> list = new ArrayList<>();

        LoanInfo info = new LoanInfo();
        list.add(info);

        Object o = JSON.toJSON(list);
            System.out.println(o);
        JSONObject ii = (JSONObject) JSON.parseArray(o.toString()).get(0);
        JSONObject loanBase = ii.getJSONObject("loanBase");
        JSONObject disbursement = ii.getJSONObject("disbursement");
        JSONArray repaymentPlan = ii.getJSONArray("repaymentPlan");
        JSONArray pressRecord = ii.getJSONArray("pressRecord");
        JSONObject badDebt = ii.getJSONObject("badDebt");

        testDis(disbursement);
        testPlan(repaymentPlan.getJSONObject(0));
        testPress(pressRecord.getJSONObject(0));
        testBad(badDebt);
        testBase(loanBase);
        System.out.println();
        ;
    }

    private static void testBase(JSONObject object) {
        object.get("borrowerId").toString();
        object.get("businessNo").toString();
        object.get("contractNo").toString();
        object.get("businessSource").toString();
        object.get("loanType").toString();
        object.get("isNeedCollateralAudit").toString();
        object.get("loanInvest").toString();
        object.get("applyAmount").toString();
        object.get("loanPurpose").toString();
        object.get("loanTerm").toString();
        object.get("monthlyInterestRate").toString();
        object.get("overdueMonthlyInterestRate").toString();
        object.get("penaltyMonthlyInterestRate").toString();
        object.get("expectedMonthlyPayment").toString();
        object.get("repaymentDate").toString();
        object.get("applyDate").toString();
        object.get("guaranteeType").toString();
        object.get("repaymentType").toString();
        object.get("repaymentExecuteType").toString();
        object.get("commonAttachment").toString();
        object.get("investmentIntention").toString();
        object.get("calculationTimeType").toString();
        object.get("interestCalculationCycle").toString();
        object.get("repaymentCalculationType").toString();
        object.get("repaymentCycle").toString();
        object.get("cycleDayCount").toString();
        object.get("interestStartDateType").toString();
        object.get("isAvoidFestival").toString();
        object.get("isAllowAdvanceRepayment").toString();
        object.get("coborrower").toString();
        object.get("collateral").toString();
        object.get("remark").toString();

        object.getJSONArray("coborrower").getJSONObject(0).get("name").toString();
        object.getJSONArray("coborrower").getJSONObject(0).get("certificateType").toString();
        object.getJSONArray("coborrower").getJSONObject(0).get("certificateNo").toString();
        object.getJSONArray("coborrower").getJSONObject(0).get("phone").toString();
        object.getJSONArray("coborrower").getJSONObject(0).get("remark").toString();

        object.getJSONArray("collateral").getJSONObject(0).toString();
        object.getJSONArray("collateral").getJSONObject(0).get("name").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("collateralType").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("ownerName").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("ownerIdcardNo").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("newPrice").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("invoiceNo").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("valuation").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("mortgageAmount").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("commonAttachment").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("carInsurance").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("carArchives").toString();
        object.getJSONArray("collateral").getJSONObject(0).get("remark").toString();

        
        object.getJSONArray("costInfo").getJSONObject(0).toString();
        object.getJSONArray("costInfo").getJSONObject(0).get("billingType").toString();
        object.getJSONArray("costInfo").getJSONObject(0).get("computationalMethod").toString();
        object.getJSONArray("costInfo").getJSONObject(0).get("collectType").toString();
        object.getJSONArray("costInfo").getJSONObject(0).get("rate").toString();
        object.getJSONArray("costInfo").getJSONObject(0).get("remark").toString();
        
        
        object.getJSONArray("collateral").getJSONObject(0).getJSONArray("carInsurance").getJSONObject(0).get("brand").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONArray("carInsurance").getJSONObject(0).get("orderId").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONArray("carInsurance").getJSONObject(0).get("vinNo").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONArray("carInsurance").getJSONObject(0).get("reportCreateDate").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONArray("carInsurance").getJSONObject(0).get("claimSettlementSummary").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONArray("carInsurance").getJSONObject(0).get("remark").toString();

        object.getJSONArray("collateral").getJSONObject(0).getJSONObject( "carArchives").get("orderId").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("plateNumber").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("owner").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("idcardNo").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("brandCn").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("vehicleModel").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("vehicleIdentificationCode").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("engineNumber").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("useType").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("registrationAuthority").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("carColor").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("passengerCount").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("driverLicenseCode").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("initialRegistrationDate").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("registrationDate").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("scrapDate").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("insuranceValidityDate").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("verifyValidityDate").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("isNewEnergy").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("power").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("carStatus").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("accidentEscape").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("vehicleDeck").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("vehicleRobbery").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("mortgageSign").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("mortgageTime").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("mortgageHolder").toString();
        object.getJSONArray("collateral").getJSONObject(0).getJSONObject("carArchives").get("remark").toString();

    }
    // /**
    // * 以post方式访问
    // *
    // * @param url
    // * 接口url地址
    // * @param xmlBody
    // * xml格式的字符串
    // * @return
    // */
    // public static String post(String url, String xmlBody) {
    // HttpClient httpClient = new DefaultHttpClient();
    // try {
    // HttpPost httpPost = new HttpPost(url);
    //
    // StringEntity input = new StringEntity(xmlBody, "UTF-8");
    // input.setContentType("application/json");
    //
    // httpPost.setEntity(input);
    //
    // HttpResponse httpResponse = httpClient.execute(httpPost);
    // int statusCode = httpResponse.getStatusLine().getStatusCode();
    //
    // if (statusCode == HttpStatus.SC_OK) {
    // HttpEntity httpEntity = httpResponse.getEntity();
    // String result = EntityUtils.toString(httpEntity);
    // EntityUtils.consume(httpEntity);
    // return result;
    // }
    //
    // } catch (Exception ex) {
    // ex.printStackTrace();
    // } finally {
    // try {
    // httpClient.getConnectionManager().shutdown();
    // } catch (Exception ex) {
    // ex.printStackTrace();
    // }
    // }
    // return "";
    // }

    private static void testBad(JSONObject object) {
        object.get("pressCount").toString();
        object.get("repayedPrincipal").toString();
        object.get("repayedInterest").toString();
        object.get("repayedTotal").toString();
        object.get("unrepayPrincipal").toString();
        object.get("unrepayInterest").toString();
        object.get("unrepayTotal").toString();
        object.get("unrepayPeriod").toString();
        object.get("remark").toString();

    }

    private static void testPress(JSONObject object) {
        object.get("pressResult").toString();
        object.get("pressDate").toString();
        object.get("reason").toString();
        object.get("process").toString();
        object.get("repayIntention").toString();
        object.get("repayedPrincipal").toString();
        object.get("repayedInterest").toString();
        object.get("repayedTotal").toString();
        object.get("unrepayPrincipal").toString();
        object.get("unrepayInterest").toString();
        object.get("unrepayTotal").toString();
        object.get("unrepayPeriod").toString();
        object.get("remark").toString();

    }

    private static void testPlan(JSONObject object) {
        object.get("planStatus").toString();
        object.get("period").toString();
        object.get("repaymentDate").toString();
        object.get("repaymentPrincipal").toString();
        object.get("repaymentInterest").toString();
        object.get("repaymentCost").toString();
        object.get("repaymentTotal").toString();
        object.get("progress").toString();
        object.get("realRepaymentDate").toString();
        object.get("realRepaymentAmount").toString();

        object.getJSONObject("overdue").get("overdueDayCount").toString();
        object.getJSONObject("overdue").get("overdueAmount").toString();
        object.getJSONObject("overdue").get("repaymentPrincipal").toString();
        object.getJSONObject("overdue").get("repaymentInterest").toString();
        object.getJSONObject("overdue").get("repaymentCost").toString();
        object.getJSONObject("overdue").get("repaymentTotal").toString();
        object.getJSONObject("overdue").get("remark").toString();

        object.getJSONArray("repaymentRecord").getJSONObject(0).get("recordStatus").toString();
        object.getJSONArray("repaymentRecord").getJSONObject(0).get("repaymentDate").toString();
        object.getJSONArray("repaymentRecord").getJSONObject(0).get("repaymentPrincipal").toString();
        object.getJSONArray("repaymentRecord").getJSONObject(0).get("repaymentInterest").toString();
        object.getJSONArray("repaymentRecord").getJSONObject(0).get("repaymentCost").toString();
        object.getJSONArray("repaymentRecord").getJSONObject(0).get("repaymentTotal").toString();
        object.getJSONArray("repaymentRecord").getJSONObject(0).get("remark").toString();

        object.get("remark").toString();

    }

    private static void testDis(JSONObject disbursement) {
        disbursement.get("bank").toString();
        disbursement.get("disbursementStatus").toString();
        disbursement.get("contractNo").toString();
        disbursement.get("applyAmount").toString();
        disbursement.get("approvalAmount").toString();
        disbursement.get("preCostAmount").toString();
        disbursement.get("preInterest").toString();
        disbursement.get("realDisbursementAmount").toString();
        disbursement.get("payType").toString();
        disbursement.get("disbursementAmount").toString();
        disbursement.get("disbursementMonthlyInterestRate").toString();
        disbursement.get("disbursementDate").toString();
        disbursement.get("remark").toString();
    }
}

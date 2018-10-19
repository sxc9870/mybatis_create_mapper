import java.io.File;
import java.io.IOException;

public class XXx {
    public static void main(String[] args) throws IOException {
        File f=new File("d:\\xxx.txt");
        java.io.BufferedReader br=new java.io.BufferedReader(new java.io.FileReader(f));
        
        
        StringBuilder sb=new StringBuilder();
        java.util.List<String>ids=new java.util.ArrayList<>();
        String one="";
        while ((one=br.readLine())!=null) {
            ids.add(one);
        }
        File f2=new File("d:\\xxx2.txt");
        
        java.io.BufferedWriter bw=new java.io.BufferedWriter(new java.io.FileWriter(f2));
        ids.forEach(e->{
                sb.append(e+",");
              
        });
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    static String sql1="insert into ylc_money_coupon values (null,user_id,null,'SJ20180626-X-','直销银行升级福利',5,2,'2018-06-26 00:00:00','2018-07-10 23:59:59',null,5000,30,1,'直销银行升级福利',null,'1）单笔投资5000元抵扣5元；<br/>2）仅限购买智能30天以上产品；<br/>3）现金券不得转让、出借；<br/>4）逾期未使用、已使用但撤销购买的现金券由系统无偿收回；<br/>5）本平台拥有修改权、最终解释权。',null,null,null,1,null,null,null,1,null,'[{\"scope\":8,\"useTerm\":30,\"ids\":null,\"names\":null}]',null,null,now(),1);";
    static String sql2="insert into ylc_money_coupon values (null,user_id,null,'SJ20180626-X-','直销银行升级福利',15,2,'2018-06-26 00:00:00','2018-07-10 23:59:59',null,10000.00,30,1,'直销银行升级福利',null,'1）单笔投资10,000元抵扣15元；<br/>2）仅限购买智能30天以上产品；<br/>3）现金券不得转让、出借；<br/>4）逾期未使用、已使用但撤销购买的现金券由系统无偿收回；<br/>5）本平台拥有修改权、最终解释权。',null,null,null,1,null,null,null,1,null,'[{\"scope\":8,\"useTerm\":30,\"ids\":null,\"names\":null}]',null,null,now(),1);";
    static String sql3="insert into ylc_money_coupon values (null,user_id,null,'SJ20180626-X-','直销银行升级福利',30,2,'2018-06-26 00:00:00','2018-07-20 23:59:59',null,30000.00,60,1,'直销银行升级福利',null,'1）单笔投资60,000元抵扣30元；<br/>2）仅限购买智能60天以上产品；<br/>3）现金券不得转让、出借；<br/>4）逾期未使用、已使用但撤销购买的现金券由系统无偿收回；<br/>5）本平台拥有修改权、最终解释权。',null,null,null,1,null,null,null,1,null,'[{\"scope\":8,\"useTerm\":60,\"ids\":null,\"names\":null}]',null,null,now(),1);";
    static String sql4="insert into ylc_money_coupon values (null,user_id,null,'SJ20180626-X-','直销银行升级福利',50,2,'2018-06-26 00:00:00','2018-07-20 23:59:59',null,50000.00,60,1,'直销银行升级福利',null,'1）单笔投资50,000元抵扣50元；<br/>2）仅限购买智能60天以上产品；<br/>3）现金券不得转让、出借；<br/>4）逾期未使用、已使用但撤销购买的现金券由系统无偿收回；<br/>5）本平台拥有修改权、最终解释权。',null,null,null,1,null,null,null,1,null,'[{\"scope\":8,\"useTerm\":60,\"ids\":null,\"names\":null}]',null,null,now(),1);";
    
    
    
    
    
}

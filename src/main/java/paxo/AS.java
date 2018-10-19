package paxo;

public class AS {

    private static Part selectPart = null;

    public static void select(Part p) {
        if (selectPart != null) {
            if (p.getM() > selectPart.getM()) { // 如果[M0,V0]被选定,那么所有大于M0的,其值必须也是V0
                if (p.getV().equals(selectPart.getV())) {

                }
            }
        }else {
            selectPart=p;
        }
    }
    
    
    
    
    

    // P2C:对于任意M和V,如果[M1,V1]被提出,那么肯定存在一个由半数以上A组成的集合S,并且满足下面的任一
    public static java.util.List<A> S = new java.util.ArrayList<>();

    public static boolean checkS() {
        boolean check1 = true; // S中不存在任何批准过编号小于M1的A;
        for (A a : S) {
            if (a.getP().getM() < selectPart.getM()) {
                check1 = false;
                break;
            }
        }
        boolean check2 = true;
        A p = S.stream().max((a, b) -> {
            return a.getP().getM().compareTo(b.getP().getM());
        }).get(); // 选取S中所有A批准的 MAX(M) =V

        check2 = p.getP().getV().equals(selectPart.getV());
        return check1 || check2;
    }

    public static void prepare(Part p) {
        // TODO Auto-generated method stub
        
    }

}

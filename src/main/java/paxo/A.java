package paxo;

public class A {
    public Part getP() {
        return p;
    }

    public void setP(Part p) {
        this.p = p;
    }

    private Part p;

    public boolean setMV(Part p) {
        if (this.p == null) {
            this.p = p;
            return true;
        }
        return false;
    }

    public boolean accept(Part newP, Part selected) {//P2A如果[M0,V0]被选定,那么所有大于M0的,且A批准的提案,其值必须也是V0
        if (selected != null) {
            if (newP.getM() > selected.getM() && newP.getV().equals(selected.getV())) {
                return true;
            }
        }
        return false;
    }

}

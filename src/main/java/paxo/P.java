package paxo;

public class P {

    public Part createNewPart() {
        Part p = new Part();
        p.setM(++Main.id);
        p.setV(p.toString());
        
        
        
        
        AS.prepare(p);
        return p;
    }
    
    
}

package Entity;

import java.util.Vector;

public class Procedure {
    
    private String id;
    
    private String procName;
    
    private Vector<String> parameterLst;
    
    
    public Procedure() {
        super();
        this.id = null;
        this.procName = null;
        this.parameterLst = new Vector();
    }    
    

    public Procedure(String id, String procName, Vector<String> parameterLst) {
        super();
        this.id = id;
        this.procName = procName;
        this.parameterLst = parameterLst;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName;
    }

    public Vector<String> getParameterLst() {
        return parameterLst;
    }

    public void setParameterLst(Vector<String> parameterLst) {
        this.parameterLst = parameterLst;
    }
    
    
    

}

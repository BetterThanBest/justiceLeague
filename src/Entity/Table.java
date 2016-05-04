package Entity;

public class Table {
    private String id;
    private String tblName;
    private String SQLCmd;
    
    
    public Table() {
        super();
        this.id = null;
        this.tblName = null;
        SQLCmd = null;
    }
    
    
    public Table(String id, String tblName, String sQLCmd) {
        super();
        this.id = id;
        this.tblName = tblName;
        SQLCmd = sQLCmd;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTblName() {
        return tblName;
    }
    public void setTblName(String tblName) {
        this.tblName = tblName;
    }
    public String getSQLCmd() {
        return SQLCmd;
    }
    public void setSQLCmd(String sQLCmd) {
        SQLCmd = sQLCmd;
    }
    
    
}

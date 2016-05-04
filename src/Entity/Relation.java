package Entity;

import java.util.LinkedList;
import java.util.List;

public class Relation {
    
    private String relationId;
    
    private Table mainTable;
    
    private List<Table> referList;
    
    private String foreignKey;
    
    
    public Relation() {
        super();
        this.relationId = null;
        this.mainTable = new Table();
        this.referList = new LinkedList<Table>();
        this.foreignKey = null;
    }
    
    public Relation(String id, Table mainTable, List<Table> referList, String foreignKey) {
        super();
        this.relationId = id;
        this.mainTable = mainTable;
        this.referList = referList;
        this.foreignKey = foreignKey;
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public Table getMainTable() {
        return mainTable;
    }

    public void setMainTable(Table mainTable) {
        this.mainTable = mainTable;
    }

    public List<Table> getReferList() {
        return referList;
    }

    public void setReferList(List<Table> referList) {
        this.referList = referList;
    }

    public String getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(String foreignKey) {
        this.foreignKey = foreignKey;
    }
    
    

}

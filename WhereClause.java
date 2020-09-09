package ci.miage.agri.db.query;


public class WhereClause {


    String field ;
    String operator ;
    String value ;

    public WhereClause(String field , String value)
    {
        this.field = field;
        this.operator = "=";
        this.value = value;
    }

    public WhereClause(String field, String operator , String value)
    {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString()
    {
        return this.field + this.operator + "'"+this.value+"'";
    }
}

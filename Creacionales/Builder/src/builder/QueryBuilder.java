package builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class QueryBuilder {


    private String table;
    private ArrayList<String> fields;
    private ArrayList<String> conditions;
    private ArrayList<String> orderFields;
    private int limitCount;

    private StringBuilder colums  =  new StringBuilder();
    private StringBuilder filters =  new StringBuilder();
    private StringBuilder orders  =  new StringBuilder();

    public enum typeOrder{
        ASC,
        DESC
    }


    public QueryBuilder(String table){
        this.table       = table;
        this.fields      = new ArrayList<>();
        this.conditions  = new ArrayList<>();
        this.orderFields = new ArrayList<>();
    }

    public QueryBuilder setSelect(String...fields){

        this.fields.addAll(Arrays.asList(fields));
        return this;
    }

    public QueryBuilder setWhere(String...conditions){
        //Se puede hacer así o ir agregandolos a la lista como funciona el setOrder
        this.conditions.addAll(Arrays.asList(conditions));

        return this;

    }

    public QueryBuilder setOrder(String field, typeOrder order ){

        this.orderFields.add(field +" "+ order);

        return this;
    }

    public QueryBuilder setLimit (int limit){
        this.limitCount = limit;

        return this;
    }


    public void build(){

        //colums.delete(0, colums.length());

        colums.append(this.fields.size() == 0
                      ? "*"
                      : this.fields.stream().collect(Collectors.joining(","))
        );

        filters.append(this.conditions.size() == 0 ? " " : " WHERE "+this.conditions.stream().collect(Collectors.joining(" AND ")));  

        orders.append(this.orderFields.size() == 0
        ? " "
        : " ORDER BY " +this.orderFields.stream().collect(Collectors.joining(","))
        );

        System.out.println("SELECT "+colums+" FROM "+table+filters+orders+ (this.limitCount == 0 ? "" : " LIMIT "+this.limitCount) );

    }


}

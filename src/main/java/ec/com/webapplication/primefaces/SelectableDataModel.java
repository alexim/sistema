package ec.com.webapplication.primefaces;

public interface SelectableDataModel<T> {
    
    public Object getRowKey(T object);
    
    public T getRowData(String rowKey);
}
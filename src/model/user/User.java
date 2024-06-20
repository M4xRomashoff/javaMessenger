package model.user;

public interface User <T> extends Comparable <T>{

    public String getName();
    public void setName(String name);
    public long getId();
    public void setId(long id);
}

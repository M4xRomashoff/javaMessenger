package model.group;

import java.util.List;

public interface Group <T> extends Comparable <T> {
    String getGroupName();
    void setGroupName(String name);
    long getGroupId();
    void setGroupId(long l);
    String getName();
    void setName(String name);
    long getId();
    List<T> getMembers();

    void setId(long l);
}

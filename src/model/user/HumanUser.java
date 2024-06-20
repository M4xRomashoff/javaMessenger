package model.user;

import model.group.Group;

import java.io.Serializable;
import java.util.List;

public class HumanUser implements User, Group, Serializable {
    private long  id;;
    String name;

    public HumanUser(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getGroupName() {
        return "";
    }

    @Override
    public void setGroupName(String name) {

    }

    @Override
    public long getGroupId() {
        return 0;
    }

    @Override
    public void setGroupId(long l) {

    }

    @Override
    public List getMembers() {
        return List.of();
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}

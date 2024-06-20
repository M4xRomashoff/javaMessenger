package model.group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllMembers <T extends Group<T>> implements Serializable, Iterable<T>{
    private long userId;
    private List<T> userList;

    public AllMembers() { this(new ArrayList<>()); }
    public AllMembers(List<T> userList) {this.userList = userList;
    }

    public boolean addUser(T user) {

        if ( user == null ) return false;
        if (!userList.contains(user)){
             user.setId(userId ++);
             userList.add(user);
             return true;
        }
        return false;
    }

    @Override
    public String toString() { return getInfo(); }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("В Дереве ");
        sb.append(userList.size());
        sb.append(" объектов: \n");
        for (T user : userList) {
            sb.append(user.getName()).append(' ').append(user.getId());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new UserIterator<>(userList);
    }

}

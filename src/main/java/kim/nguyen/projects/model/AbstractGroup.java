package kim.nguyen.projects.model;

import java.util.Arrays;
import java.util.Comparator;

import kim.nguyen.projects.util.ArrayUtils;

public class AbstractGroup<T extends SocialEntity> implements SocialEntity {

    private long id;
    private String name;
    private T[] members;

    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds new person to the list of members only if the new person is not yet
     * in the list
     * 
     * @param person
     *            the new member who is added to the group
     */
    public void addMember(T member) {
        members = ArrayUtils.addElement(members, member, new Comparator<T>() {
            public int compare(T o1, T o2) {
                return ((o1.getId() > o2.getId()) ? 1 : ((o1.getId() == o2.getId()) ? 0 : -1));
            }
        });
    }

    /**
     * Returns the list of members that the group has currently have
     * 
     * @return an array of the members
     */
    public T[] getMembers() {
        return Arrays.copyOf(members, members.length);
    }

    public void setMembers(T[] members) {
        this.members = members;
    }

    public String toString() {
        return ("[id:" + this.getId() + " name:" + this.getName() + " members:" + Arrays.toString(this.getMembers())
                + "]");
    }
}

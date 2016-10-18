/**
 * Group.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects.model;

import java.util.Arrays;

import kim.nguyen.projects.util.Utils;

public class Group extends SocialEntity {

    /* Keeps tract of the number of groups created */
    private static long countGroup;

    private Person[] members = {};

    public Group(String name) {
        setName(name);
        setId(countGroup);
        countGroup++;
    }

    /**
     * Adds new person to the list of members only if the new person is not yet
     * in the list
     * 
     * @param person
     *            the new member who is added to the group
     */
    public void addMember(Person person) {
        members = Utils.addElement(members, person, new SocialEntityComparator());
    }

    /**
     * Returns the list of members that the group has currently have
     * 
     * @return an array of the members
     */
    public Person[] getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return ("[id:" + getId() + " name:" + getName() + " members:" + Arrays.toString(members) + "]");
    }
}

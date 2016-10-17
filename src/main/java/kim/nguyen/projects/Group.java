/**
 * Group.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects;

import java.util.Arrays;

public class Group implements SocialEntity {

    /* Keeps tract of the number of groups created */
    private static long countGroup;

    private long id;
    private String name;
    private Person[] members;

    /* The current number of members that the group has */
    private int numMembers = 0;

    Group(String name) {
        members = new Person[numMembers];
        this.name = name;
        id = countGroup;
        countGroup++;
    }

    public long getID() {
        return id;
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
    public void addMember(Person person) {
        SocialEntityComparator comparator = new SocialEntityComparator();
        Arrays.sort(members, comparator);
        if (Arrays.binarySearch(members, person, comparator) != 0) {
            members = Utils.resizeArray(members);
            members = Utils.addElement(members, person, numMembers);
            numMembers++;
        }
    }

    /**
     * Returns the list of members that the group has currently have
     * 
     * @return an array of the members
     */
    public Person[] getMembers() {
        return Arrays.copyOf(members, numMembers);
    }
}

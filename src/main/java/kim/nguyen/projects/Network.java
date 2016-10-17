/**
 * Network.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects;

import java.util.Arrays;

public class Network implements SocialEntity {

    /* Keeps tract of the number of network created */
    private static long countNetwork;

    // TODO: Similar to the issue in [Band] class
    /* The current number of members joining the network */
    private int numMembers = 0;

    private long id = 0;
    private String name;
    private Person[] members = {};

    Network(String name) {
        members = new Person[numMembers];
        this.name = name;
        id = countNetwork;
        countNetwork++;
    }
    
    // TODO: getID(): wrong of function name (can use Source > Generate Getters/Setters)
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
     * Adds a new person to the list of members, this function only be called
     * when the person join the network, assuming that the network cannot add
     * members by itself.
     * 
     * @param person
     *            the new person who wants to join the network
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
     * Returns the list of members who join the network
     * 
     * @return an array of the person who join the network
     */
    public Person[] getMembers() {
        return Arrays.copyOf(members, numMembers);
    }
    
    public String toString() {
        // TODO: You can save your LOC by returning the result directly without temporary variable [result]
        String result = "[id:" + id + " name:" + name + " members:" + Arrays.toString(members) +"]";
        return result;
    }
}

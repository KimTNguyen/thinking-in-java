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

    private long id = 0;
    private String name;
    private Person[] members = {};

    Network(String name) {
        this.name = name;
        id = countNetwork;
        countNetwork++;
    }
    
    public long getId() {
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
        members = Utils.addElement(members, person, comparator);
    }

    /**
     * Returns the list of members who join the network
     * 
     * @return an array of the person who join the network
     */
    public Person[] getMembers() {
        return Arrays.copyOf(members, members.length);
    }
    
    public String toString() {
        return ("[id:" + id + " name:" + name + " members:" + Arrays.toString(members) +"]");
    }
}

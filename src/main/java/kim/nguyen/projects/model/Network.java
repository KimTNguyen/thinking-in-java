/**
 * Network.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects.model;

import java.util.Arrays;

import kim.nguyen.projects.util.Utils;

public class Network extends SocialEntity {

    /* Keeps tract of the number of network created */
    private static long countNetwork;

    private Person[] members = {};

    public Network(String name) {
        setName(name);
        setId(countNetwork);
        countNetwork++;
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
        members = Utils.addElement(members, person, new SocialEntityComparator());
    }

    /**
     * Returns the list of members who join the network
     * 
     * @return an array of the person who join the network
     */
    public Person[] getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return ("[id:" + getId() + " name:" + getName() + " members:" + Arrays.toString(members) + "]");
    }
}

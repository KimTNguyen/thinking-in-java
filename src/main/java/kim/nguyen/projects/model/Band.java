/**
 * Band.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects.model;

import java.util.Arrays;

import kim.nguyen.projects.util.Utils;

public class Band extends SocialEntity {

    /* Keeps tract of the number of bands created */
    private static long countBand;

    private Person[] fans = {};
    private Person[] members = {};
    private String description;
    private String location;

    public Band(String name, String description, String location) {
        setId(countBand);
        setName(name);
        this.description = description;
        this.location = location;
        countBand++;
    }

    /**
     * Returns the list of people who currently follow the band
     * 
     * @return the array of fan members
     */
    public Person[] getFans() {
        return fans;
    }

    /**
     * Adds the new fan only if the fan is not yet in the list of fans
     * 
     * @param fans
     *            the new fan
     */
    public void addFans(Person fan) {
        fans = Utils.addElement(fans, fan, new SocialEntityComparator());
    }

    /**
     * Adds the new member only if the member is not yet in the list of members
     * 
     * @param member
     *            the new member
     */
    public void addMember(Person member) {
        members = Utils.addElement(members, member, new SocialEntityComparator());
    }

    /**
     * Returns the number of members who are currently in the members list
     * 
     * @return the array of member list
     */
    public Person[] getMembers() {
        return members;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return ("[id:" + getId() + " name:" + getName() + " members:" + Arrays.toString(members) + " fans:"
                + fans.length + "]");
    }
}

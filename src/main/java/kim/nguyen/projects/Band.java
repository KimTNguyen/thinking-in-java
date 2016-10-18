/**
 * Band.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects;

import java.util.Arrays;

public class Band implements SocialEntity {

    /* Keeps tract of the number of bands created */
    private static long countBand;

    private long id = 0;
    private String name;
    private Person[] fans = {};
    private Person[] members = {};
    private String description;
    private String location;

    Band(String name, String description, String location) {
        id = countBand;
        countBand++;
        this.name = name;
        this.description = description;
        this.location = location;
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
     * Returns the list of people who currently follow the band
     * 
     * @return the array of fan members
     */
    public Person[] getFans() {
        return Arrays.copyOf(fans, fans.length);
    }

    /**
     * Adds the new fan only if the fan is not yet in the list of fans
     * 
     * @param fans
     *            the new fan
     */
    public void addFans(Person fan) {
        fans = Utils.addElement(fans, fan, comparator);
    }

    /**
     * Adds the new member only if the member is not yet in the list of members
     * 
     * @param member
     *            the new member
     */
    public void addMember(Person member) {
        members = Utils.addElement(members, member, comparator);
    }

    /**
     * Returns the number of members who are currently in the members list
     * 
     * @return the array of member list
     */
    public Person[] getMembers() {
        return Arrays.copyOf(members, members.length);
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
}

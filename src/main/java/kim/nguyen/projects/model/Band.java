/**
 * Band.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects.model;

import java.util.Arrays;
import java.util.Comparator;

import kim.nguyen.projects.util.ArrayUtils;

public class Band extends AbstractGroup<SocialEntity> {

    /* Keeps tract of the number of bands created */
    private static long countBand;

    private Person[] fans = {};
    private String description;
    private String location;

    public Band(String name, String description, String location) {
        this.setId(countBand++);
        this.setName(name);
        this.setMembers(new Band[1]);
        this.description = description;
        this.location = location;
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
        fans = ArrayUtils.addElement(fans, fan, new Comparator<Person>() {
            //TODO: duplicate comparator code ;(
            public int compare(Person o1, Person o2) {
                return ((o1.getId() > o2.getId()) ? 1 : ((o1.getId() == o2.getId()) ? 0 : -1));
            }
        });
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

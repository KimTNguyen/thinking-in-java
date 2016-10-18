/**
 * Person.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects;

import java.util.Arrays;

public class Person implements SocialEntity {

    /* Keeps tract of the number of people created */
    private static long countPerson;

    private long id;
    private String name;
    private String location;

    /* A list of friends or people that the person follows */
    private Person[] acquaintances = {};

    /* A list of networks that the person joins */
    private Network[] networks = {};

    Person(String name, String location) {
        this.name = name;
        this.location = location;
        id = countPerson;
        countPerson++;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Adds new acquaintance to the list of acquaintances only when the new
     * person has not yet been in the acquaintances list, assuming one cannot
     * add themselves and that the person is added will also add this person to
     * their acquaintances list
     * 
     * @param person
     *            the new acquaintance that the person wants to add
     */
    public void addAcquaintance(Person person) {

        /*
         * Adds acquaintance can only be performed if the person is not
         * themselves
         */
        if (!this.equals(person)) {
            int numAcquaintances = acquaintances.length;
            acquaintances = Utils.addElement(acquaintances, person, comparator);

            /*
             * If the new person is added to the list of acquaintances, then the
             * person should also update their acquaintances list.
             */
            if (numAcquaintances < acquaintances.length) {

                /* Update the acquaintances list of another person */
                person.addAcquaintance(this);
            }
        }
    }

    /**
     * Adds a new network to the list of networks only when the person has not
     * yet been a member of the network. Updates the members of the network if
     * the person joins the network successfully.
     * 
     * @param network
     *            the new network that the person wants to join
     */
    public void addNetwork(Network network) {
        int numNetworks = networks.length;
        networks = Utils.addElement(networks, network, comparator);
        
        /*
         * If the person joins the network, the network should also update its
         * members list.
         */
        if (numNetworks < networks.length) {

            /* Updates the members of the network */
            network.addMember(this);
        }
    }

    /**
     * Returns the list of the networks that the person has currently joined
     * 
     * @return the array of the networks
     */
    public Network[] getNetworks() {
        return Arrays.copyOf(networks, networks.length);
    }

    /**
     * Returns the list of the acquaintances that the person has currently have
     * 
     * @return the array of the acquaintances
     */
    public Person[] getAcquaintances() {
        return Arrays.copyOf(acquaintances, acquaintances.length);
    }

    public String toString() {
        return ("[id:" + id + " name:" + name + " location:" + location + "]");
    }
}

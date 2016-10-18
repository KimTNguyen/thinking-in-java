/**
 * Network.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects.model;

public class Network extends AbstractGroup<SocialEntity> {

    /* Keeps tract of the number of networks created */
    private static long countNetwork;

    public Network(String name) {
        this.setName(name);
        this.setId(countNetwork++);
        this.setMembers(new Network[1]);
    }
}

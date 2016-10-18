/**
 * Group.java This is an implementation of SocialEntity.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects.model;

public class Group extends AbstractGroup<SocialEntity> {
    
    /* Keeps tract of the number of groups created */
    private static long countGroup;

    public Group(String name) {
        this.setName(name);
        this.setId(countGroup++);
        this.setMembers(new Group[1]);
    }
}

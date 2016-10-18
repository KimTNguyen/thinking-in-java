/**
 * ISocialEntity.java This is an interface that gives the basic model for 
 * anything in the social network.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects.model;

public interface SocialEntity {
    long getId();

    String getName();

    void setName(String name);
}
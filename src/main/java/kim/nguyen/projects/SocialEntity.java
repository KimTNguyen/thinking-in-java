/**
 * ISocialEntity.java This is an interface that gives the basic model for 
 * anything in the social network.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects;

import java.util.Comparator;

public interface SocialEntity {
    long getId();
    String getName();
    void setName(String name);
}

class SocialEntityComparator implements Comparator<SocialEntity> {
    public int compare(SocialEntity o1, SocialEntity o2) {
        return ((o1.getId() > o2.getId()) ? 1 : ((o1.getId() == o2.getId()) ? 0 : -1));
    }
}
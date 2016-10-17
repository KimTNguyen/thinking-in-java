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
    public long getID();
    public String getName();
    public void setName(String name);
}

class SocialEntityComparator implements Comparator<SocialEntity> {
    public int compare(SocialEntity o1, SocialEntity o2) {
        return ((o1.getID() > o2.getID()) ? 1 : ((o1.getID() == o2.getID()) ? 0 : -1));
    }
}
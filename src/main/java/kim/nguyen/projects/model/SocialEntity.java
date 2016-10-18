/**
 * ISocialEntity.java This is an interface that gives the basic model for 
 * anything in the social network.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects.model;

import java.util.Comparator;

public abstract class SocialEntity {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String toString();
}

class SocialEntityComparator implements Comparator<SocialEntity> {
    public int compare(SocialEntity o1, SocialEntity o2) {
        return ((o1.getId() > o2.getId()) ? 1 : ((o1.getId() == o2.getId()) ? 0 : -1));
    }
}

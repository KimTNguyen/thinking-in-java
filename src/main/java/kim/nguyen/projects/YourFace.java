package kim.nguyen.projects;

import java.util.Arrays;

public class YourFace {

    public static void main(String[] args) {

        // Creates seven Persons
        Person one = new Person("Thy", "Saigon");
        Person two = new Person("Kim", "Saigon");
        Person three = new Person("Nguyen", "Saigon");
        Person four = new Person("Mai", "Saigon");
        Person five = new Person("Doan", "Saigon");
        Person six = new Person("Thao", "Saigon");
        Person seven = new Person("Long", "Saigon");

        // Creates two networks
        Network net1 = new Network("net1");
        Network net2 = new Network("net2");

        // Creates two groups
        Group grp1 = new Group("group1");
        Group grp2 = new Group("group2");

        // Creates two bands
        Band b1 = new Band("band1", "rock", "SJ");
        Band b2 = new Band("band2", "pop", "SJ");

        // Adds 3 acquaintances to each person
        one.addAcquaintance(two);
        one.addAcquaintance(three);
        one.addAcquaintance(seven);
        one.addAcquaintance(three);
        two.addAcquaintance(three);
        two.addAcquaintance(four);
        three.addAcquaintance(four);
        four.addAcquaintance(one);
        five.addAcquaintance(six);
        five.addAcquaintance(seven);
        five.addAcquaintance(four);
        six.addAcquaintance(one);
        six.addAcquaintance(two);
        seven.addAcquaintance(four);
        seven.addAcquaintance(three);

        // Three people join each network
        one.addNetwork(net1);
        two.addNetwork(net1);
        three.addNetwork(net1);
        four.addNetwork(net2);
        five.addNetwork(net2);
        six.addNetwork(net2);
        seven.addNetwork(net2);

        // Assigns at least 3 members for each group
        grp1.addMember(one);
        grp1.addMember(two);
        grp1.addMember(four);
        grp2.addMember(three);
        grp2.addMember(four);
        grp2.addMember(five);
        grp2.addMember(six);
        grp1.addMember(seven);

        // Assigns members and fans for bands
        b1.addFans(seven);
        b1.addFans(six);
        b1.addFans(five);
        b1.addFans(four);
        b2.addFans(three);
        b2.addFans(one);
        b1.addMember(two);
        b1.addMember(four);
        b2.addMember(seven);
        b2.addMember(six);

        // Prints out all of the properties of each person in the network
        printPersonInfo(one);
        printPersonInfo(two);
        printPersonInfo(three);
        printPersonInfo(four);
        printPersonInfo(five);
        printPersonInfo(six);
        printPersonInfo(seven);
    }

    /**
     * Prints out all of the properties of the person
     * 
     * @param person
     *            the person whose info will be printed out
     */
    private static void printPersonInfo(Person person) {
        System.out.println("======================================");
        System.out.println("id: " + person.getID());
        System.out.println("name: " + person.getName());
        System.out.println("location: " + person.getLocation());
        System.out.println("acquaintance: " + Arrays.toString(person.getAcquaintances()));
        System.out.println("network: " + Arrays.toString(person.getNetworks()));
        System.out.println("======================================");
    }
}

package nl.hossein.boilerplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: hossein
 * Date: 5/26/13
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */
public enum SecurityLevel {

    LOW("low"),
    HIGH("high"),
    MEDIUM("medium");

    private final String name;

    SecurityLevel(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SecurityLevel fromString(String name){
        // TODO: handle the cases when the name is not found
        return SecurityLevel.valueOf(name);

    }
}

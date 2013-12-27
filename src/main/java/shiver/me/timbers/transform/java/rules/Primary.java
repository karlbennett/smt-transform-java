package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Primary extends CompositeTransformation {
    public static final String NAME = "primary";

    public Primary(Applyer applyer) {
        super(NAME, applyer);
    }
}
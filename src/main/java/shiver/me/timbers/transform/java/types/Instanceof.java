package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Instanceof extends CompositeTransformation {
    public static final String NAME = "'instanceof'";

    public Instanceof(Applyer applyer) {
        super(NAME, applyer);
    }
}
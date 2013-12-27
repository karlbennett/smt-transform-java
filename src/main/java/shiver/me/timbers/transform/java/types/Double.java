package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Double extends CompositeTransformation {
    public static final String NAME = "'double'";

    public Double(Applyer applyer) {
        super(NAME, applyer);
    }
}
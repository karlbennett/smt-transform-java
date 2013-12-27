package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Block extends CompositeTransformation {
    public static final String NAME = "block";

    public Block(Applyer applyer) {
        super(NAME, applyer);
    }
}
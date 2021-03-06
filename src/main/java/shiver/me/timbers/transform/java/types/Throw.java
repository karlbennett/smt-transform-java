package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Throw extends CompositeTokenTransformation {
    public static final String NAME = "'throw'";

    public Throw(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Else extends CompositeTokenTransformation {
    public static final String NAME = "'else'";

    public Else(TokenApplier applier) {
        super(NAME, applier);
    }
}

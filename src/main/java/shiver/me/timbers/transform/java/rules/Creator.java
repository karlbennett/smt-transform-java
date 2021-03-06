package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Creator extends CompositeTokenTransformation {
    public static final String NAME = "creator";

    public Creator(TokenApplier applier) {
        super(NAME, applier);
    }
}

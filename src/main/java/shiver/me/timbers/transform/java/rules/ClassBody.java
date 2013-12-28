package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ClassBody extends CompositeTokenTransformation {
    public static final String NAME = "classBody";

    public ClassBody(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class EnumConstantName extends CompositeTokenTransformation {
    public static final String NAME = "enumConstantName";

    public EnumConstantName(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class CreatedName extends CompositeTokenTransformation {
    public static final String NAME = "createdName";

    public CreatedName(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class LastFormalParameter extends CompositeTokenTransformation {
    public static final String NAME = "lastFormalParameter";

    public LastFormalParameter(TokenApplier applier) {
        super(NAME, applier);
    }
}

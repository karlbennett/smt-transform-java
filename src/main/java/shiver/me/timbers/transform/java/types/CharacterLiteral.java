package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class CharacterLiteral extends CompositeTokenTransformation {
    public static final String NAME = "CharacterLiteral";

    public CharacterLiteral(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SwitchLabel extends CompositeTokenTransformation {
    public static final String NAME = "switchLabel";

    public SwitchLabel(TokenApplier applier) {
        super(NAME, applier);
    }
}

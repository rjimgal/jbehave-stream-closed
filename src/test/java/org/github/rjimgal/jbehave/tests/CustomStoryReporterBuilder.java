package org.github.rjimgal.jbehave.tests;

import org.jbehave.core.reporters.StoryReporterBuilder;

public class CustomStoryReporterBuilder extends StoryReporterBuilder {

    public CustomStoryReporterBuilder() {
        super.withDefaultFormats().withFormats(Format.STATS, Format.XML, Format.HTML).withFailureTrace(true);
    }

}

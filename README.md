# jbehave-stream-closed

This maven project reproduces the issue in JBehave, that tries to write to an already closed stream, after a Story Restart happens.

## Run using IDE

You need to debug the project, breaking whenever an IOException occurs.

For Eclipse, you can follow: http://stackoverflow.com/questions/3066199/eclipse-break-when-exception-is-thrown

Then in `TestRunner` Class, `Debug As` -> `JUnit Test`

An `IOException` will be thrown in `PrintStream` Class, due to `OutputStream` already closed. Exception is silently catch by `PrintStream` which only marks trouble flag.

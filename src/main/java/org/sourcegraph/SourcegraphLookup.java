package org.sourcegraph;

public class SourcegraphLookup {
    public Record getRecordById(final int id) {
        return new Record(id, "some name", "some location");
    }
}

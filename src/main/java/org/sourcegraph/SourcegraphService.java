package org.sourcegraph;

public class SourcegraphService {
    public Record getRecordById(final int id) {
        return new Record(id, "some name", "some location");
    }
}

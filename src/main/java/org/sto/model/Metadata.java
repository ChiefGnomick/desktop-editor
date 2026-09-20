package org.sto.model;

public record Metadata(
    String documentType,
    String university,
    String faculty,
    String department,
    String topic,
    String student,
    String supervisor,
    String year
) {
}

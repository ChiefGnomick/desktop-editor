package org.sto.model;

public record ListItemBlock(
    ListType type,
    String marker,
    String text
) implements Block {}
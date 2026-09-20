package org.sto.model;

import java.util.List;

public record ListBlock(
    List<ListItemBlock> items
) implements Block {}
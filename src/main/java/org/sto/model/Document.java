package org.sto.model;

import java.util.List;

public record Document(Metadata metadata, List<Block> blocks) {
    
}
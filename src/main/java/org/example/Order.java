package org.example;

import java.util.List;

public record Order(
        Product products,
        String id
) {
}

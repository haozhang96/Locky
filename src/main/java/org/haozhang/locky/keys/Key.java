package org.haozhang.locky.keys;

public abstract class Key {
    private final int hash;

    protected Key(int hash) {
        this.hash = hash;
    }

    @Override
    public int hashCode() {
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        return other == this || other instanceof Key && other.hashCode() == hashCode();
    }

    //==============================================================================================
    // Helper Methods
    //==============================================================================================

    protected static <T> T nonNull(T value) {
        return nonNull(value, "value");
    }

    protected static <T> T nonNull(T value, String name) {
        if (value == null) {
            throw new IllegalArgumentException("The " + name + " cannot be null.");
        }
        return value;
    }
}

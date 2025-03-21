package com.design_patterns.demo.structural.adapter.example2;


/**
 * Adapter class. Adapts the interface of the device ({@link FishingBoat}) into {@link RowingBoat}
 * interface expected by the client ({@link Captain}).
 */
public class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat boat = new FishingBoat();

    public final void row() {
        boat.sail();
    }
}
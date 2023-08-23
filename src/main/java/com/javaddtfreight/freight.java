package com.javaddtfreight;

public class freight {

    public static double freightCalculation(double distance, double weight, int volume) {

        // calculates the cost by distance
        double costPerDistance;
        if (distance <= 10.0) {
            costPerDistance = 8.0;
        } else if (distance <= 40.0) {
            costPerDistance = 20.0;
        } else if (distance <= 100.0) {
            costPerDistance = 45.0;
        } else {
            // distances greater than 100 km are not supported.
            throw new IllegalArgumentException("The distance is too long. It is not possible to calculate the freight cost.");
        }

        // calculates the cost by weight
        double costPerWeight;
        if (weight <= 1.0) {
            costPerWeight = 1.0;
        } else if (weight <= 2.0) {
            costPerWeight = 1.5;
        } else if (weight <= 5.0) {
            costPerWeight = 4.0;
        } else if (weight <= 10.0) {
            costPerWeight = 10.0;
        } else {
            // weights greater than 10 kg are not supported.
            throw new IllegalArgumentException("The weight is too long. It is not possible to calculate the freight cost.");
        }

        // calculates the cost by volume
        double costPerVolume = switch (volume) {
            case 1 -> 1.0;
            case 2 -> 1.5;
            case 3 -> 3.0;
            case 4 -> 8.0;
            default ->
                // invalid volume types are not supported.
                    throw new IllegalArgumentException("The volume type is invalid. It is not possible to calculate the freight cost.");
        };

        // calculates the costs per distance, weight and volume to the total freight and returns it
        return costPerDistance * costPerWeight * costPerVolume;
    }
}

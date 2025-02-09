package hello;

import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        if (stops == null || stops.isEmpty()) {
            return 0; // Handle null or empty input
        }

        int passengerCount = 0;

        for (int[] stop : stops) {
            if (stop == null || stop.length < 2) {
                continue; 
            }

            int x = stop[0]; // Number of passengers boarding
            int y = stop[1]; // Number of passengers leaving

            passengerCount += x;
            passengerCount -= y;
        }

        return passengerCount;
    }
}

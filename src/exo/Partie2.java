package exo;

import models.Trip;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Partie2 {

    Function<Trip, String> getCity = Trip::city;

    Function<Trip, String> getDriverId = Trip::driverId;

    Function<Trip, Double> getPrice = Trip::price;

    Function<Trip, Double> getDuration = Trip::durationMin;

    public Map<String, Long> countByCity(List<Trip> trips) {
        return trips.stream()
                .collect(Collectors.groupingBy(getCity, Collectors.counting()));
    }

    public Map<String, Double> revenueByDriver(List<Trip> trips) {
        return trips.stream()
                .collect(Collectors.groupingBy(getDriverId, Collectors.summingDouble(getPrice::apply)));
    }

    public Map<String, Double> avgDurationByCity(List<Trip> trips) {
        return trips.stream()
                .collect(Collectors.groupingBy(getCity, Collectors.averagingDouble(getDuration::apply)));
    }
}

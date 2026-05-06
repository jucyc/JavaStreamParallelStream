/* */
import exo.Partie1;
import exo.Partie2;
import exo.Partie3;
import exo.Partie4;
import factory.TripFactory;
import models.Trip;

import java.util.List;

void main() {
    List<Trip> trips = TripFactory.generateTrips(100);

    Partie1 p1 = new Partie1();
    System.out.println("=== PARTIE 1 ===");
    System.out.println("longAndExpensiveTrips: " + p1.longAndExpensiveTrips(trips).size());
    System.out.println("badTrips: " + p1.badTrips(trips).size());
    System.out.println("recentTrips: " + p1.recentTrips(trips).size());

    Partie2 p2 = new Partie2();
    System.out.println("\n=== PARTIE 2 ===");
    System.out.println("countByCity: " + p2.countByCity(trips));
    System.out.println("revenueByDriver (first 3): " + p2.revenueByDriver(trips).entrySet().stream().limit(3).toList());
    System.out.println("avgDurationByCity: " + p2.avgDurationByCity(trips));

    Partie3 p3 = new Partie3();
    System.out.println("\n=== PARTIE 3 ===");
    System.out.println("top10ExpensiveTrips count: " + p3.top10ExpensiveTrips(trips).size());
    System.out.println("bestTrip: " + p3.bestTrip(trips));

    Partie4 p4 = new Partie4();
    System.out.println("\n=== PARTIE 4 ===");
    System.out.println("totalRevenueSequential: " + p4.totalRevenueSequential(trips));
    System.out.println("totalRevenueParallel: " + p4.totalRevenueParallel(trips));
    System.out.println("countByCityParallel: " + p4.countByCityParallel(trips));
    System.out.println("premiumTripsParallel: " + p4.premiumTripsParallel(trips).size());
}

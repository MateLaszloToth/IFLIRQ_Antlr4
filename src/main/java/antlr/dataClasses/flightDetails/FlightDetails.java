package antlr.dataClasses.flightDetails;

public class FlightDetails {
    Airline airline;
    Flight flight;
    Departure departure;

    public FlightDetails(
            Airline airline,
            Flight flight,
            Departure departure
    ){
     this.airline = airline;
     this.flight = flight;
     this.departure = departure;
    }
}

package antlr.dataClasses.requestOriginator;

import antlr.dataClasses.requestOriginator.locationDetails.LocationDetails;

public class RequestOriginator {
     public DeliverySystemParty deliverySystemParty;
     public Agent agent;
     public LocationDetails locationDetails;
     public AccessAuthorization accessAuthorization;

     public RequestOriginator(
             DeliverySystemParty deliverySystemParty,
             Agent agent,
             LocationDetails locationDetails,
             AccessAuthorization accessAuthorization
     ){
         this.deliverySystemParty = deliverySystemParty;
         this.agent = agent;
         this.locationDetails = locationDetails;
         this.accessAuthorization = accessAuthorization;
     }
}

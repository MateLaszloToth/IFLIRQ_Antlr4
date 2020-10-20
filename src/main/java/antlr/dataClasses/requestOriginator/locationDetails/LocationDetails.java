package antlr.dataClasses.requestOriginator.locationDetails;

public class LocationDetails {
    public CountryCode countryCode;
    public CurrencyCode currencyCode;
    public LanguageCode languageCode;

    public LocationDetails(
            CountryCode countryCode,
            CurrencyCode currencyCode,
            LanguageCode languageCode
    ){
        this.countryCode = countryCode;
        this.currencyCode = currencyCode;
        this.languageCode = languageCode;
    }
}

public class Mediator {

	private AmericanSeller americanSeller;
	private SwedishBuyer swedishBuyer;
	private FrenchBuyer frenchBuyer;
	private DollarConverter dollarConverter;

	public void registerAmericanSeller(AmericanSeller americanSeller) {
		this.americanSeller = americanSeller;
	}

	public void registerSwedishBuyer(SwedishBuyer swedishBuyer) {
		this.swedishBuyer = swedishBuyer;
	}

	public void registerFrenchBuyer(FrenchBuyer frenchBuyer) {
		this.frenchBuyer = frenchBuyer;
	}

	public void registerDollarConverter(DollarConverter dollarConverter) {
		this.dollarConverter = dollarConverter;
	}

	public boolean placeBid(float bid, String unitOfCurrency) {
		float bidInDollars = dollarConverter.convertCurrencyToDollars(bid, unitOfCurrency);
		return americanSeller.isBidAccepted(bidInDollars);
	}
}

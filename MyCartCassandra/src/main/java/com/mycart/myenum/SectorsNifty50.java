package com.mycart.myenum;

public enum SectorsNifty50 {

	PetroleumProducts("Petroleum Products"),
	Bank("Bank"),
	Finance("Finance"),
	Automobile("Automobile"),
	Telecom("Telecommunication - Service Provider"),
	Refineries("Refineries"),
	Paints("Paints"),
	TransportInfrastructure("Transport Infrastructure"),
	ConsumerFood("Consumer Food"),
	PharmaceuticalsDrugs("Pharmaceuticals & Drugs"),
	Coal("coal"),
	Diversified("Diversified"),
	ITServicesConsulting("IT Services & Consulting"),
	LifeHealthInsurANCE("Life & Health Insurance"),
	IronSteel("Iron & Steel"),
	HouseholdPersonalProducts("Household & Personal Products"),
	CigarettesTobacco("Cigarettes/Tobacco"),
	EngineeringConstruction("Engineering & Construction"),
	PowerGenerationDistribution("Power Generation/Distribution"),
	OilExploration("Oil Exploration and Production"),
	Cement("Cement"),
	ConsumerProducts("Tea/Coffee"),
	DiamondJewwllery("Diamond & Jewellery"),
	PesticidesAgrochemicals("Pesticides & Agrochemicals");	
	

	private String sectorName;

	private SectorsNifty50(String sectorName) {
		this.sectorName = sectorName;
	}

	/**
	 * @return the sectorName
	 */
	public String getSectorName() {
		return sectorName;
	}

	/**
	 * @param sectorName the sectorName to set
	 */
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

}

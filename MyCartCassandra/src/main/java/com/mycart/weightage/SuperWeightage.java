package com.mycart.weightage;

public interface SuperWeightage {

	interface Finance {
		interface hdfc {
			String symbol ="HDFCBANK";
			Double weightage = 10.98d; 	 
		}
		interface HdfcCorpLtd {
			String symbol ="HDFC";
			Double weightage = 	8.31d; 	 
		}
		
		interface HDFCLIFE {
			String symbol ="HDFCLIFE";
			Double weightage = 0.83d; 	 
		}
		interface ICICIBANK {
			String symbol ="ICICIBANK";
			Double weightage = 6.95d; 	 
		}
		interface KOTAKBANK {
			String symbol ="KOTAKBANK";
			Double weightage = 4.49d; 	 
		}
		interface StatbeBankOfIndia {
			String symbol ="SBIN";
			Double weightage = 2.55d; 	 
		}
		interface SBILIFE {
			String symbol ="SBIN";
			Double weightage = 2.55d; 	 
		}
		interface INDUSINDBANK{
			String symbol ="SBIN";
			Double weightage = 2.55d; 	 
		}	
	}
}

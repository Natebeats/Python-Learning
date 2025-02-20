package day0602.taschenrechner2;

public class TaschenrechnerRechenwerk {

	private String zahlMerken = "";
	private String operatorMerken = "";

	public String eingabeZahl(String zahl) throws TaschenrechnerException {
		if(zahlMerken.isBlank()) {
			this.zahlMerken = zahl;
			return "";
		} else {
			
			if(!operatorMerken.isEmpty()) {
				int izahl1 = Integer.parseInt(zahlMerken);
				int izahl2 = Integer.parseInt(zahl);

				int erg = 0;
				switch(operatorMerken) {
				case "+":
					erg = izahl1 + izahl2;
					break;
				case "-":
					erg =  izahl1 - izahl2 ;
					break;
				case "/":
					if(izahl2 == 0) {
						throw new TaschenrechnerException("Divsion by Zero");
					}
					erg =  izahl1 / izahl2 ;
					break;
				case "*":
					erg = izahl1 * izahl2;
					break;
				
				}
				zahlMerken = ""+erg;
				return ""+erg;
			} else {
				throw new TaschenrechnerException("missing Operator ");
			}
		}
		
	};
	
	public void eingabeOperator(String operator) {
		this.operatorMerken = operator;
	};
	
}

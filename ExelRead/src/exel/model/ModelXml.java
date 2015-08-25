package exel.model;

public class ModelXml {

	private String source;
	
	public String setSource(int idx ,String price, String kod, String title){
		
		String source = 
				"<product idx=\""+idx+"\" unitType=\"jednostkaMiary\" vatRate=\"8%\" price=\""+price+"\" initialVolume=\"100000\" symbol=\""+kod+"\" categoryId=\"kat\" requiredMultiplicity= \"6\" > \n"
				+ "<name>\n"
				+ 	"<![CDATA["+title+"]]>\n"
				+ "</name>\n"
				+ "	<description>\n"
				+ "		<![CDATA[\n"
				+ "		<div style=\"padding: 10px 10px 10px 10px; ; width: 960px; height: auto; align-items: center; margin-left: 40px; margin-top: 30px; font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif; font-style: normal; font-weight: normal; font-size: 16px;\">\n"
				+ "		<div style=\"width:200px; margin-right:30px;position: absolute;\"><img src=\"photo__________\" width=\"300\"/></div>\n"
				+ "			<div style=\"width: 600px; font-weight: normal; margin-left:10px;position: absolute;left: 400px;\">\n"
				+ "\n"
				+ "\n"
				+ "				<p style=\"font-style: normal; font-weight: normal;\"><span style=\"font-weight: bold; font-size: 18px;\">W³aœciwoœci :</span> </p>\n"
				+ "				<div style=\"width: 600px; font-weight: normal;float: left\">\n"
				+ "\n"
				+ "					<p><span style=\"font-weight: font-size: 18px;\">Serwety dentystyczne Classic to najbardziej popularny produkt dla stomatologii.</span> </p>\n"
				+ "					<p><span style=\"font-weight: font-size: 18px;\">Estetycznie zapakowany w postaci pude³ek, które jednoczeœnie mog¹ pe³niæ funkcjê podajnika.</span></p>\n"
				+ "					<p><span style=\"font-weight: font-size: 18px;\">W jednym pude³ku znajduje sie 80 sztuk serwet</span></p> \n"
				+ "					<p><img src=\"http://public.mergeto.pl/Auctions/Weber/dentix_pro_serwety_dentystyczne.png\" width=\"600px\"></p>\n"
				+ "					<img src=\"http://public.mergeto.pl/Auctions/Weber/dentix_pro_kolory.png\" width=\"600px\">\n"
				+ "				</div>\n"
				+ "			</div>\n"
				+ "		</div>\n"
				+ "		]]>\n"
				+ "	</description>\n"
				+ "</product>\n";
		
		return source;
	}

	@Override
	public String toString() {
		return "ModelXml [source=" + source + "]";
	}
	
}

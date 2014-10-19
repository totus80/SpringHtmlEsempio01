package it.html.spring.report;

//Classe ReportGenerator
public class ReportGenerator {

	Report report;

	public Report generate(String data) {
		//report = new TxtReport(); 
		report.generate(data);
		return report;
	}
	
	public void setReport (Report report) {
		this.report = report;
	}
}

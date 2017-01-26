package com.abhi.samples.SpringDemo.setterdi;

public class ReportHelper {
	
	IReportGenerator reportGenerator;
	
	public ReportHelper() {
		
	}
	
	// Injecting Dependency via Constructor Injection
	public ReportHelper(IReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}
	
	public void generateReport() {
		reportGenerator.generateReport();
	}

	// Injecting Dependency via Setter Injection
	public void setReportGenerator(IReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}
	
	
	
}

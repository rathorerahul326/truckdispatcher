package com.dto;

public class Transaction_dto {

	String loadnumber;
	String dispatcher_Commission;
	String gross_after_commission;
	String quickfee;
	String advancedeposit;
	String gross;
	String remainingamount;
	
	public String getRemainingamount() {
		return remainingamount;
	}
	public void setRemainingamount(String remainingamount) {
		this.remainingamount = remainingamount;
	}
	public String getGross() {
		return gross;
	}
	public void setGross(String gross) {
		this.gross = gross;
	}
	public String getLoadnumber() {
		return loadnumber;
	}
	public void setLoadnumber(String loadnumber) {
		this.loadnumber = loadnumber;
	}
	public String getDispatcher_Commission() {
		return dispatcher_Commission;
	}
	public void setDispatcher_Commission(String dispatcher_Commission) {
		this.dispatcher_Commission = dispatcher_Commission;
	}
	public String getGross_after_commission() {
		return gross_after_commission;
	}
	public void setGross_after_commission(String gross_after_commission) {
		this.gross_after_commission = gross_after_commission;
	}
	public String getQuickfee() {
		return quickfee;
	}
	public void setQuickfee(String quickfee) {
		this.quickfee = quickfee;
	}
	public String getAdvancedeposit() {
		return advancedeposit;
	}
	public void setAdvancedeposit(String advancedeposit) {
		this.advancedeposit = advancedeposit;
	}
}

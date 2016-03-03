package com.wipro.bean;

public class Skills 
{
	
	String eid ;
	String WiproTraining[] ;
	String AdditionalTraining[] ;
	float scores;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String[] getWiproTraining() {
		return WiproTraining;
	}
	public void setWiproTraining(String[] wiproTraining) {
		WiproTraining = wiproTraining;
	}
	public String[] getAdditionalTraining() {
		return AdditionalTraining;
	}
	public void setAdditionalTraining(String[] additionalTraining) {
		AdditionalTraining = additionalTraining;
	}
	public float getScores() {
		return scores;
	}
	public void setScores(float scores) {
		this.scores = scores;
	}

}

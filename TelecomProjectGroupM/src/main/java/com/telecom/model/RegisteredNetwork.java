package com.telecom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registerednetwork")

public class RegisteredNetwork {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int NetworkFunctionId;
	private int NfType;
	private int NfStatus;
	private int heartBeatTimer;
	public int getNetworkFunctionId() {
		return NetworkFunctionId;
	}
	public void setNetworkFunctionId(int networkFunctionId) {
		NetworkFunctionId = networkFunctionId;
	}
	public int getNfType() {
		return NfType;
	}
	public void setNfType(int nfType) {
		NfType = nfType;
	}
	public int getNfStatus() {
		return NfStatus;
	}
	public void setNfStatus(int nfStatus) {
		NfStatus = nfStatus;
	}
	public int getHeartBeatTimer() {
		return heartBeatTimer;
	}
	public void setHeartBeatTimer(int heartBeatTimer) {
		this.heartBeatTimer = heartBeatTimer;
	}
	@Override
	public String toString() {
		return "RegisteredNetwork [NetworkFunctionId=" + NetworkFunctionId + ", NfType=" + NfType + ", NfStatus="
				+ NfStatus + ", heartBeatTimer=" + heartBeatTimer + "]";
	}

	
	

}

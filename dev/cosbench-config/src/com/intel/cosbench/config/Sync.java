package com.intel.cosbench.config;

import java.util.List;
import java.util.Map;


public class Sync {
	private Storage storage;   
	private Qos qos;
    private String srcBucketName;
    private String destBucketName;
    private List<String> objs;
    private long lastSyncStartTime;
    private String configurationSync;
    
	public Storage getSyncStorage() {
		return storage;
	}
	public void setSyncStorage(Storage storage) {
		this.storage = storage;
	}
	
	public Qos getQos() {
		return qos;
	}
	public void setQos(Qos qos) {
		this.qos = qos;
	}
	public String getSrcBucketName() {
		return srcBucketName;
	}
	public void setSrcBucketName(String srcBucketName) {
		this.srcBucketName = srcBucketName;
	}
	public String getDestBucketName() {
		return destBucketName;
	}
	public void setDestBucketName(String destBucketName) {
		this.destBucketName = destBucketName;
	}
	public List<String> getObjs() {
		return objs;
	}
	public void setObjs(List<String> objs) {
		this.objs = objs;
	}
	public long getLastSyncStartTime() {
		return lastSyncStartTime;
	}
	public void setLastSyncStartTime(long lastSyncStartTime) {
		this.lastSyncStartTime = lastSyncStartTime;
	}

	public String getConfigurationSync() {
		return configurationSync;
	}
	public void setConfigurationSync(String configurationSync) {
		this.configurationSync = configurationSync;
	}
}

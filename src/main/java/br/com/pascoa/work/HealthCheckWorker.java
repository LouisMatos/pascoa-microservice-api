package br.com.pascoa.work;

import org.slf4j.MDC;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HealthCheckWorker implements Work {

	private String xReqID;

	public HealthCheckWorker() {
		setupLogMDC();
	}

	@Override
	public void run() {
		MDC.put("requestId", xReqID);
		log.info("Status: Up");
	}

	private void setupLogMDC() {
		if (MDC.get("requestId") != null) {
			xReqID = MDC.get("requestId");
		}
	}

}

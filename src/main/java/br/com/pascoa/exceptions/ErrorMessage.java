package br.com.pascoa.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ErrorMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7587251597929628564L;

	private int statusCode;
	private Date timestamp;
	private String message;
	private String description;

	public ErrorMessage(int statusCode, Date timestamp, String message, String description) {
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDescription() {
		return description;
	}

//	public ErrorMessage(String message, List<String> details) {
//        super();
//        this.message = message;
//        this.details = details;
//    }
// 
//    //General error message about nature of error
//    private String message;
// 
//    //Specific errors in API request processing
//    private List<String> details;
// 
//    //Getter and setters
//	
//	
////	
////	public ErrorMessage(String code, String message) {
////		super();
////		this.returnCode = code;
//		this.returnMessage = message;
//	}

//	public ErrorMessage(String code, List<String> details) {
//		super();
//		this.returnCode = code;
//		this.error = details;
//	}
//
//	@JsonProperty("code")
//	private String returnCode;
//
//	@JsonProperty("description")
//	private String returnMessage;
//
//	@JsonProperty("description")
//	private List<String> error;

}

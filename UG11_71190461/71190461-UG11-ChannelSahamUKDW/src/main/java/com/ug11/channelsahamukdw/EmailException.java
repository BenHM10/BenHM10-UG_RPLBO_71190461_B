package com.ug11.channelsahamukdw;

public class EmailException {
    private String errorMessage;
    private String errorCode;

    public String getErrorMessage() {
        return errorMessage;
    }

    public EmailException(String errorMessage, String errorCode){
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }
}

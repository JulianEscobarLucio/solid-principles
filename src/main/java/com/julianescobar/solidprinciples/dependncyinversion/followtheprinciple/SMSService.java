package com.julianescobar.solidprinciples.dependncyinversion.followtheprinciple;

public class SMSService implements MessageService {
  @Override
  public String getMessage() {
    return "This is an SMS message";
  }
}

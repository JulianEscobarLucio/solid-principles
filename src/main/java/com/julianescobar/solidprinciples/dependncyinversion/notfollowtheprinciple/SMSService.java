package com.julianescobar.solidprinciples.dependncyinversion.notfollowtheprinciple;

import com.julianescobar.solidprinciples.dependncyinversion.followtheprinciple.MessageService;

public class SMSService implements MessageService {
  @Override
  public String getMessage() {
    return "This is an SMS message";
  }
}

package com.julianescobar.solidprinciples.dependncyinversion.notfollowtheprinciple;

import com.julianescobar.solidprinciples.dependncyinversion.followtheprinciple.MessageService;

public class EmailService implements MessageService {
  @Override
  public String getMessage() {
    return "this is an email message";
  }
}

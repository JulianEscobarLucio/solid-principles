package com.julianescobar.solidprinciples.dependncyinversion.followtheprinciple;

public class EmailService implements MessageService {
  @Override
  public String getMessage() {
    return "this is an email message";
  }
}

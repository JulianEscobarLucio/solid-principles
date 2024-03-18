package com.julianescobar.solidprinciples.dependncyinversion.notfollowtheprinciple;

import com.julianescobar.solidprinciples.dependncyinversion.followtheprinciple.MessageService;

public class MessageClient {
  private final MessageService messageService;

  public MessageClient() {
    this.messageService = new EmailService();
  }

  public void processMessage() {
     String message = messageService.getMessage();
    System.out.println("Processing message: " + message);
  }
}


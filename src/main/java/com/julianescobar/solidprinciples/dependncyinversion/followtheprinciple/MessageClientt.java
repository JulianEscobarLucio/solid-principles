package com.julianescobar.solidprinciples.dependncyinversion.followtheprinciple;

public class MessageClientt {
  private final MessageService messageService;


  public MessageClientt(MessageService messageService) {
    this.messageService = messageService;
  }

  public void processMessage() {
     String message = messageService.getMessage();
    System.out.println("Processing message: " + message);
  }
}


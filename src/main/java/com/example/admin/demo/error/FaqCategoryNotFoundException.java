package com.example.admin.demo.error;

public class FaqCategoryNotFoundException extends RuntimeException {
  public FaqCategoryNotFoundException(Long faqId) {
    super("Not Found : " + faqId);
  }

  public FaqCategoryNotFoundException(String message) {
    super(message);
  }
}
package com.example.admin.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import javax.validation.constraints.NotNull;
import java.util.List;


public class CommonDto {

  @Getter
  @Setter
  public static class UpdateExposeRequest {

    @NotNull
    private Boolean expose;
  }

  @Getter
  public static class PageResponse<T> {

    private long totalElements;
    private int totalPages;
    private List<T> contents;

    public PageResponse(final Page<T> page) {
      this.totalElements = page.getTotalElements();
      this.totalPages = page.getTotalPages();
      this.contents = page.getContent();
    }

  }
}

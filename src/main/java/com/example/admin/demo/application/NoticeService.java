package com.example.admin.demo.application;

import com.example.admin.demo.dto.NoticeDto;

public interface NoticeService {

  void createNotice(NoticeDto.CreateNoticeRequest request);
}

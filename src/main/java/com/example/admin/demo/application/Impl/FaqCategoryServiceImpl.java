package com.example.admin.demo.application.Impl;

import com.example.admin.demo.application.FaqCategoryGroupService;
import com.example.admin.demo.application.FaqCategoryService;
import com.example.admin.demo.application.error.FaqCategoryNotFoundException;
import com.example.admin.demo.domain.FaqCategory;
import com.example.admin.demo.domain.FaqCategoryGroup;
import com.example.admin.demo.dto.FaqCategoryDto;
import com.example.admin.demo.repository.FaqCategoryRepository;
import com.example.admin.demo.repository.FaqCategoryRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class FaqCategoryServiceImpl implements FaqCategoryService {

  private final FaqCategoryRepository faqCategoryRepository;
  private final FaqCategoryGroupService faqCategoryGroupService;

//  public Page<FaqCategoryDto.ListFaqCategoryResponse> listFaqCategory() {
//    return FaqCategoryDto.ListFaqCategoryResponse.of(faqCategoryRepository.findAll());
//  }

  public FaqCategoryDto.DetailFaqCategoryResponse detailFaqCategory(final Long faqCategoryGroupId, final Long faqId) {
    FaqCategoryGroup faqCategoryGroup = faqCategoryGroupService.getFaqCategoryGroupById(faqCategoryGroupId);
    FaqCategory faqCategory = getFaqCategory(faqId);

    return FaqCategoryDto.DetailFaqCategoryResponse.of(faqCategoryGroup, faqCategory);
  }

  public void createFaqCategory(final Long faqCategoryGroupId, final FaqCategoryDto.CreateFaqCategoryRequest request) {
    FaqCategoryGroup faqCategoryGroup = faqCategoryGroupService.getFaqCategoryGroupById(faqCategoryGroupId);
    FaqCategory faqCategory = FaqCategory.builder()
        .faqCategoryGroup(faqCategoryGroup)
        .title(request.getTitle())
        .content(request.getContent())
        .build();

    FaqCategoryDto.CreateFaqCategoryResponse.of(faqCategoryRepository.save(faqCategory));
  }

  public void deleteFaqCategory(Long faqId) {
    FaqCategory faqCategory = getFaqCategory(faqId);

    faqCategoryRepository.delete(faqCategory);
  }

  @Override
  public List<FaqCategoryDto.ListFaqCategoryResponse> listFaqCategory(FaqCategoryDto.SearchConditionRequestDto request, Pageable pageable) {
    return faqCategoryRepository.findAllFaqCategoryBy(request, pageable);
  }


  public FaqCategory getFaqCategory(final Long faqId) {
    return faqCategoryRepository.findById(faqId)
        .orElseThrow(() -> new FaqCategoryNotFoundException(faqId));
  }

}

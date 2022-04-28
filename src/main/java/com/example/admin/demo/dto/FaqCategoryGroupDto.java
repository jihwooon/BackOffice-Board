//TODO : 페이징 처리 할때 카운트 갯수도 넘겨줘야 프론트에서 작업이 가능하다.
package com.example.admin.demo.dto;

import com.example.admin.demo.domain.FaqCategoryGroup;
import com.example.admin.demo.domain.FaqType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FaqCategoryGroupDto {

  @Getter
  public static class ListFaqCategoryGroupResponse {

    private Long id;
    private String title;
    private LocalDateTime modifiedDate;

    public ListFaqCategoryGroupResponse(FaqCategoryGroup faqCategoryGroup) {
      this.id = faqCategoryGroup.getId();
      this.title = faqCategoryGroup.getTitle();
      this.modifiedDate = faqCategoryGroup.getModifiedDate();
    }

    public static ListFaqCategoryGroupResponse of(final FaqCategoryGroup faqCategoryGroups) {
      return new ListFaqCategoryGroupResponse(faqCategoryGroups);
    }

    public static List<ListFaqCategoryGroupResponse> of(final Page<FaqCategoryGroup> faqCategoryGroups) {
      faqCategoryGroups.getTotalElements();
      return faqCategoryGroups.stream()
          .map(o -> new ListFaqCategoryGroupResponse(o))
          .collect(Collectors.toList());
    }

  }

  @Getter
  @Setter
  public static class CreateFaqCategoryGroupRequest {

    @NotBlank(message = "등록할 카테고리의 이름을 입력하세요")
    private String title;

    @NotNull
    private FaqType faqType;
  }

  @Getter
  public static class CreateFaqCategoryGroupResponse {
    private String title;
    private LocalDateTime createTime;
    private FaqType faqType;

    public CreateFaqCategoryGroupResponse(final FaqCategoryGroup faqCategoryGroup) {
      this.title = faqCategoryGroup.getTitle();
      this.createTime = faqCategoryGroup.getCreateTime();
      this.faqType = faqCategoryGroup.getFaqType();
    }

    public static CreateFaqCategoryGroupResponse of(final FaqCategoryGroup faqCategoryGroup) {
      return new CreateFaqCategoryGroupResponse(faqCategoryGroup);
    }

  }

  @Getter
  @Setter
  public static class UpdateFaqCategoryRequest {

    @NotBlank(message = "등록할 카테고리의 이름을 입력하세요")
    private String title;
  }

  @Getter
  public static class UpdateFaqCategoryGroupResponse {
    private String title;
    private LocalDateTime modifiedDate;

    public UpdateFaqCategoryGroupResponse(final FaqCategoryGroup faqCategoryGroup) {
      this.title = faqCategoryGroup.getTitle();
      this.modifiedDate = faqCategoryGroup.getModifiedDate();
    }

    public static UpdateFaqCategoryGroupResponse of(final FaqCategoryGroup faqCategoryGroup) {
      return new UpdateFaqCategoryGroupResponse(faqCategoryGroup);
    }
  }

}

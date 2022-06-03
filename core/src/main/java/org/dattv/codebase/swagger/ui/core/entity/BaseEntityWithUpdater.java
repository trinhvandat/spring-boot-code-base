package org.dattv.codebase.swagger.ui.core.entity;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntityWithUpdater extends BaseEntity{

    @LastModifiedBy
    @Column(name = "last_updated_by")
    private Integer lastUpdatedBy;

    @LastModifiedDate
    @Column(name = "last_updated_at")
    private LocalDateTime lastUpdatedAt;
}

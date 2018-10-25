package net.hawkeye.model.entity.domain;

import lombok.*;
import net.hawkeye.model.entity.base.BaseEntity;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
@Document(collection = "typeAdd")
public class TypeAddEntity extends BaseEntity {

    @TextIndexed
    private String name;
    private String description;


}

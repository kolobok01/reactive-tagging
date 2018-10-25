package net.hawkeye.model.entity.application;

import lombok.*;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
@Document(collection = "typeAdd")
public class AddEntity {

    @TextIndexed
    private String url;
    private String title;
    private String tags;
    private String sid;
}

package com.example.s3.api.assembler;

import com.example.s3.api.model.EbookModel;
import com.example.s3.domain.model.Ebook;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EbookModelAssembler {

    public EbookModel toModel(Ebook ebook) {
        EbookModel.EbookModelBuilder builder = EbookModel.builder()
                .id(ebook.getId())
                .author(ebook.getAutor())
                .title(ebook.getTitle());
        return builder.build();
    }
}

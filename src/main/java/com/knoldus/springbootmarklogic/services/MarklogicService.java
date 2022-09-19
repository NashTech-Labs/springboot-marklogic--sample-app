package com.knoldus.springbootmarklogic.services;

import com.knoldus.springbootmarklogic.model.SampleDocument;
import com.knoldus.springbootmarklogic.model.SampleDocumentSearchResult;

public interface MarklogicService {
    void addSampleDocument(SampleDocument sampleDocument);
    void remove(Long id);
    SampleDocumentSearchResult findAll(int page, int pageSize);
    SampleDocument findById(Long id);
    Long count();
    SampleDocumentSearchResult findByName(String name);
}

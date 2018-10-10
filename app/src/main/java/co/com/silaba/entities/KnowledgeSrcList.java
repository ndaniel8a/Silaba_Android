package co.com.silaba.entities;

import java.util.List;

public class KnowledgeSrcList {

    private List<KnowledgeSource> knowledgeSources;

    private int count() {
        return knowledgeSources != null ? knowledgeSources.size() : 0;
    }

    public List<KnowledgeSource> getKnowledgeSources() {
        return knowledgeSources;
    }

    public void setKnowledgeSources(List<KnowledgeSource> knowledgeSources) {
        this.knowledgeSources = knowledgeSources;
    }
}

package co.com.silaba.entities;

import java.util.ArrayList;
import java.util.List;

public class MachineLearning {

    private String identificador;

    private String identifier;

    private Float confidence;

    private List<VideoList> videoList;

    private String model;


    public MachineLearning() {
        this.identificador = "";
        this.identifier = "";
        this.model = "";
        this.confidence = 0f;
        this.videoList = new ArrayList<VideoList>();
    }

    public MachineLearning(String identificador, String identifier, Float confidence, List<VideoList> videoList, String model) {
        this.identificador = identificador;
        this.identifier = identifier;
        this.confidence = confidence;
        this.videoList = videoList;
        this.model = model;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public List<?> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<VideoList> videoList) {
        this.videoList = videoList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

package co.com.silaba.services.machinelearning;

public interface MachineLearningService {
  
  
  //TODO: init(with useModel: String)
  
  public abstract MachineLearningServiceResult clasificate(MachineLearningServicePhotoSearchData data) throws MachineLearningServiceException;
  
  public abstract void theModel(String tModel) throws MachineLearningServiceException;
   

}

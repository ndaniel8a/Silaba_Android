package co.com.silaba.services.translator;

public interface TranslatorService {

  public abstract TranslateServiceResult translate( TranslateSearchData inputData) throws TranslateServiceException;
  
}

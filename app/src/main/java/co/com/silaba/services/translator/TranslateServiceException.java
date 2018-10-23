package co.com.silaba.services.translator;


public class TranslateServiceException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = -8323272267903731895L;

  public enum TranslateServiceExceptionType {
    NOT_TRANSLATION;
  }
  
  private TranslateServiceExceptionType type;

  public TranslateServiceException(TranslateServiceExceptionType type, String message) {
    super(message);
    this.type = type;
  }

  public TranslateServiceExceptionType getType() {
    return type;
  }

  public void setType(TranslateServiceExceptionType type) {
    this.type = type;
  }
  
}

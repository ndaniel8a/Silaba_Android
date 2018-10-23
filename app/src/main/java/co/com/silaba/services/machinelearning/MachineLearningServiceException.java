package co.com.silaba.services.machinelearning;


public class MachineLearningServiceException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 8177066315684396632L;

  public enum MachineLearningServiceExceptionType {
    NOT_LOAD_IMAGE,
    NOT_LEARNING_MODEL,
    NOT_RECONIZED;
  }
  
  private MachineLearningServiceExceptionType type;

  public MachineLearningServiceException(MachineLearningServiceExceptionType type, String message) {
    super(message);
    this.type = type;
  }

  public MachineLearningServiceExceptionType getType() {
    return type;
  }

  public void setType(MachineLearningServiceExceptionType type) {
    this.type = type;
  }
  
}

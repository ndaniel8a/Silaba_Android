package co.com.silaba.services.machinelearning;

import co.com.silaba.entities.MachineLearningList;

public class MachineLearningServiceResult {

  private MachineLearningList machineLearningList;

  private Boolean success;

  public MachineLearningList getMachineLearningList() {
    return machineLearningList;
  }

  public void setMachineLearningList(MachineLearningList machineLearningList) {
    this.machineLearningList = machineLearningList;
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

}

package co.com.silaba.entities;

import java.util.ArrayList;
import java.util.List;

public class MachineLearningList {

    private List<MachineLearning> machineLearningList;

    public MachineLearningList () {
        this.machineLearningList = new ArrayList<>();
    }
    
    public List<MachineLearning> getMachineLearningList() {
      return machineLearningList;
    }

    public void setMachineLearningList(List<MachineLearning> machineLearningList) {
      this.machineLearningList = machineLearningList;
    }

    public int getCount() {
        return (this.machineLearningList == null) ? 0 : this.machineLearningList.size();
    }

    public String getBestIdentifier() {
        if( this.machineLearningList != null && ! this.machineLearningList.isEmpty()  ) {
            if( this.machineLearningList.size() > 1 && this.machineLearningList.get(1).getIdentifier().compareTo(this.machineLearningList.get(0).getIdentifier()) > 0 ) {
                return machineLearningList.get(1).getIdentifier();
            } else {
                return machineLearningList.get(0).getIdentifier();
            }
        }

        return null;
    }

    public Float getBestConfidence() {
        if( this.machineLearningList != null && ! this.machineLearningList.isEmpty()  ) {
            if( this.machineLearningList.size() > 1 && this.machineLearningList.get(1).getConfidence().compareTo(this.machineLearningList.get(0).getConfidence()) > 0 ) {
                return machineLearningList.get(1).getConfidence();
            } else {
                return machineLearningList.get(0).getConfidence();
            }
        }

        return null;
    }

    public String getMejorIdenticador() {
        if( this.machineLearningList != null && ! this.machineLearningList.isEmpty()  ) {
            if( this.machineLearningList.size() > 1 && this.machineLearningList.get(1).getConfidence().compareTo(this.machineLearningList.get(0).getConfidence()) > 0 ) {
                if( this.machineLearningList.get(1).getIdentificador().compareTo("0") > 0 ) {
                    return this.machineLearningList.get(1).getIdentificador();
                } else {
                    return this.machineLearningList.get(1).getIdentifier();
                }
            } else {
                if( this.machineLearningList.get(0).getIdentificador().compareTo("0") > 0 ) {
                    return this.machineLearningList.get(0).getIdentificador();
                } else {
                    return this.machineLearningList.get(0).getIdentifier();
                }
            }
        }

        return null;
    }

    public MachineLearning suscribe(int index) {
        if( index >= 0 && this.machineLearningList != null && ! this.machineLearningList.isEmpty()  ) {
            return this.machineLearningList.get(index);
        }

        return  null;
    }

}

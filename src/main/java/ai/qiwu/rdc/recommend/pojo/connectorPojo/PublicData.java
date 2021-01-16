package ai.qiwu.rdc.recommend.pojo.connectorPojo;

import java.util.List;

/**
 * 中转使用
 * @author hjd
 */
public class PublicData {
    private List<String> labels;
    private List<PublicWorks> works;

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<PublicWorks> getWorks() {
        return works;
    }

    public void setWorks(List<PublicWorks> works) {
        this.works = works;
    }
}

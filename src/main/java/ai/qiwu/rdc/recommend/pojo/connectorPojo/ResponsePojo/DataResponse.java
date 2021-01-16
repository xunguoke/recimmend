package ai.qiwu.rdc.recommend.pojo.connectorPojo.ResponsePojo;

import java.util.List;

/**
 * @author hjd
 * 封装作品数据
 */

public class DataResponse {
    private List<String> labels;
    private List<WorksPojo> works;

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<WorksPojo> getWorks() {
        return works;
    }

    public void setWorks(List<WorksPojo> works) {
        this.works = works;
    }
}

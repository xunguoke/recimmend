package ai.qiwu.rdc.recommend.pojo.connectorPojo.ResponsePojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *用于存储需要返回的作品列表以及返回信息
 * @author hjd
 */
@Getter
@Setter
public class ReturnedMessages {
    /**
     * 作品列表
     */
    private String worksList;
    /**
     * 作品信息
     */
    private String workInformation;
    /**
     * 作品名集合
     */
    private List<String> worksName;

    public String getWorksList() {
        return worksList;
    }

    public void setWorksList(String worksList) {
        this.worksList = worksList;
    }

    public String getWorkInformation() {
        return workInformation;
    }

    public void setWorkInformation(String workInformation) {
        this.workInformation = workInformation;
    }

    public List<String> getWorksName() {
        return worksName;
    }

    public void setWorksName(List<String> worksName) {
        this.worksName = worksName;
    }
}

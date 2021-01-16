package ai.qiwu.rdc.recommend.pojo.connectorPojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 中转使用
 * @author hjd
 */
@Getter
@Setter
public class PublicWorks {
    private String name;
    private String ttsName;
    private String seriesName;
    private String nicknames;
    private String intro;
    private String authorName;
    private int watch;
    private String preface;
    private String difficulty;
    private List<String> suitCrowds;
    private int startAge;
    private int stopAge;
    private Double score;
    private boolean free;
    private int plotCount;
    private String audioType;
    private List<String> labels;
    private String gmtApply;
    private String botAccount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTtsName() {
        return ttsName;
    }

    public void setTtsName(String ttsName) {
        this.ttsName = ttsName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getNicknames() {
        return nicknames;
    }

    public void setNicknames(String nicknames) {
        this.nicknames = nicknames;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getWatch() {
        return watch;
    }

    public void setWatch(int watch) {
        this.watch = watch;
    }

    public String getPreface() {
        return preface;
    }

    public void setPreface(String preface) {
        this.preface = preface;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public List<String> getSuitCrowds() {
        return suitCrowds;
    }

    public void setSuitCrowds(List<String> suitCrowds) {
        this.suitCrowds = suitCrowds;
    }

    public int getStartAge() {
        return startAge;
    }

    public void setStartAge(int startAge) {
        this.startAge = startAge;
    }

    public int getStopAge() {
        return stopAge;
    }

    public void setStopAge(int stopAge) {
        this.stopAge = stopAge;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public int getPlotCount() {
        return plotCount;
    }

    public void setPlotCount(int plotCount) {
        this.plotCount = plotCount;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String getGmtApply() {
        return gmtApply;
    }

    public void setGmtApply(String gmtApply) {
        this.gmtApply = gmtApply;
    }

    public String getBotAccount() {
        return botAccount;
    }

    public void setBotAccount(String botAccount) {
        this.botAccount = botAccount;
    }
}

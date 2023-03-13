package com.org.model;

import java.util.Date;

public class Diary {
    private Integer typeId=-1;

    private Integer diaryId;
    private String title;
    private String content;
    private Date releaseDate;
    private String releaseDateStr;
    private Integer diaryCount;
    private String typeName;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseDateStr() {
        return releaseDateStr;
    }

    public void setReleaseDateStr(String releaseDateStr) {
        this.releaseDateStr = releaseDateStr;
    }

    public Integer getDiaryCount() {
        return diaryCount;
    }

    public void setDiaryCount(Integer diaryCount) {
        this.diaryCount = diaryCount;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "typeId=" + typeId +
                ", diaryId=" + diaryId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", releaseDate=" + releaseDate +
                ", releaseDateStr='" + releaseDateStr + '\'' +
                ", diaryCount=" + diaryCount +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}

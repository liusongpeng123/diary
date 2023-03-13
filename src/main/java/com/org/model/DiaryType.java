package com.org.model;

public class DiaryType {
    private Integer diaryTypeId;
    private String typeName;
    private Integer diaryCount;

    public Integer getDiaryTypeId() {
        return diaryTypeId;
    }

    public void setDiaryTypeId(Integer diaryTypeId) {
        this.diaryTypeId = diaryTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getDiaryCount() {
        return diaryCount;
    }

    public void setDiaryCount(Integer diaryCount) {
        this.diaryCount = diaryCount;
    }

    @Override
    public String toString() {
        return "DiaryType{" +
                "diaryTypeId=" + diaryTypeId +
                ", typeName='" + typeName + '\'' +
                ", diaryCount=" + diaryCount +
                '}';
    }
}

package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ANSWER")
public class Answer extends BaseModel {
    @Column(name = "content")
    private String content;

    @Column(name = "owner_id")
    private Long owner_id;

    @OneToMany(mappedBy = "answer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Voice> voiceList = new ArrayList<>();

    public Answer()
    {
    }

    public Long getOwner_id()
    {
        return owner_id;
    }

    public void setOwner_id(Long owner_id)
    {
        this.owner_id = owner_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Voice> getVoiceList()
    {
        return voiceList;
    }

    public void setVoiceList(List<Voice> voiceList)
    {
        this.voiceList = voiceList;
    }
}

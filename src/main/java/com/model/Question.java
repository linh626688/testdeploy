package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "QUESTION")
public class Question extends BaseModel {
    @Column(name = "content")
    private String content;

    @Column(name = "status")
    private boolean status;

    @Column(name = "is_replied ")
    private boolean is_replied;

    @Column(name = "url")
    private boolean url;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "answer_id")
    private Answer answer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User user;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Voice> voiceList = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isIs_replied() {
        return is_replied;
    }

    public void setIs_replied(boolean is_replied) {
        this.is_replied = is_replied;
    }

    public boolean isUrl() {
        return url;
    }

    public void setUrl(boolean url) {
        this.url = url;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

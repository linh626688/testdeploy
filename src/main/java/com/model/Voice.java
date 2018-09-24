package com.model;

import javax.persistence.*;

@Entity
@Table(name = "VOICE")
public class Voice extends BaseModel
{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "answer_id")
    private Answer answer;


    @Column(name = "status")
    private boolean status;

    @Column(name = "url_resources")
    private String urlResources;

    @Column(name = "provider")
    private String provider;


    public Question getQuestion()
    {
        return question;
    }

    public void setQuestion(Question question)
    {
        this.question = question;
    }

    public Answer getAnswer()
    {
        return answer;
    }

    public void setAnswer(Answer answer)
    {
        this.answer = answer;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public String getUrlResources()
    {
        return urlResources;
    }

    public void setUrlResources(String urlResources)
    {
        this.urlResources = urlResources;
    }

    public String getProvider()
    {
        return provider;
    }

    public void setProvider(String provider)
    {
        this.provider = provider;
    }
}

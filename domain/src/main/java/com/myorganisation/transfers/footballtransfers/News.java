package com.myorganisation.transfers.footballtransfers;

import java.time.LocalDateTime;

public class News {

    private Integer id;

    private String playerName;

    private String source;

    private String comments;

    private LocalDateTime timestamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", playerName='" + playerName + '\'' +
                ", source='" + source + '\'' +
                ", comments='" + comments + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

}
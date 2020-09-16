package com.myorganisation.transfers.footballtransfers.manager;

import com.myorganisation.transfers.footballtransfers.News;
import com.myorganisation.transfers.footballtransfers.dao.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class NewsManagerImpl implements NewsManager{

    @Autowired
    private NewsDao newsDao;

    @Override
    public void saveNews() {
        News news = new News();
        news.setPlayerName("Lionel Messi");
        news.setSource("Twitter");
        news.setComments("To Manchester City");
        news.setTimestamp(LocalDateTime.now());
        newsDao.saveNews(news);
    }
}

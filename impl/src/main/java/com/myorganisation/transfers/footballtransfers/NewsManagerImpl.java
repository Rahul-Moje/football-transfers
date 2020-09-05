package com.myorganisation.transfers.footballtransfers;

import org.springframework.stereotype.Component;

@Component
public class NewsManagerImpl implements NewsManager {

    private NewsDao newsDao;

    public NewsManagerImpl(NewsDao newsDao) {
        this.newsDao = newsDao;
    }

    @Override
    public void saveNews(News news) {
        newsDao.saveNews(news);
    }
}

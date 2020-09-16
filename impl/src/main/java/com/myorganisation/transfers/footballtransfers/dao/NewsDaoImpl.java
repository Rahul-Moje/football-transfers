package com.myorganisation.transfers.footballtransfers.dao;

import com.myorganisation.transfers.footballtransfers.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class NewsDaoImpl implements NewsDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void saveNews(News news) {
        String query = "INSERT INTO NEWS(PLAYERNAME,SOURCE,COMMENTS,TIMESTAMP) VALUES (:PLAYERNAME,:SOURCE,:COMMENTS,:TIMESTAMP)";
        MapSqlParameterSource parameterSource =  new MapSqlParameterSource();
        parameterSource.addValue("PLAYERNAME",news.getPlayerName());
        parameterSource.addValue("SOURCE", news.getSource());
        parameterSource.addValue("COMMENTS",news.getComments());
        parameterSource.addValue("TIMESTAMP",news.getTimestamp());
        namedParameterJdbcTemplate.update(query,parameterSource);
    }
}

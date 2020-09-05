package com.myorganisation.transfers.footballtransfers;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class NewsDaoImpl implements NewsDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public NewsDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public void saveNews(News news) {
        String query = "INSERT INTO NEWS(PLAYER_NAME,SOURCE,COMMENTS,TIMESTAMP) VALUES(:PLAYER_NAME,:SOURCE,:COMMENTS,:TIMESTAMP)";
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("PLAYER_NAME", news.getPlayerName());
        parameterSource.addValue("SOURCE", news.getSource());
        parameterSource.addValue("COMMENTS", news.getComments());
        parameterSource.addValue("TIMESTAMP", news.getTimestamp());
        namedParameterJdbcTemplate.update(query,parameterSource);
    }
}

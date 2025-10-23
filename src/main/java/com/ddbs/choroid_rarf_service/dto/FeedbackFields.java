package com.ddbs.choroid_rarf_service.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeedbackFields {

    private final StringBuilder sql = new StringBuilder("UPDATE rarf SET ");
    private final List<Object> updateParams = new ArrayList<>();
    private final StringBuilder whereClause = new StringBuilder("WHERE session_id = ? AND user_id = ?");
    private boolean firstField = true;

    public void addField(String fieldName, Object value)
    {
        if (!firstField) {
            sql.append(", ");
        }
        sql.append(fieldName).append(" = ?");
        updateParams.add(value);
        firstField = false;
    }

    public String getSql()
    {
        sql.append(" ").append(whereClause);
        log.debug(sql.toString());
        return sql.toString();
    }

    public Object[] getUpdateParams(Object sessionId, Object userId)
    {
        updateParams.add(sessionId);
        updateParams.add(userId);
        log.debug(updateParams.toString());
        return updateParams.toArray();
    }
}

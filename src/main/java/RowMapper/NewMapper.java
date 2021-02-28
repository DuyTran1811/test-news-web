package RowMapper;

import model.NewModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewMapper implements RowMapper<NewModel> {
    @Override
    public NewModel mapRow(ResultSet rs) {
        NewModel newModel = new NewModel();
        try {
            newModel.setId(rs.getLong("id"));
            newModel.setTitle(rs.getString("title"));
            newModel.setContent(rs.getString("content"));
            newModel.setCategoryId(rs.getLong("categoryid"));
            newModel.setThumbnail(rs.getString("thumbnail"));
            newModel.setShortDescription(rs.getString("shortdescription"));
            newModel.setCreateDate(rs.getTimestamp("createddate"));
            newModel.setCreatedBy(rs.getString("createdby"));
            if (rs.getTimestamp("modifieddate") != null) {
                newModel.setModifiedDate(rs.getTimestamp("modifieddate"));
            }
            if (rs.getString("modifiedby") != null) {
                newModel.setModifiedBy(rs.getString("modifiedby"));
            }
            return newModel;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

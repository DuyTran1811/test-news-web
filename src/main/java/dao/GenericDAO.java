package dao;

import javax.swing.tree.RowMapper;
import java.util.List;

public interface GenericDAO<T> {
    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
}

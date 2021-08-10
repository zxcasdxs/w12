package org.zerock.w1.dao;

import org.zerock.db.util.JdbcTemplate;
import org.zerock.w1.dto.StoreDTO;

public class StoreDAO {

    public void insert(StoreDTO storeDTO) throws RuntimeException {

        String sql = "insert into tbl_store (name,area,menus,link) values (?,?,?,?)";

        new JdbcTemplate() {
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, storeDTO.getName());
                preparedStatement.setString(2, storeDTO.getArea());
                preparedStatement.setString(3, storeDTO.getMenus());
                preparedStatement.setString(4, storeDTO.getLink());

                preparedStatement.executeUpdate();
            }
        }.makeAll();


    }


}

package kz.pompei.colon.register.db_client_pg.dao;

import java.util.Optional;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProbeClientDao {
  @SuppressWarnings("unused")
  @Select("select * from boi.node_mirror where company_id = #{companyId} and node_id = #{id.id} for update")
  Optional<String> selectNodeMirror(@Param("companyId") String companyId, @Param("id") String id);

  @SuppressWarnings("UnusedReturnValue")
  String selectClientRecordById(@Param("clientId") String clientId);
}

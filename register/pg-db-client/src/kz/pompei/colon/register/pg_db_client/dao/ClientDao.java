package kz.pompei.colon.register.pg_db_client.dao;

import java.util.Optional;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ClientDao {
  @SuppressWarnings("unused")
  @Select("select * from boi.node_mirror where company_id = #{companyId} and node_id = #{id.id} for update")
  Optional<String> selectNodeMirror(@Param("companyId") String companyId, @Param("id") String id);

  @SuppressWarnings("UnusedReturnValue")
  String selectClientRecordById(@Param("clientId") String clientId);
}

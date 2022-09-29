package kz.pompei.colon.register.client_impl.dao;

import kz.pompei.colon.model.client.ClientRecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ClientDao {

  @Select("select id, surname, name, patronymic from client.client where id = #{id}")
  ClientRecord loadById(@Param("id") String id);

}
